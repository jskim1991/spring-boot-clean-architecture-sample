package io.jay.article;

import io.jay.article.dto.ArticleResponse;
import io.jay.article.dto.NewArticleCommand;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebTestClient
public class MainApplicationTests {

    @Autowired
    WebTestClient webTestClient;

    @Test
    void test_createThenGet() {
        var created = webTestClient.post()
                .uri("/articles")
                .bodyValue(new NewArticleCommand("title", "content", "1"))
                .exchange()
                .expectStatus().isOk()
                .expectBody(ArticleResponse.class)
                .returnResult()
                .getResponseBody();


        assertNotNull(created);
        assertNotNull(created.getId());
        assertEquals("title", created.getTitle());
        assertEquals("content", created.getContent());
        assertEquals("1", created.getAuthorId());


        var all = webTestClient.get()
                .uri("/articles")
                .exchange()
                .expectStatus().isOk()
                .expectBodyList(ArticleResponse.class)
                .returnResult()
                .getResponseBody();


        assertNotNull(all);
        assertEquals(1, all.size());
        assertEquals("title", all.get(0).getTitle());
        assertEquals("content", all.get(0).getContent());
        assertEquals("1", all.get(0).getAuthorId());
    }
}
