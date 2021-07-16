package com.dragontalker.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 只有在容器中的组件, 才能拥有SpringBoot提供的强大功能
 */
@ToString
@Data
@Component
@ConfigurationProperties(prefix = "mycar")
@AllArgsConstructor // 无参构造器
@NoArgsConstructor // 全参构造器
public class Car {

    private String brand;
    private Integer price;
}
