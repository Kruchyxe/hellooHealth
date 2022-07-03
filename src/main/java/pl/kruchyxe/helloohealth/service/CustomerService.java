package pl.kruchyxe.helloohealth.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.kruchyxe.helloohealth.model.Customer;
import pl.kruchyxe.helloohealth.repository.CustomerRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerService {

    public CustomerRepository customerRepository;


    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();

    }

    public Optional<Customer> findCustomerById(Long id){
        return customerRepository.findById(id);
    }

    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public void deleteCustomerById(Long id){
        customerRepository.deleteById(id);
    }

    public void updateCustomer(Customer customer){
        customerRepository.save(customer);
    }



}
