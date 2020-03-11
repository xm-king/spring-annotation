package com.xk.service;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author tianming@alibaba-inc.com
 * @since 2020/3/11
 */
public class TransactionService {
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public void insert(){
        jdbcTemplate.update("INSERT INTO `User` (`age`, `name`)VALUES(?,?)",32,"xiangmin");
        int a = 0;
        int b = 1/a;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
}
