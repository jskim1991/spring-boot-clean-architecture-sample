package io.jay.article.entity;

import io.jay.article.common.AggregateRoot;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Author implements AggregateRoot {
    private String id;
    private String name;
    private String email;

    @Builder
    public Author(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
