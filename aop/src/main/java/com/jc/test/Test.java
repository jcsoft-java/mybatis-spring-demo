package com.jc.test;

import com.jc.config.Appconfig;
import com.jc.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;

/*
 *
 * @Copyright: 2019JCSoft
 * @author: Zjf
 * @since: 2019/12/28 22:30
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //完成spring的初始化
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Appconfig.class);

        IndexDao dao = (IndexDao) applicationContext.getBean("indexDao");
        IndexDao dao1 = (IndexDao) applicationContext.getBean(IndexDao.class);
//        dao.query();
        dao1.query();

    }
}
