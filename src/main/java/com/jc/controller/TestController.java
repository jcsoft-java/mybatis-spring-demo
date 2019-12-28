package com.jc.controller;

import com.jc.entity.DriverFactorBean;
import com.jc.entity.HelloSpring;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *
 * @Copyright: 2019JCSoft
 * @author: Zjf
 * @since: 2019/12/28 10:30
 * @Version 1.0
 */
public class TestController {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//        context.getBean(HelloSpring.class);
        context.getBean("helloSpring");
//        context.getBean("driver");
    }
}
