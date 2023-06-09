package io.jay.article.ports.output.messaging;

import io.jay.article.entity.Article;

/**
 * Publishes article event to message broker.
 * Adapter implementation should be in article-messaging (i.e KafkaProducer).
 */
public interface ArticleEventPublisher {

    void publish(Article article);
}
