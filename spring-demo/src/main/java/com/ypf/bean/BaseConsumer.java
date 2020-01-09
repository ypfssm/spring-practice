package com.ypf.bean;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author shuaifei
 */
public abstract class BaseConsumer {

    private final String group;
    private final String topic;

    public BaseConsumer(String group, String topic){
        this.group = group;
        this.topic = topic;
    }

    @PostConstruct
    private void start() {
        System.out.println(group + " ------" + topic);
        shutdown();
    }

    @PreDestroy
    private void shutdown() {
    }

    /**
     * 处理消息的具体业务逻辑。
     * @param corgiMessage
     */
    public abstract void handle(String corgiMessage);
}

