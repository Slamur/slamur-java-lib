package com.slamur.lib.model;

import java.util.List;

public interface Model<ValueType> {

    List<ValueType> getValues();
    void setValues(List<ValueType> values);

    Provider<ValueType> getProvider();
    void setProvider(Provider<ValueType> provider);

    void updateValues();
}
