package com.xk;

import com.xk.config.JdbcConfig;
import com.xk.service.TransactionService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author tianming@alibaba-inc.com
 * @since 2020/3/11
 */
public class JdbcConfigTest {

    @Test
    public void jdbcTest(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JdbcConfig.class);
        TransactionService transactionService = applicationContext.getBean(TransactionService.class);
        transactionService.insert();
    }
}
