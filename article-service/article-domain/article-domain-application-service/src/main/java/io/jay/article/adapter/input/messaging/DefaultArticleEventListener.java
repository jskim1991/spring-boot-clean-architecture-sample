package io.jay.article.adapter.input.messaging;

import io.jay.article.ports.input.messaging.ArticleEventListener;

public class DefaultArticleEventListener implements ArticleEventListener {
    @Override
    public void listen(String response) {
        // do something
    }
}
