package com.dragontalker.boot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 只有在容器中的组件, 才能拥有SpringBoot提供的强大功能
 */
//@Component
@ConfigurationProperties(prefix = "mycar")
public class Car {

    private String brand;
    private Integer price;
}
