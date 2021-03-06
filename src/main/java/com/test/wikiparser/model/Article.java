package com.test.wikiparser.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author Alexandr Porotov
 * @version 1.0.0
 * Класс содержащий основные поля статьи для сохранения ее в БД*/
@Data
@Entity
@Table(name = "articles")
public class Article {

    /**<p>Поле - id</p>*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "article_id")
    private Long articleId;

    /**
     * <p>Заголовок поста</p>*/
    @Column(name = "title")
    private String title;

    /**
     * <p>URL-поста</p>*/
    @Column(name = "url")
    private String url;

    /**
     * <p>Время постинга данной записи</p>*/
    @Column(name = "date")
    private LocalDateTime date;

    /**
     * <p>Параметр который показывает сколько раз был опубликован пост</p>*/
    @Column(name = "counter")
    @Value(value = "0")
    private Long counter;

    /**
     * <p>Маркер который показывает размещалась ли запись в данной итерации</p>*/
    @Column(name = "marker")
    @Value(value = "false")
    private Boolean marker;

}
