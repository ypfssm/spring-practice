package com.ypf;

import com.ypf.bean.CreditApplyConsumer;
import com.ypf.bean.HelloWorld;
import com.ypf.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author shuaifei
 */
public class SpringTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

//        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
//        helloWorld.setMessage("Hello World!");
//        String message = helloWorld.getMessage();
//        System.out.println(message);
        CreditApplyConsumer creditApplyConsumer = (CreditApplyConsumer) ctx.getBean("creditApplyConsumer");
        creditApplyConsumer.handle("111");
    }

}
