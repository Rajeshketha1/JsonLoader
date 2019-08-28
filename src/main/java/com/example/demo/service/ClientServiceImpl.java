package com.example.demo.service;

import com.example.demo.gateway.ClientService;
import com.example.demo.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {
  private final Logger LOGGER = LoggerFactory.getLogger(ClientServiceImpl.class);

  @Override
  public String clientCreation(String clientId) {
    return clientId;
  }

    @Override
    public Customer insertAddress(Customer customer) {
        return customer;
    }
}
