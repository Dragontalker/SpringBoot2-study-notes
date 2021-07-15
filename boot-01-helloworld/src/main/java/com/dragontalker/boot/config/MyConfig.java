package com.dragontalker.boot.config;

import com.dragontalker.boot.bean.Pet;
import com.dragontalker.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 1. 配置类里面使用@Bean标注在方法上给容器注册组件, 默认也是单实例的
 * 2. 配置类本身也是组件
 * 3. proxyBeanMethods: 代理bean的方法
 *      Full,  proxyBeanMethods = true
 *      Lite, proxyBeanMethods = false
 *        组件依赖
 */
@Configuration(proxyBeanMethods = true) // 告诉SpringBoot这是一个配置类
public class MyConfig {

    /**
     * 外部无论对配置类中的这个组件注册方法调用多少次获取的都是之前注册容器的单实例对象
     * @return
     */
    @Bean // 给容器中添加组件, 以方法名作为组件的id, 返回类型就是组件类型, 返回的值, 就是容器中保存的实例
    public User user01() {
        User zhangsan = new User("zhangsan", 18);
        zhangsan.setPet(tomcatPet());
        return zhangsan;
    }

    @Bean("tom")
    public Pet tomcatPet() {
        return new Pet("tomcat");
    }
}
