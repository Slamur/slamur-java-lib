package com.slamur.lib.database.domain;

public interface DomainNamedEntity extends DomainEntity {

    String getName();
    void setName(String name);
}