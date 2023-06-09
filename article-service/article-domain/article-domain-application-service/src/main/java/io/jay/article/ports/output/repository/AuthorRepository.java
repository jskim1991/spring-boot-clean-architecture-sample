package io.jay.article.ports.output.repository;

import io.jay.article.entity.Author;

import java.util.Optional;

public interface AuthorRepository {
    Optional<Author> findAuthor(String id);
}
