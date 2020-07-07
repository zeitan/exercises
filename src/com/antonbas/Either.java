package com.antonbas;

import java.util.List;

public class Either {
    private final Object elem;

    public Either(Integer elem) {
        this.elem = elem;
    }

    public Either(List<Either> elem) {
        this.elem = elem;
    }

    public boolean isInt() {
        return elem instanceof Integer;
    }

    public boolean isList() {
        return elem instanceof List;

    }

    public int getInt() throws ClassCastException {
        if (isInt())
            return (int) elem;
        else
            throw new ClassCastException("Invalid transformation to int");
    }

    public List<Either> getList() {
        if (isList())
            return (List<Either>) elem;
        else
            throw new ClassCastException("Invalid transformation to List");
    }

}
