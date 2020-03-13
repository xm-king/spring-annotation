package com.alibaba.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.service.TransactionService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author tianming@alibaba-inc.com
 * @since 2020/3/11
 */
@Configuration
@PropertySource("classpath:/jdbc.properties")
@EnableTransactionManagement
public class TxConfig {
    @Value("${jdbc.url}")
    private String jdbcUrl;

    @Value("${jdbc.username}")
    private String userName;

    @Value("${jdbc.password}")
    private String password;

    @Bean("dataSource")
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl(jdbcUrl);
        dataSource.setUsername(userName);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean("jdbcTemplate")
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    @Bean("dbOperatorService")
    public TransactionService dbOperatorService(JdbcTemplate jdbcTemplate){
        TransactionService transactionService = new TransactionService();
        transactionService.setJdbcTemplate(jdbcTemplate);
        return transactionService;
    }

    @Bean("platformTransactionManager")
    public PlatformTransactionManager platformTransactionManager(DataSource dataSource){
        PlatformTransactionManager platformTransactionManager = new DataSourceTransactionManager(dataSource);
        return platformTransactionManager;
    }
}
