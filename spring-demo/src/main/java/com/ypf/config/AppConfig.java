package com.ypf.config;

import com.ypf.bean.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author shuaifei
 */
@Configuration
@ComponentScan("com.ypf")
@PropertySource("dev_config.properties")
public class AppConfig {

    /**
     * 先判断是否有 ComponentScan 注解，如果有，去扫描类。接着去处理 AppConfig 内的工厂方法，
     * 封装为 Spring 对应的数据结构（BeanMethod）。
     * @return
     */
    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }

}
