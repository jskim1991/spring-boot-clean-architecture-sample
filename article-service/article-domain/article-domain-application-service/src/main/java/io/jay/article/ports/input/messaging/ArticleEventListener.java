package io.jay.article.ports.input.messaging;

/**
 * Adapter is implemented in application-service module.
 * This port should be invoked by a message listener (i.e KafkaListener).
 */
public interface ArticleEventListener {

    void listen(String response);
}
