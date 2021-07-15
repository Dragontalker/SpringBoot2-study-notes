package com.dragontalker.boot.config;

import com.dragontalker.boot.bean.Pet;
import com.dragontalker.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 告诉SpringBoot这是一个配置类
public class MyConfig {

    @Bean // 给容器中添加组件, 以方法名作为组件的id, 返回类型就是组件类型, 返回的值, 就是容器中保存的实例
    public User user01() {
        return new User("zhangsan", 18);
    }

    @Bean
    public Pet tomcatPet() {
        return new Pet("tomcat");
    }
}
