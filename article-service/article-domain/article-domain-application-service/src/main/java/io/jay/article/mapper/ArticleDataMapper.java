package io.jay.article.mapper;

import io.jay.article.dto.ArticleResponse;
import io.jay.article.dto.NewArticleCommand;
import io.jay.article.entity.Article;
import org.springframework.stereotype.Component;

@Component
public class ArticleDataMapper {

    public Article mapArticleFromCommand(NewArticleCommand command) {
        return new Article(command.getTitle(), command.getContent());
    }

    public ArticleResponse toResponse(Article article) {
        return ArticleResponse
                .builder()
                .id(article.getId())
                .title(article.getTitle())
                .content(article.getContent())
                .publishedAt(article.getPublishedAt())
                .status(article.getStatus())
                .authorId(article.getAuthorId())
                .build();
    }
}
