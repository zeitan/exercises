package com.antonbas;

import com.sun.istack.internal.Nullable;

import java.util.HashMap;
import java.util.Map;

public class eHealthKVStore<T,M> {
    private Map<T, Entry<M>> elements;
    private final  int maxSize;

    public eHealthKVStore(int maxSize) {
        elements = new HashMap<>();
        this.maxSize = maxSize;
    }

    @Nullable
    public Entry<M> get(T key) {
        Entry<M> entry = elements.getOrDefault(key, null);
        if (entry != null) {
            long currentTime = System.nanoTime();
            if (currentTime <= entry.getExpirationTime())
                return entry;
            else {
                elements.remove(key);
                return null;
            }
        }
        return null;
    }

    public void put(T key, Entry<M> value) throws Exception  {
        if(elements.size() < maxSize)
            elements.put(key, value);
        else
            throw new Exception("max size reached");
    }

    public void purge() {
        long currentTime = System.nanoTime();
        elements.entrySet().stream()
                .filter(element -> element.getValue().getExpirationTime() <= currentTime )
                .forEach( element -> delete(element.getKey()));
    }

    @Nullable
    public Entry<M> delete(T key) {
        if (elements.containsKey(key))
            return elements.remove(key);
        else
            return null;

    }


    static class Entry<M>
    {
        private  final M value;
        private final long expirationTime;

        public Entry(M value, long expirationTime) {
            this.value = value;
            this.expirationTime = expirationTime;
        }

        public M getValue() {
            return value;
        }

        public long getExpirationTime() {
            return expirationTime;
        }

    }


}
