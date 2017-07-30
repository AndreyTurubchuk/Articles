package io.antur.articles.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<T, K extends Serializable> {
    List<T> getAll();


}
