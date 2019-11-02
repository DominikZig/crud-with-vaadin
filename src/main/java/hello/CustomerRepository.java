package hello;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long>
{
    //This method is using Spring Data's declarative queries
    List<Customer> findByLastNameStartsWithIgnoreCase(String lastName);
}
