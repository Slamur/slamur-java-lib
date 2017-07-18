package com.slamur.lib.database.dao;

import com.slamur.lib.database.domain.DomainEntity;
import java.util.List;

public interface DomainDao<EntityType extends DomainEntity> {

    EntityType getById(int id);
    List<EntityType> getAll();

    void create(EntityType entity);
    void update(EntityType entity);

    default void remove(int id) {
        EntityType entity = getById(id);
        remove(entity);
    }

    void remove(EntityType entity);
}
