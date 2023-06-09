package io.jay.article.mapper;

import io.jay.article.entity.Author;
import io.jay.article.entity.AuthorEntity;
import org.springframework.stereotype.Component;

@Component
public class AuthorDataAccessMapper {
    public AuthorEntity toEntity(Author author) {
        return AuthorEntity.builder()
                .id(author.getId())
                .name(author.getName())
                .email(author.getEmail())
                .build();
    }

    public Author toDomain(AuthorEntity entity) {
        return Author.builder()
                .id(entity.getId())
                .name(entity.getName())
                .email(entity.getEmail())
                .build();
    }
}
