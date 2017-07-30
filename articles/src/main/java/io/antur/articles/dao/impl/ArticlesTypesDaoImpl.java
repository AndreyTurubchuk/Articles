package io.antur.articles.dao.impl;

import io.antur.articles.dao.ArticlesTypesDao;
import io.antur.articles.entity.ArticlesENRU;
import io.antur.articles.entity.ArticlesTypes;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ArticlesTypesDaoImpl extends GenericDaoImpl<ArticlesTypes, Integer> implements ArticlesTypesDao {
    public ArticlesTypesDaoImpl() {
        super (ArticlesTypes.class);
    }


    //Метод возвращающий список новостей и показывает кол-во официальных и английских текстов, связанных с ними
    @Override
    public List<ArticlesENRU> getArticlesENRU(Integer articlesTypeId) {
        Session session = getSession();
        Query query = session.createQuery("Select a.articleName," +
                "sum(case when a2.articlesTypes.typeId = 4 then 1 else 0 end) AS Count_Official_Text, " +
                "sum(case when a2.articlesTypes.typeId = 5 then 1 else 0 end) AS Count_English_Text " +
                "From Articles a " +
                "Left join ArticlesLink link on a.articleId = link.articles.articleId " +
                "Left join Articles a2 on a2.articleId = link.articles2.articleId " +
                "where a.articlesTypes.typeId = ? " +
                "Group by a.articleName " +
                "ORDER BY a.articleName");
        query.setParameter(0, articlesTypeId);
        List<Object[]> scoreQuery = query.list();
        List<ArticlesENRU> res = new ArrayList<ArticlesENRU>();
        scoreQuery.forEach(x -> res.add(new ArticlesENRU((String)(x[0]), ((Long) x[1]).intValue(), ((Long) x[2]).intValue())));
        return res;
    }
}

