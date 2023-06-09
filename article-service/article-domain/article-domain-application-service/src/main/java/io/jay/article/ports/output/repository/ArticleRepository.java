package io.jay.article.ports.output.repository;

import io.jay.article.entity.Article;

import java.util.List;

public interface ArticleRepository {

    List<Article> findAllArticles();

    Article save(Article article);
}
