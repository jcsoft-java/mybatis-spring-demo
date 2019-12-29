package com.jc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 *
 * @Copyright: 2019JCSoft
 * @author: Zjf
 * @since: 2019/12/29 10:54
 * @Version 1.0
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/say")
    public String sayHello() {
        return "/hello/say";

    }
}
