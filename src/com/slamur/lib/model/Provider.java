package com.slamur.lib.model;

import java.util.List;

public interface Provider<ValueType> {

    List<ValueType> loadValues();
    void saveValues(List<ValueType> values);
}
