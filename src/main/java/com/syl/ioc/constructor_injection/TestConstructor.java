package com.syl.ioc.constructor_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试构造方法注入
 */
public class TestConstructor {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext(
                "file:D:\\ideaWORK\\SpringLearn\\src\\main\\webapp\\WEB-INF\\spring-constructor.xml");
        User user = (User) context.getBean("user");
        //user.setUserName(null);
        user.eating();
        user.food.eaten();


    }



}
