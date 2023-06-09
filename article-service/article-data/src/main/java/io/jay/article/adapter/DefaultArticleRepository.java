package io.jay.article.adapter;

import io.jay.article.entity.Article;
import io.jay.article.mapper.ArticleDataAccessMapper;
import io.jay.article.ports.output.repository.ArticleRepository;
import io.jay.article.repository.ArticleJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class DefaultArticleRepository implements ArticleRepository {

    private final ArticleJpaRepository jpaRepository;
    private final ArticleDataAccessMapper mapper;

    @Override
    public List<Article> findAllArticles() {
        return jpaRepository.findAll()
                .stream().map(mapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Article save(Article article) {
        var saved = jpaRepository.save(mapper.toEntity(article));
        return mapper.toDomain(saved);
    }
}
