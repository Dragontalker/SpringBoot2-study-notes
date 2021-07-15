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

        // 4. com.dragontalker.boot.config.MyConfig$$EnhancerBySpringCGLIB$$aab697e@27aae97b
        MyConfig bean = run.getBean(MyConfig.class);
        System.out.println(bean);

        // 如果@Configuration(proxyBeanMethods = true)代理对象调用方法.
        // SpringBoot总会检查这个组件是否在容器中有
        // 保持组件单实例
        User user01 = bean.user01();
        User user02 = bean.user01();
        System.out.println(user01 == user02);

        User user011 = run.getBean("user01", User.class);
        Pet tom = run.getBean("tom", Pet.class);

        System.out.println("用户的宠物: " + (user011.getPet() == tom));
    }
}
