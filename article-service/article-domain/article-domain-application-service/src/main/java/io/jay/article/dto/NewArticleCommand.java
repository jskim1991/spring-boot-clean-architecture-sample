package io.jay.article.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NewArticleCommand {
    private String title;
    private String content;
    private String authorId;
}
