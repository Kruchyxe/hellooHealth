package pl.kruchyxe.helloohealth.service;

import org.springframework.stereotype.Service;
import pl.kruchyxe.helloohealth.model.Customer;
import pl.kruchyxe.helloohealth.repository.CustomerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    public CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();

    }

    public Optional<Customer> findCustomerById(Long id){
        return customerRepository.findById(id);
    }

}
