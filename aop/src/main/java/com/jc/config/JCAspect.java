package com.jc.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/*
 * 定义切面,切面让Spring管理
 * @Copyright: 2019JCSoft
 * @author: Zjf
 * @since: 2019/12/28 22:51
 * @Version 1.0
 */
//1.定义切面
@Aspect
@Component
public class JCAspect {

    //2.声明切点
    //3.execution(* com.jc.dao.*.*(..)) 通过表达式定义连接点
    @Pointcut("execution(* com.jc.dao.*.*(..))")
    public void pointCut() {

    }

    //4.定义通知
    @After("com.jc.config.JCAspect.pointCut()") //里面要声明连接点
    public void after() {
        //定义逻辑
        System.out.println("后置通知");
    }

    @Before("com.jc.config.JCAspect.pointCut()")
    public void before() {
        //定义逻辑
        System.out.println("前置通知");
    }

    @AfterThrowing("com.jc.config.JCAspect.pointCut()")
    public void afterThrowing() {
        //定义逻辑
        System.out.println("错误通知");
    }

    @Around("com.jc.config.JCAspect.pointCut()")
    public void around(ProceedingJoinPoint jp) {
        //定义逻辑
        System.out.println("环绕通知--前");
        try {
            jp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("环绕通知--后");

    }
}
