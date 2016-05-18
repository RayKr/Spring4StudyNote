package com.swroom.test;

import com.swroom.service.IStockProcessService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ray on 2016/5/17.
 */
public class StockProcessServiceImplTest {

    private IStockProcessService service;

    @Before
    public void before() {
        String configLocation = "spring-config.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);

        service = (IStockProcessService) ac.getBean("stockService");
    }

    @Test
    public void openAccount() throws Exception {
        service.openAccount("王小二", 600);
    }

    @Test
    public void openStock() throws Exception {
        service.openStock("王者", 10);
    }

    @Test
    public void buyStock() throws Exception {
        service.buyStock("王小二", 230, "王者", 4);
    }

}