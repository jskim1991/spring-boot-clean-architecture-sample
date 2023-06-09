package io.jay.article.valueobject;

import io.jay.article.common.ValueObject;

public enum ArticleStatus implements ValueObject {
    PUBLISHED, DRAFT, BANNED
}
