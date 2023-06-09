package io.jay.article.service;

import io.jay.article.entity.Article;
import io.jay.article.entity.Author;

public interface ArticleDomainService {

    Article publishArticleWithAuthor(Article article, Author author);
}