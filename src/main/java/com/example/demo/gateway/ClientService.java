package com.example.demo.gateway;

import com.example.demo.model.Customer;

public interface ClientService {

  String clientCreation(String ClientId);

    Customer insertAddress(Customer address);
}
