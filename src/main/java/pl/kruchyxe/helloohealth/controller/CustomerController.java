package pl.kruchyxe.helloohealth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.kruchyxe.helloohealth.model.Customer;

import java.util.List;

@RestController
public class CustomerController {

    @GetMapping("/customers")
    public List<Customer> getCustomer() {
        throw new IllegalArgumentException("Not found yet") ;
    }

    @GetMapping("/customers/{id}")
    public Customer getSingleCustomer(@PathVariable long id) {
        throw new IllegalArgumentException("Not found yet") ;
    }
}
