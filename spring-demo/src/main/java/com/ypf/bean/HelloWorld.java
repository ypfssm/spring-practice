package com.ypf.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author shuaifei
 */
@Data
@Component
public class HelloWorld {

    String message;

    public HelloWorld() {
        System.out.println("HelloWorld ......");
    }

}
