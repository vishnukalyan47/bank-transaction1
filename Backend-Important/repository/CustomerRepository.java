package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;

import com.example.demo.model.Customers;

public interface CustomerRepository extends JpaRepository<Customers, String> {
	public List<Customers> findAllByOrderByIdAsc();

//	public java.util.Collection<Customers> findAllByCustomer_Name();
	
	// public List<Customers> findByLetterContaining(String s);
	
//	@Query(value = "SELECT * FROM Customers WHERE  Customer_Name  LIKE BINARY CONCAT(s,'%')", nativeQuery = true)
//    List<Customers> abc(@Param("s") String s);
}
