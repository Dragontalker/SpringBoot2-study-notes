package com.dragontalker.boot.bean;

import lombok.*;

/**
 * 用户
 */
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class User {

    private String name;
    private Integer age;
}
