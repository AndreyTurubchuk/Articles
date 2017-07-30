package io.antur.articles.dao.impl;

import io.antur.articles.dao.GenericDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Transactional
public class GenericDaoImpl<T,K extends Serializable> implements GenericDao<T, K> {
    private Class<T> type;

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public GenericDaoImpl(Class<T> type) {
        this.type = type;
    }

    @SuppressWarnings("unchecked")
    public List<T> getAll() {
        org.hibernate.query.Query query = getSession().createQuery(String.format("from %s", type.getName()));
        return query.list();
    }
}

