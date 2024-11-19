package com.example.TripMate.Repository;

import com.example.TripMate.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {}

