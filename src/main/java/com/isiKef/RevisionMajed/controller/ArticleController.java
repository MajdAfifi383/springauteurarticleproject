package com.isiKef.RevisionMajed.controller;


import com.isiKef.RevisionMajed.entities.Article;
import com.isiKef.RevisionMajed.entities.Auteur;
import com.isiKef.RevisionMajed.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping(value = "/article")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @GetMapping
    public List<Article> getAll(){
        return articleService.getArticles();
    }
    @PostMapping
    public Article addArticle(@RequestBody Article article){
        return articleService.addArticle(article);    }
    @PutMapping(value = "/{id}")
    public Article updateArticle(@RequestBody Article article,@PathVariable("id") long id){
        return articleService.updateArticle(article,id);
    }

    @DeleteMapping(value = "/{id}")
    public Map<String, Boolean> deleteArticle(@PathVariable("id")long id){
        return articleService.deleteArticle(id);
    }

    @GetMapping(value = "/{id}")
    public Optional<Article> getArticle(@PathVariable("id")long id){
        return articleService.getArticle(id);
    }
}
