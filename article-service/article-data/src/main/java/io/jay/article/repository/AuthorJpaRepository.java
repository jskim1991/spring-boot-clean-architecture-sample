package io.jay.article.repository;

import io.jay.article.entity.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorJpaRepository extends JpaRepository<AuthorEntity, String> {
}
