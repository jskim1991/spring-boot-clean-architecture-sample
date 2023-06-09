package io.jay.article.controller;

import io.jay.article.dto.ArticleResponse;
import io.jay.article.dto.NewArticleCommand;
import io.jay.article.entity.Article;
import io.jay.article.mapper.ArticleDataMapper;
import io.jay.article.service.ArticleApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/articles")
@RequiredArgsConstructor
public class ArticleController {

    private final ArticleApplicationService articleApplicationService;
    private final ArticleDataMapper articleDataMapper;

    @PostMapping
    public ArticleResponse create(@RequestBody NewArticleCommand command) {
        var article = articleApplicationService.publishArticle(command);
        return articleDataMapper.toResponse(article);
    }

    @GetMapping
    public List<ArticleResponse> all() {
        return articleApplicationService.getArticles()
                .stream().map(articleDataMapper::toResponse)
                .collect(Collectors.toList());
    }
}
