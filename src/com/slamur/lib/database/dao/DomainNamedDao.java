package com.slamur.lib.database.dao;

import com.slamur.lib.database.domain.DomainNamedEntity;

public interface DomainNamedDao<EntityType extends DomainNamedEntity>
        extends DomainDao<EntityType> {
}