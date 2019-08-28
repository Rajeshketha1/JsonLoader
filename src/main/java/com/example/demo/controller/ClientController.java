package com.example.demo.controller;

import com.example.demo.gateway.ClientService;
import com.example.demo.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class ClientController {

  private final Logger LOGGER = LoggerFactory.getLogger(ClientController.class);

  @Autowired private ClientService clientService;

  @GetMapping(value = "/{clientId}")
  public Object clientCreation(@PathVariable String clientId) {
    LOGGER.info("checking clientId::::" + clientId);

    return clientService.clientCreation(clientId);
  }

  @PostMapping
  public Customer insertAddress(Customer address) {
    return clientService.insertAddress(address);
  }
}
