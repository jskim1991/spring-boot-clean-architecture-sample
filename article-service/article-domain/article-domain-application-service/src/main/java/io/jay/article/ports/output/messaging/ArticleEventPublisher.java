package io.jay.article.ports.output.messaging;

import io.jay.article.entity.Article;

public interface ArticleEventPublisher {

    /**
     * Publishes article event to message broker.
     * Adapter implementation should be in article-messaging (i.e KafkaProducer)
     * @param article
     */
    void publish(Article article);
}
