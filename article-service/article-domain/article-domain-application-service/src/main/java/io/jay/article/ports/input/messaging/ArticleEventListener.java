package io.jay.article.ports.input.messaging;

public interface ArticleEventListener {

    /**
     * Listens JSON message from message broker.
     * Adapter should be implemented in article-messaging (i.e KafkaListener)
     * @param json
     */
    void listen(String json);
}
