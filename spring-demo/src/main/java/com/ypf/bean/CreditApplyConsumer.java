package com.ypf.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author shuaifei
 */
@Component
public class CreditApplyConsumer extends BaseConsumer{

    public CreditApplyConsumer(@Value("${pay.group}")String group,
                               @Value("${pay.topic}")String topic) {
        super(group, topic);
    }

    @Override
    public void handle(String corgiMessage) {
        System.out.println("handle message ......");
    }
}