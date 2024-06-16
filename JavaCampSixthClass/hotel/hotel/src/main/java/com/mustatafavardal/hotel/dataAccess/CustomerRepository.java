package com.mustatafavardal.hotel.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mustatafavardal.hotel.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	boolean existsByName(String name);
}
