package io.jay.article.mapper;

import io.jay.article.entity.Article;
import io.jay.article.entity.ArticleEntity;
import io.jay.article.entity.Author;
import io.jay.article.entity.AuthorEntity;
import org.springframework.stereotype.Component;

@Component
public class ArticleDataAccessMapper {

    public ArticleEntity toEntity(Article article) {
        return ArticleEntity.builder()
                .id(article.getId())
                .title(article.getTitle())
                .content(article.getContent())
                .publishedAt(article.getPublishedAt())
                .status(article.getStatus())
                .authorId(article.getAuthorId())
                .build();
    }

    public Article toDomain(ArticleEntity entity) {
        return Article.builder()
                        .id(entity.getId())
                        .title(entity.getTitle())
                        .content(entity.getContent())
                        .publishedAt(entity.getPublishedAt())
                        .status(entity.getStatus())
                        .authorId(entity.getAuthorId())
                        .build();
    }


}
