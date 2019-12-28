package com.jc.entity;

import org.springframework.beans.factory.FactoryBean;

import java.sql.Driver;
import java.sql.DriverManager;

/*
 * 方法创建
 * @Copyright: 2019JCSoft
 * @author: Zjf
 * @since: 2019/12/28 10:39
 * @Version 1.0
 */
public class DriverFactorBean implements FactoryBean {
    private String jdbcUrl;

    @Override
    public Object getObject() throws Exception {

        return DriverManager.getDriver(jdbcUrl);
    }

    @Override
    public Class<?> getObjectType() {
        return Driver.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }
}
