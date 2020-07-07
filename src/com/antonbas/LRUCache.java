package com.antonbas;

import java.util.HashMap;

public class LRUCache {

    private class Entry {
        int key;
        int value;
        Entry left;
        Entry right;
        Entry(int key, int value, Entry left, Entry right) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    private int capacity;
    private HashMap<Integer, Entry> data;
    private Entry start, end;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.data = new HashMap<>();
    }

    public int get(int key) {
        if (data.containsKey(key)) {
            Entry entry = data.get(key);
            removeEntry(entry);
            addTop(entry);
            return entry.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (data.containsKey(key)) {
            Entry node = data.get(key);
            node.value = value;
            removeEntry(node);
            addTop(node);
        }
        else {
            Entry node = new Entry(key, value, null, null);
            if (data.size() == capacity) {
                data.remove(end.key);
                removeEntry(end);

            }
            addTop(node);
            data.put(key, node);

        }
    }

    private void removeEntry(Entry node) {
        if (node.left != null) {
            node.left.right = node.right;
        }
        else {
            start = node.right;
        }

        if (node.right != null) {
            node.right.left = node.left;
        }
        else
        {
            end = node.left;
        }
    }

    private void addTop(Entry node) {
        node.right = start;
        node.left = null;
        start = node;
        if (end == null) {
            end = start;
        }
    }
}
