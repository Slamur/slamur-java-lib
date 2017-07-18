package com.slamur.lib.database.domain;

public interface DomainDictionaryEntity extends DomainNamedEntity {

    String getDescription();
    void setDescription(String description);
}