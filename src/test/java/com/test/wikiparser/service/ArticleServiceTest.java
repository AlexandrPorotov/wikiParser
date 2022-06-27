package com.test.wikiparser.service;

import com.test.wikiparser.DTO.ArticleDTO;
import com.test.wikiparser.repository.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class ArticleServiceTest {

    @InjectMocks
    ArticleService articleService;
    @Mock
    ArticleRepository articleRepository;

    @Test
    void saveArticle() {
        ArticleDTO articleDTO = new ArticleDTO();
        articleDTO.setDate(LocalDateTime.now());
        articleDTO.setTitle("test-title");
        articleDTO.setUrl("//test.url.com");

        articleService.saveArticle(articleDTO);

        verify(articleRepository, times(1)).save(any());
    }
}