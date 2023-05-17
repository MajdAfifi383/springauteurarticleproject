package com.isiKef.RevisionMajed.service;

import com.isiKef.RevisionMajed.entities.Article;
import com.isiKef.RevisionMajed.entities.Auteur;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface ArticleService {

    public Article addArticle(Article article);

    public Article updateArticle(Article article, long id);

    public List<Article> getArticles();

    public Map<String,Boolean> deleteArticle(long id);

    public Optional<Article> getArticle(long id) ;
}
