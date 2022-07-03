package pl.kruchyxe.helloohealth.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.kruchyxe.helloohealth.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
