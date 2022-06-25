package pl.kruchyxe.helloohealth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kruchyxe.helloohealth.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
