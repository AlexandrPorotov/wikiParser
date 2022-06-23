package com.test.wikiparser.repository;

import com.test.wikiparser.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**@author Alexandr Porotov
 * @version 1.0.0
 * <p>Репозиторий статей.</p>*/
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
