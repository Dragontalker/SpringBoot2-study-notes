package com.dragontalker.boot.config;

import com.dragontalker.boot.bean.Car;
import com.dragontalker.boot.bean.Pet;
import com.dragontalker.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * 1. 配置类里面使用@Bean标注在方法上给容器注册组件, 默认也是单实例的
 * 2. 配置类本身也是组件
 * 3. proxyBeanMethods: 代理bean的方法
 *      Full, 全模式 proxyBeanMethods = true
 *      Lite, 轻量级模式 proxyBeanMethods = false, 跳过bean检查, 快速启动
 *        组件依赖
 * 4. @Import({User.class, DBHelper.class})
 *      给容器中自动创建出这两个类型的组件, 默认组件的名字就是全类名
 *
 * 5. @ImportResource("classpath:beans.xml") 允许导入传统的xml文件配置bean
 *
 */
@Import({User.class})
@Configuration(proxyBeanMethods = false) // 告诉SpringBoot这是一个配置类
//@ConditionalOnBean(name = "tom")
@ConditionalOnMissingBean(name = "tom")
@ImportResource("classpath:beans.xml")
@EnableConfigurationProperties(Car.class)
// 1. 开启Car配置绑定功能
// 2. 把Car这个组件自动注册到容器中
public class MyConfig {

    /**
     * 外部无论对配置类中的这个组件注册方法调用多少次获取的都是之前注册容器的单实例对象
     */
    @Bean // 给容器中添加组件, 以方法名作为组件的id, 返回类型就是组件类型, 返回的值, 就是容器中保存的实例
    public User user01() {
        User zhangsan = new User("zhangsan", 18);
        // user组件依赖了pet组件
        zhangsan.setPet(tomcatPet());
        return zhangsan;
    }

    @Bean("tom22")
    public Pet tomcatPet() {
        return new Pet("tomcat");
    }
}
