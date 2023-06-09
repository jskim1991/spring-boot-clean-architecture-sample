package io.jay.article.entity;


import io.jay.article.common.AggregateRoot;
import io.jay.article.valueobject.ArticleStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;
import java.util.UUID;

@Getter
public class Article implements AggregateRoot {
    private String id;
    private String title;
    private String content;
    private ZonedDateTime publishedAt;
    private ArticleStatus status;

    @Setter
    private String authorId;

    public Article(String title, String content) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.content = content;
    }

    @Builder
    public Article(String id, String title, String content, ZonedDateTime publishedAt, ArticleStatus status, String authorId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.publishedAt = publishedAt;
        this.status = status;
        this.authorId = authorId;
    }

    public void publish() {
        this.status = ArticleStatus.PUBLISHED;
        this.publishedAt = ZonedDateTime.now();
    }

    public void ban() {
        this.status = ArticleStatus.BANNED;
    }
}
