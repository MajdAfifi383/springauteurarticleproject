package com.isiKef.RevisionMajed.repository;


import com.isiKef.RevisionMajed.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article,Long> {
}
