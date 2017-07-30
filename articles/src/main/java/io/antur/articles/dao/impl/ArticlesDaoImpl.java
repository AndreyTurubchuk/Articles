package io.antur.articles.dao.impl;

import io.antur.articles.dao.ArticlesDao;
import io.antur.articles.entity.Articles;
import org.springframework.stereotype.Repository;

@Repository
public class ArticlesDaoImpl extends GenericDaoImpl<Articles, Integer> implements ArticlesDao{

    public ArticlesDaoImpl() {
        super(Articles.class);
    }
}
