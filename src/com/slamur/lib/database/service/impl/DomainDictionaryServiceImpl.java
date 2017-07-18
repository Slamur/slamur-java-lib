package com.slamur.lib.database.service.impl;

import com.slamur.lib.database.dao.DomainDictionaryDao;
import com.slamur.lib.database.domain.DomainDictionaryEntity;
import com.slamur.lib.database.service.DomainDictionaryService;

public abstract class DomainDictionaryServiceImpl<
        EntityType extends DomainDictionaryEntity,
        EntityDaoType extends DomainDictionaryDao<EntityType>
        >
        extends DomainNamedServiceImpl<EntityType, EntityDaoType>
        implements DomainDictionaryService<EntityType> {

}