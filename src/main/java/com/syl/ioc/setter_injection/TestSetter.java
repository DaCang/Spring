package com.syl.ioc.setter_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.IOException;

/**
 * 测试setter 方法注入
 */
public class TestSetter {

    public static void main(String[] args) {
        File directory = new File("");//设定为当前文件夹
        String localPath = "";

        localPath =  "file:"+directory.getAbsolutePath();//获取绝对路径
        System.out.println(localPath);
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext(
                localPath+"\\src\\spring-setter.xml");

        User user = (User) context.getBean("user01");
        user.eating();
        user.getFood().eaten();


    }



}
