package com.test.wikiparser.DTO;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Alexandr Porotov
 * @version 1.0.0
 * <p></p>*/
@Data
public class ArticleDTO {

    /**
     * <p>Заголовок поста</p>*/
    private String title;

    /**
     * <p>URL-поста</p>*/
    private String url;

    /**
     * <p>Время постинга данной записи</p>*/
    private LocalDateTime date;

    /**
     * <p>Параметр который показывает сколько раз был опубликован пост</p>*/
    private Long counter;

    /**
     * <p>Маркер который показывает размещалась ли запись в данной итерации</p>*/
    private Boolean marker;

}
