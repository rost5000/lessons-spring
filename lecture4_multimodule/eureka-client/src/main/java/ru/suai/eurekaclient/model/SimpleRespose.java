package ru.suai.eurekaclient.model;

import lombok.Data;

/**
 * @author rost.
 * Для этого класса были сгенерированы все сеттер и геттеры благодаря аннотации @Data
 * Для того, чтобы пользоваться преимуществами этой библиотеки нужно добавить
 * соответсвующую зависимость от project lombok и при компиляции всё создастся
 * Если IDE будет ругаться, то установите плагин для работы с библиотекой lombok
 */
@Data
public class SimpleRespose {
    protected String id;
    protected String value;
}
