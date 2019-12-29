package com.jc.config;

/*
 *
 * @Copyright: 2019JCSoft
 * @author: Zjf
 * @since: 2019/12/28 22:28
 * @Version 1.0
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.jc")
@EnableAspectJAutoProxy
public class Appconfig {
}
