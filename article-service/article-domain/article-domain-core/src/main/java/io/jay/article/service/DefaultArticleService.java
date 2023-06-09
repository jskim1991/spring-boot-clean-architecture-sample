package io.jay.article.service;

import io.jay.article.entity.Author;
import io.jay.article.entity.Article;

public class DefaultArticleService implements ArticleDomainService {

    @Override
    public Article publishArticleWithAuthor(Article article, Author author) {
        article.setAuthorId(author.getId());
        article.publish();
        return article;
    }
}
