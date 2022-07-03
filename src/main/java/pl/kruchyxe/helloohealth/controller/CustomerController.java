package pl.kruchyxe.helloohealth.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import pl.kruchyxe.helloohealth.model.Customer;
import pl.kruchyxe.helloohealth.service.CustomerService;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("customers")
public class CustomerController {

    private CustomerService customerService;


    @GetMapping("")
    public List<Customer> getCustomer() {
        return customerService.getAllCustomers();

    }

    @GetMapping("/{id}")
    public Optional<Customer> getSingleCustomer(@PathVariable long id) {
        return Optional.of(customerService.findCustomerById(id)
                .orElseThrow(() -> {
                    throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Entity not found");
                }));
    }

    @GetMapping("/delete/{id}")
    public void removeCustomer(@PathVariable Long id) {

        try {
            customerService.deleteCustomerById(id);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }

    @PostMapping("/add")
    public void addingCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);
    }

}
