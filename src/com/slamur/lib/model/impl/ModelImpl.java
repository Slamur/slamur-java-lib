package com.slamur.lib.model.impl;

import com.slamur.lib.model.Model;
import com.slamur.lib.model.Provider;
import com.slamur.lib.model.provider.EmptyProvider;

import java.util.ArrayList;
import java.util.List;

public abstract class ModelImpl<ValueType> implements Model<ValueType> {

    private Provider<ValueType> provider;
    private List<ValueType> values;

    protected ModelImpl() {
        values = new ArrayList<>();
        provider = EmptyProvider.createInstance();
    }

    @Override
    public List<ValueType> getValues() {
        return values;
    }

    @Override
    public void setValues(List<ValueType> values) {
        this.values = values;
    }

    @Override
    public Provider<ValueType> getProvider() {
        return provider;
    }

    @Override
    public void setProvider(Provider<ValueType> provider) {
        this.provider = provider;
    }

    @Override
    public void saveValues() {
        provider.saveValues(values);
    }
}
