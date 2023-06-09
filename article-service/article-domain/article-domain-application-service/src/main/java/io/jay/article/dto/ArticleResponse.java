package io.jay.article.dto;

import io.jay.article.valueobject.ArticleStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class ArticleResponse {
    private String id;
    private String title;
    private String content;
    private ZonedDateTime publishedAt;
    private ArticleStatus status;
    private String authorId;
}
