package com.org.workerforyou.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.workerforyou.model.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

	Optional<Customer> findByName(String name);

}
