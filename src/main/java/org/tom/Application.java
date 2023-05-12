package org.tom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * "Spring Boot" 应用的启动入口是 "@SpringBootApplication" 注解标注类中的main()方法
 * "@SpringBootApplication" 能够扫描Spring组件并自动配置Spring Boot
 */
@SpringBootApplication
//标注主程序类,这是一个Springboot应用!
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Application.class,args);
        String [] names = run.getBeanDefinitionNames();
        System.out.println("-----------所有的组件Bean----------");
        for (String name : names) {
            //因为,有很多是默认的所以会有很多~
            System.out.println(name);
        }

    }
}