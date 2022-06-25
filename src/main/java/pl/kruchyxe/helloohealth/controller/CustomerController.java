package pl.kruchyxe.helloohealth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.kruchyxe.helloohealth.model.Customer;

import java.util.List;

@RestController
public class CustomerController {

    @GetMapping("/customers")
    public List<Customer> getCustomer() {
        throw new IllegalArgumentException("Not found yet") ;
    }

    @GetMapping("/customers")
    public Customer getSingleCustomer() {
        throw new IllegalArgumentException("Not found yet") ;
    }
}
