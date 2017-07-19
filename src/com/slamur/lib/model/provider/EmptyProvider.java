package com.slamur.lib.model.provider;

import java.util.ArrayList;
import java.util.List;

public class EmptyProvider<ValueType> extends ProviderImpl<ValueType> {

    public static <ValueType> EmptyProvider<ValueType> createInstance() {
        return new EmptyProvider<>();
    }

    private final List<ValueType> emptyValues;

    private EmptyProvider() {
        this.emptyValues = new ArrayList<>();
    }

    @Override
    public List<ValueType> loadValues() {
        return emptyValues;
    }

    @Override
    public void saveValues(List<ValueType> values) {

    }
}
