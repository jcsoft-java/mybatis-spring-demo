package com.jc.dao;

import org.springframework.stereotype.Component;

/*
 *
 * @Copyright: 2019JCSoft
 * @author: Zjf
 * @since: 2019/12/28 22:28
 * @Version 1.0
 */
@Component
public class IndexDao {
    public void query() {
        System.out.println("dao----query");

        try {
            int i = 1 / 0;
        }
        catch (Exception e){

        }

    }
}
