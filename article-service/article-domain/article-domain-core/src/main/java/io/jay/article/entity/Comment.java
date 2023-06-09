package io.jay.article.entity;


import io.jay.article.common.Entity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Comment implements Entity {
    private String id;
    private String content;
    private Author author;
    private String createdAt;

    @Builder
    public Comment(String content, Author author, String createdAt) {
        this.content = content;
        this.author = author;
        this.createdAt = createdAt;
    }
}
