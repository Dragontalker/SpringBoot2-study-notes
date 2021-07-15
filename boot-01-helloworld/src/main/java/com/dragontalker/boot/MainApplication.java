package com.dragontalker.boot;

import com.dragontalker.boot.bean.Pet;
import com.dragontalker.boot.bean.User;
import com.dragontalker.boot.config.MyConfig;
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
        Pet tom01 = run.getBean("tom", Pet.class);
        Pet tom02 = run.getBean("tom", Pet.class);
        System.out.println(tom01 == tom02);

        MyConfig bean = run.getBean(MyConfig.class);
        System.out.println(bean);

        User user01 = run.getBean(User.class);
        User user02 = run.getBean(User.class);
        System.out.println(user01 == user02);
    }
}
