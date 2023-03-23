package com.demojpa.demo.repository;

import com.demojpa.demo.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customers,Long> {
}
