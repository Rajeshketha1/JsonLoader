package com.example.demo.gateway;

import com.example.demo.model.Customer;
import org.springframework.http.ResponseEntity;

public interface ClientService {

  String clientCreation(String ClientId);

    ResponseEntity insertAddress(Customer address);
}
