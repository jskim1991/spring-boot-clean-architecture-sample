package io.jay.article.service;

import io.jay.article.dto.NewArticleCommand;
import io.jay.article.entity.Article;

import java.util.List;

public interface ArticleApplicationService {

    List<Article> getArticles();

    Article publishArticle(NewArticleCommand command);
}
