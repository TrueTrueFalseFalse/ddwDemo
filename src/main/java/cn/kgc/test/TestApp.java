package cn.kgc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
    public static void main(String[] args) {
        ApplicationContext ct =  new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(ct.toString());



    }
}
