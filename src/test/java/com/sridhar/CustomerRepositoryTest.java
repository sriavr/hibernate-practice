package com.sridhar;

import com.sridhar.hibernatedemo.HibernateDemoApplication;
import com.sridhar.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HibernateDemoApplication.class)
@EntityScan(basePackages = "com.sridhar")
public class CustomerRepositoryTest {

    @Autowired
    private CustomerService customerService;

    @Test
    public void testInsertCustomer(){
        customerService.insertCustomer(new Customer("Jack", "Bauer"));
    }
}

