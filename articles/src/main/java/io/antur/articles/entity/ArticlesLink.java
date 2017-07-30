package io.antur.articles.entity;

import javax.persistence.*;

/**
 * Created by AnTur on 30.07.2017.
 */

@Entity
@Table(name = "articles_link")
public class ArticlesLink {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "article_link_id")
    private Integer articleLinkId;

    @ManyToOne
    @JoinColumn(name = "article1_id")
    private Articles articles;

    @ManyToOne
    @JoinColumn(name = "article2_id")
    private Articles articles2;


    public Integer getArticleLinkId() {
        return articleLinkId;
    }

    public void setArticleLinkId(Integer articleLinkId) {
        this.articleLinkId = articleLinkId;
    }

    public Articles getArticles() {
        return articles;
    }

    public void setArticles(Articles articles) {
        this.articles = articles;
    }

    public ArticlesLink() {
    }
}
