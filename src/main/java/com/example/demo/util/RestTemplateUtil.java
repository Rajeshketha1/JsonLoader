package com.example.demo.util;

import com.example.demo.model.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestTemplateUtil {

  private RestTemplateUtil() {}

  public static ResponseEntity getRestTemplate(String url, Customer customer) {
    RestTemplate rs = new RestTemplate();
    ResponseEntity<Customer> response = rs.postForEntity(url,customer,Customer.class);
    return response;
  }
}
