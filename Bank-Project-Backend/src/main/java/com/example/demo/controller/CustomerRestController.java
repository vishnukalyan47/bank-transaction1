package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customers;
import com.example.demo.repository.CustomerRepository;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CustomerRestController {
	@Autowired
	private CustomerRepository custRepo;
	
//	private Sort sortBySno() {
//		return Sort(Sort.Direction.ASC, "Sno");
//	}
	
	
	@GetMapping("/CustomerGet")
    public List<Customers> listCustomers(){
        return custRepo.findAllByOrderByIdAsc();
    }

	@PostMapping("/CustomerPost")
	public Customers AddNewCustomer(@RequestBody Customers custt) {
		return(custRepo.save(custt));
		
//		return ("Added New Customer");
    }
	
}
