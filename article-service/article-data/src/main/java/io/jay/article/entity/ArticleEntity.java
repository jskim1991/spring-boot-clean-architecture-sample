package io.jay.article.entity;

import io.jay.article.valueobject.ArticleStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity
@Table(name = "article")
public class ArticleEntity {

    @Id
    private String id;
    private String title;
    private String content;
    private ZonedDateTime publishedAt;
    private ArticleStatus status;
    private String authorId;
}
