package com.test.wikiparser.model;

import lombok.Data;

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

    /**<p>Поле - создать врменную метку</p>*/
    @Column(name = "create_timestamp")
    private LocalDateTime createTimestamp;

    /**<p>Поле - временная метка</p>*/
    @Column(name = "time_stamp")
    private LocalDateTime timeStamp;

    /**<p>Поле - язык</p>*/
    @Column(name = "language")
    private String language;

    /**<p>Поле - wiki</p>*/
    @Column(name = "wiki")
    private String wiki;

    /**<p>Поле - категория</p>
     * <p>По полю категория, создан справочник</p>
     * @see*/
    @Column(name = "category")
    private String category;

    /**<p>Поле - заголовок</p>*/
    @Column(name = "title")
    private String title;

    /**<p>Поле - вспомогательный текст</p>*/
    @Column(name = "auxiliary_text")
    private String auxiliaryText;

}
