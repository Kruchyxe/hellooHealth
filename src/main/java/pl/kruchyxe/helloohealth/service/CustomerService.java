package pl.kruchyxe.helloohealth.service;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import pl.kruchyxe.helloohealth.model.Customer;
import pl.kruchyxe.helloohealth.repository.CustomerRepository;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerService {

    private CustomerRepository customerRepository;



    public List<Customer> getAllCustomers() {
        return customerRepository.findAll(PageRequest.of(0,5)).getContent();
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
