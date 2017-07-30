package io.antur.articles.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Articles")
public class Articles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "article_id")
    private Integer articleId;

    @Column(name = "article_name")
    private String articleName;

    @ManyToOne
    @JoinColumn(name = "article_type_id")
    private ArticlesTypes articlesTypes;

    @OneToMany(mappedBy = "articles", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ArticlesLink> articlesLinks = new ArrayList<>();

    @OneToMany(mappedBy = "articles2", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ArticlesLink> articlesLinks2 = new ArrayList<>();


    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public ArticlesTypes getArticlesTypes() {
        return articlesTypes;
    }

    public void setArticlesTypes(ArticlesTypes articlesTypes) {
        this.articlesTypes = articlesTypes;
    }

    public List<ArticlesLink> getArticlesLinks() {
        return articlesLinks;
    }

    public void setArticlesLinks(List<ArticlesLink> articlesLinks) {
        this.articlesLinks = articlesLinks;
    }



    public Articles() {
    }
}

