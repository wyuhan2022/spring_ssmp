package com.yuhan.domain;

import lombok.Data;

/**
 * @author Yuhan
 * @create 2022-03-15 12:33
 */
@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
