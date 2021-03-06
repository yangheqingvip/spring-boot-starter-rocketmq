package com.wpj.spring.boot.rocketmq.starter.annotation;

import com.wpj.spring.boot.rocketmq.starter.annotation.enums.MessageType;

import java.lang.annotation.*;

/**
 * @author wangpejian
 * @date 19-3-28 上午10:19
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MessageSender {

    String channel();

    MessageType type() default MessageType.defaultType;

}
