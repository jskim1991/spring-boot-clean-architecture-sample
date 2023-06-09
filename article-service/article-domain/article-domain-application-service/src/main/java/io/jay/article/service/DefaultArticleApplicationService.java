package io.jay.article.service;

import io.jay.article.dto.NewArticleCommand;
import io.jay.article.entity.Article;
import io.jay.article.mapper.ArticleDataMapper;
import io.jay.article.ports.output.repository.ArticleRepository;
import io.jay.article.ports.output.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DefaultArticleApplicationService implements ArticleApplicationService {

    private final ArticleRepository articleRepository;
    private final AuthorRepository authorRepository;
    private final ArticleDataMapper dataMapper;
    private final ArticleDomainService domainService;

    @Override
    public List<Article> getArticles() {
        return articleRepository.findAllArticles();
    }

    @Override
    public Article publishArticle(NewArticleCommand command) {
        var article = dataMapper.mapArticleFromCommand(command);

        String authorId = command.getAuthorId();
        var author = authorRepository.findAuthor(authorId);
        if (author.isEmpty()) {
            throw new RuntimeException("Author not found");
        }

        var publishedArticle = domainService.publishArticleWithAuthor(article, author.get());
        articleRepository.save(publishedArticle);

        return publishedArticle;
    }
}
