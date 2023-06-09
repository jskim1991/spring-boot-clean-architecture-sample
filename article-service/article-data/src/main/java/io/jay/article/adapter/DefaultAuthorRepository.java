package io.jay.article.adapter;

import io.jay.article.entity.Author;
import io.jay.article.mapper.AuthorDataAccessMapper;
import io.jay.article.ports.output.repository.AuthorRepository;
import io.jay.article.repository.AuthorJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class DefaultAuthorRepository implements AuthorRepository {

    private final AuthorJpaRepository repository;
    private final AuthorDataAccessMapper mapper;

    @Override
    public Optional<Author> findAuthor(String id) {
        return repository.findById(id)
                .map(mapper::toDomain);
    }
}
