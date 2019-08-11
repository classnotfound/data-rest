package net.classnotfound.spring.boot.data.rest.repository;

import net.classnotfound.spring.boot.data.rest.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
