package com.example.demo.service;

import com.example.demo.gateway.ClientService;
import com.example.demo.model.Customer;
import com.example.demo.util.RestTemplateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {
  private final Logger LOGGER = LoggerFactory.getLogger(ClientServiceImpl.class);

  @Value("${endpoint.url}")
  String url;

  @Override
  public String clientCreation(String clientId) {
    return clientId;
  }

  @Override
  public ResponseEntity insertAddress(Customer customer) {
    ResponseEntity re = RestTemplateUtil.getRestTemplate(url, customer);
    return re;
  }
}
