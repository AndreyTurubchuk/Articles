package io.antur.articles.entity;

public class ArticlesENRU {
    private String articlesNameENRU;
    private Integer countArticlesRu;
    private Integer countArticlesEN;

    public Integer getCountArticlesRu() {
        return countArticlesRu;
    }

    public void setCountArticlesRu(Integer countArticlesRu) {
        this.countArticlesRu = countArticlesRu;
    }

    public Integer getCountArticlesEN() {
        return countArticlesEN;
    }

    public void setCountArticlesEN(Integer countArticlesEN) {
        this.countArticlesEN = countArticlesEN;
    }

    public String getArticlesNameENRU() {
        return articlesNameENRU;
    }

    public void setArticlesNameENRU(String articlesNameENRU) {
        this.articlesNameENRU = articlesNameENRU;
    }

    public ArticlesENRU() {
    }

    public ArticlesENRU(String articlesNameENRU, Integer countArticlesRu, Integer countArticlesEN) {
        this.articlesNameENRU = articlesNameENRU;
        this.countArticlesRu = countArticlesRu;
        this.countArticlesEN = countArticlesEN;
    }
}
