package io.jay.article.config;

import io.jay.article.service.ArticleDomainService;
import io.jay.article.service.DefaultArticleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ArticleServiceConfiguration {

    @Bean
    public ArticleDomainService articleDomainService() {
        return new DefaultArticleService();
    }
}
