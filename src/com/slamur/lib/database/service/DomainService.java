package com.slamur.lib.database.service;

import com.slamur.lib.database.domain.DomainEntity;

import java.util.List;

public interface DomainService<EntityType extends DomainEntity> {

    EntityType getById(int id);
    List<EntityType> getAll();

    void create(EntityType entity);
    void update(EntityType entity);

    void remove(int id);
    void remove(EntityType entity);
}