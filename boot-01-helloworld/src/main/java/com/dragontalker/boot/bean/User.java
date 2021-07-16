package com.dragontalker.boot.bean;

import lombok.Data;

/**
 * 用户
 */
@Data
public class User {

    private String name;
    private Integer age;
    private Pet pet;
}
