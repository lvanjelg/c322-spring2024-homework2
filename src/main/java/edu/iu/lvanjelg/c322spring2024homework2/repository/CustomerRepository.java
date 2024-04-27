package edu.iu.lvanjelg.c322spring2024homework2.repository;

import edu.iu.lvanjelg.c322spring2024homework2.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, String> {
    Customer findByUsername(String username);
}
