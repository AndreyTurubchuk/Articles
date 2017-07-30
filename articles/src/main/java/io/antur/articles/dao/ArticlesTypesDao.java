package io.antur.articles.dao;

import io.antur.articles.entity.ArticlesENRU;
import io.antur.articles.entity.ArticlesTypes;

import java.util.List;

public interface ArticlesTypesDao extends GenericDao<ArticlesTypes, Integer> {
    List<ArticlesENRU> getArticlesENRU(Integer articlesTypeId); // получение списка новостей по типу новости
}

