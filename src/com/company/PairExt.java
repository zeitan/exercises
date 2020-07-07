package com.company;

public class PairExt<T>
{
    private final int position;
    private T value;

    public PairExt(int position, T value) {
        this.position = position;
        this.value = value;
    }

    public int getPosition() {
        return  position;
    }

    public T getValue() {
        return value;
    }
}
