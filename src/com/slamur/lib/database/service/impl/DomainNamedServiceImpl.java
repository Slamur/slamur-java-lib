package com.slamur.lib.database.service.impl;

import com.slamur.lib.database.dao.DomainNamedDao;
import com.slamur.lib.database.domain.DomainNamedEntity;
import com.slamur.lib.database.service.DomainNamedService;

public abstract class DomainNamedServiceImpl<
        EntityType extends DomainNamedEntity,
        EntityDaoType extends DomainNamedDao<EntityType>
        >
        extends DomainServiceImpl<EntityType, EntityDaoType>
        implements DomainNamedService<EntityType> {

}