package io.jay.article.initializer;

import io.jay.article.entity.AuthorEntity;
import io.jay.article.repository.AuthorJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AuthorInitializer implements CommandLineRunner {

    private final AuthorJpaRepository authorJpaRepository;

    @Override
    public void run(String... args) throws Exception {
        authorJpaRepository.save(AuthorEntity.builder()
                .id("1")
                .name("John Doe")
                .email("jdoe@email.com")
                .build());
    }
}
