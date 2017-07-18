package com.slamur.lib.util;

public class Counter<ValueType> {

    private ValueType value;
    private int count;

    public Counter(ValueType value) {
        this(value, 0);
    }

    public Counter(ValueType value, int count) {
        this.value = value;
        this.count = count;
    }

    public ValueType getValue() {
        return value;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int update(int delta) {
        this.count += delta;
        return getCount();
    }

    public int inc() {
        return update(1);
    }

    public int dec() {
        return update(-1);
    }
}
