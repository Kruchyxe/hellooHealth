package pl.kruchyxe.helloohealth.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.kruchyxe.helloohealth.model.Customer;
import pl.kruchyxe.helloohealth.service.CustomerService;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class CustomerController {

    private CustomerService customerService;


    @GetMapping("/customers")
    public List<Customer> getCustomer() {
        return customerService.getAllCustomers();

    }

    @GetMapping("/customers/{id}")
    public Optional<Customer> getSingleCustomer(@PathVariable long id) {
        return Optional.of(customerService.findCustomerById(id)
                .orElseThrow());


    }

}
