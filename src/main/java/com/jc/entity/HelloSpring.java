package com.jc.entity;

/*
 * 构造器创建&&静态方法创建
 * @Copyright: 2019JCSoft
 * @author: Zjf
 * @since: 2019/12/28 9:39
 * @Version 1.0
 */
public class HelloSpring {
    public HelloSpring() {
    }

    public HelloSpring(String name, int sex) {
        this.name = name;
        this.sex = sex;
    }

    public static HelloSpring getHelloSpring(){
        return new HelloSpring();
    }

    private String name;

    private int sex;
}
