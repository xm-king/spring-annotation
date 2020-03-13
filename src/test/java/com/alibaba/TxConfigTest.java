package com.alibaba;

import com.alibaba.config.TxConfig;
import com.alibaba.service.TransactionService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author tianming@alibaba-inc.com
 * @since 2020/3/11
 */
public class TxConfigTest {

    @Test
    public void jdbcTest(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TxConfig.class);
        TransactionService transactionService = applicationContext.getBean(TransactionService.class);
        transactionService.insert();
    }
}
