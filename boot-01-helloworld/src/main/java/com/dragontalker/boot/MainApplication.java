package com.dragontalker.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 主程序类
 * @SpringBootApplication: 这是一个SpringBoot应用
 */
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        // 1. 返回我们IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class);

        // 2. 查看容器里面的组件
        String[] names = run .getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        // 3. 从容器中获取组件
    }
}
