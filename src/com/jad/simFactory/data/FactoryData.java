package com.jad.simFactory.data;

import java.util.AbstractList;
import java.util.ArrayList;

abstract class FactoryData<E> {
    protected final ArrayList<E> dataSet;

    protected FactoryData() {
        this.dataSet = new ArrayList<>();
    }

    public ArrayList<E> getDataSet() {
        return new ArrayList<>(this.dataSet);
    }

    public void addData(E data) {
        if (! this.dataSet.contains(data)) {
            this.dataSet.add(data);
        }
    }

    protected abstract void generateDataSet();
}
