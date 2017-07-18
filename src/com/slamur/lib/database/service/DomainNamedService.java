package com.slamur.lib.database.service;

import com.slamur.lib.database.domain.DomainNamedEntity;

public interface DomainNamedService<EntityType extends DomainNamedEntity>
        extends DomainService<EntityType> {
}