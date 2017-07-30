package io.antur.articles.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "articles_types")
public class ArticlesTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "article_type_id")
    private Integer typeId;

    @Column(name = "article_type_name")
    private String typeName;

    @OneToMany(mappedBy = "articlesTypes", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Articles> articles = new ArrayList<>();

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public List<Articles> getArticles() {
        return articles;
    }

    public void setArticles(List<Articles> articles) {
        this.articles = articles;
    }

    public ArticlesTypes() {
    }
}
