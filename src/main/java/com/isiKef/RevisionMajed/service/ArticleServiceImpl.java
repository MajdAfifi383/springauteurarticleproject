package com.isiKef.RevisionMajed.service;


import com.isiKef.RevisionMajed.entities.Article;
import com.isiKef.RevisionMajed.entities.Auteur;
import com.isiKef.RevisionMajed.repository.ArticleRepository;
import com.isiKef.RevisionMajed.repository.AuteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleRepository articleRepository;
    @Autowired
    private AuteurRepository auteurRepository;

    @Override
    public Article addArticle(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public Article updateArticle(Article article, long id) {
        Article old=articleRepository.findById(id).get();
        old.setTitre(article.getTitre());
        old.setIndexx(article.getIndexx());
        old.setContent(article.getContent());
        return articleRepository.save(old);
    }

    @Override
    public List<Article> getArticles() {
        return articleRepository.findAll();
    }

    @Override
    public Map<String, Boolean> deleteArticle(long id) {
        articleRepository.deleteById(id);
        Map<String,Boolean> res= new HashMap<>();
        res.put("deleted",Boolean.TRUE);
        return res;
    }

    @Override
    public Optional<Article> getArticle(long id) {
        return articleRepository.findById(id);
    }
}
