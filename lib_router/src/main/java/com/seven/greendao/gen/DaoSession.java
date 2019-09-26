package com.seven.greendao.gen;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.seven.lib_router.db.dao.ResourceConfig;
import com.seven.lib_router.db.dao.SearchHistory;

import com.seven.greendao.gen.ResourceConfigDao;
import com.seven.greendao.gen.SearchHistoryDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig resourceConfigDaoConfig;
    private final DaoConfig searchHistoryDaoConfig;

    private final ResourceConfigDao resourceConfigDao;
    private final SearchHistoryDao searchHistoryDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        resourceConfigDaoConfig = daoConfigMap.get(ResourceConfigDao.class).clone();
        resourceConfigDaoConfig.initIdentityScope(type);

        searchHistoryDaoConfig = daoConfigMap.get(SearchHistoryDao.class).clone();
        searchHistoryDaoConfig.initIdentityScope(type);

        resourceConfigDao = new ResourceConfigDao(resourceConfigDaoConfig, this);
        searchHistoryDao = new SearchHistoryDao(searchHistoryDaoConfig, this);

        registerDao(ResourceConfig.class, resourceConfigDao);
        registerDao(SearchHistory.class, searchHistoryDao);
    }
    
    public void clear() {
        resourceConfigDaoConfig.clearIdentityScope();
        searchHistoryDaoConfig.clearIdentityScope();
    }

    public ResourceConfigDao getResourceConfigDao() {
        return resourceConfigDao;
    }

    public SearchHistoryDao getSearchHistoryDao() {
        return searchHistoryDao;
    }

}