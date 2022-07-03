package pl.kruchyxe.helloohealth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kruchyxe.helloohealth.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
