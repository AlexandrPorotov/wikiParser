package com.test.wikiparser.service;

import com.test.wikiparser.DTO.ArticleDTO;
import com.test.wikiparser.model.Article;
import com.test.wikiparser.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**@author Alexandr Porotov
 * @version 1.0.0
 * <p>Сервис реализующий логику сохранения и извлечения данных из БД</p>*/
@Service
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;

    public void saveArticle(ArticleDTO articleDTO) {
        Article article = new Article();
        article.setUrl(articleDTO.getUrl());
        article.setDate(articleDTO.getDate());
        article.setTitle(articleDTO.getTitle());
        articleRepository.save(article);
    }

}
