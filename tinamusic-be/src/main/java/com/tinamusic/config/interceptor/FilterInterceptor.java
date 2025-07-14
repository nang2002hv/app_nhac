package com.tinamusic.config.interceptor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.hibernate.Filter;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

@Component
public class FilterInterceptor {
    @PersistenceContext
    private EntityManager entityManager;

    private static final ThreadLocal<Boolean> DISABLE_FILTER = ThreadLocal.withInitial(() -> Boolean.FALSE);

    private boolean isFilterDisabled() {
        return Boolean.TRUE.equals(DISABLE_FILTER.get());
    }

    public void enableFilter() {
        if (!isFilterDisabled()) {
            Session session = entityManager.unwrap(Session.class);
            Filter filter = session.enableFilter("deletedFilter");
            filter.setParameter("isDeleted", false);
        }
    }

    public void clearThreadLocal() {
        DISABLE_FILTER.remove();
    }
}

