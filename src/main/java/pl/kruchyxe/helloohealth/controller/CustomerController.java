package pl.kruchyxe.helloohealth.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.kruchyxe.helloohealth.model.Customer;
import pl.kruchyxe.helloohealth.service.CustomerService;

import java.util.List;

@RestController
@AllArgsConstructor
public class CustomerController {

    private CustomerService customerService;


    @GetMapping("/customers")
    public List<Customer> getCustomer() {
        customerService.findAllCustomers();
        throw new IllegalArgumentException("Not found yet") ;
    }

    @GetMapping("/customers/{id}")
    public Customer getSingleCustomer(@PathVariable long id) {
        customerService.findCustomerById(id);
        throw new IllegalArgumentException("Not found yet") ;
    }






}
