package com.antonbas;

import java.util.Enumeration;
import java.util.Hashtable;

public class SparseVector {
    private final int size;
    private final Hashtable<Integer, Float> sparse;

    public SparseVector(int size) {
        this.size = size;
        sparse = new Hashtable<>(size);
    }

    public void put(int position, float value) {
        if (position < 0 && position >= size ) { throw new IllegalArgumentException("position out of the range of the vector"); }
        if (value != 0.0) { sparse.put(position, value); } else { sparse.remove(position); }
    }

    public float get(int position) {
        if (position < 0 && position >= size ) { throw new IllegalArgumentException("position out of the range of the vector"); }
        return sparse.getOrDefault(position, 0.0f);
    }

    public int nonZeroValuesSize() {
        return sparse.size();
    }

    public int size() {
        return size;
    }

    public float dotProduct(SparseVector that) {
        if (this.nonZeroValuesSize() != that.nonZeroValuesSize()) { throw new IllegalArgumentException("vectors have different length");  }
        return (this.size() <= that.size() ) ? calculateSumDotProduct(this, that) : calculateSumDotProduct(that, this);
    }

    private float calculateSumDotProduct(SparseVector sparseVector1, SparseVector sparseVector2) {
        float sum = 0;
        Enumeration<Integer> positions = sparseVector1.sparse.keys();
        while (positions.hasMoreElements()) {
            int key = positions.nextElement();
            sum =  sum + (sparseVector1.get(key) * sparseVector2.get(key));
        }
        return sum;
    }

}
