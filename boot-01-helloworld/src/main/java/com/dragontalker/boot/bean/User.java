package com.dragontalker.boot.bean;

import lombok.Data;
import lombok.ToString;

/**
 * 用户
 */
@ToString
@Data
public class User {

    private String name;
    private Integer age;
    private Pet pet;
}
