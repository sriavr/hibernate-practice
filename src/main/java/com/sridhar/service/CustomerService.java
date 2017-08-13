package com.sridhar.service;

import com.sridhar.Customer;
import com.sridhar.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public void insertCustomer(Customer customer){
        customerRepository.save(customer);
    }
}
