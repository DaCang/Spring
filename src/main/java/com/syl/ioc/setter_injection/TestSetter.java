package com.syl.ioc.setter_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试setter 方法注入
 */
public class TestSetter {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext(
                        "file:D:\\ideaWORK\\SpringLearn\\src\\main\\webapp\\WEB-INF\\spring-setter.xml");
        User user = (User) context.getBean("user01");
        user.eating();
        user.getFood().eaten();


    }



}
