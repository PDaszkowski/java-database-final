package com.project.code.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.code.Model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByEmail(String email);

    Customer findByid(Long id);
}