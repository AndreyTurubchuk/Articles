package io.antur.articles.controller;

import io.antur.articles.dao.ArticlesTypesDao;
import io.antur.articles.entity.ArticlesENRU;
import io.antur.articles.entity.ArticlesTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    ArticlesTypesDao articlesTypesDao;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showArticles(Model model) {
        List<ArticlesTypes> articlesTypesList = articlesTypesDao.getAll();
        model.addAttribute("articlesTypesList", articlesTypesList);
        return "articles";
    }


    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String doPostRequestPageAdd(Model model,
            @RequestParam(value = "articlesTypeId", required = false) Integer articlesTypeId) {
        List<ArticlesENRU> articlesENRUList = articlesTypesDao.getArticlesENRU(articlesTypeId);
        model.addAttribute("articlesENRUList", articlesENRUList);
        return "articlesENRU";
    }



}
