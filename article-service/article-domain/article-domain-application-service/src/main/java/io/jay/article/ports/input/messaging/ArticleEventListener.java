package io.jay.article.ports.input.messaging;

public interface ArticleEventListener {

    /**
     * Adapter is implemented in application-service module
     * This port should be invoked by a message listener (i.e KafkaListener)
     * @param response
     */
    void listen(String response);
}
