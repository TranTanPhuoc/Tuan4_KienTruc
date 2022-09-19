package net.guides.springboot2.springboot2jpacrudexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.guides.springboot2.springboot2jpacrudexample.model.Customer;
import net.guides.springboot2.springboot2jpacrudexample.model.Plane;
import net.guides.springboot2.springboot2jpacrudexample.repository.CustomerRepository;

@RestController
@RequestMapping("api/customer")
public class CustomerController {
	@Autowired
	private CustomerRepository customerRepository;
	@GetMapping("/luongless10000")
	public List<Customer> getAllPlant() {
		return customerRepository.luongless10000();
	}
	@GetMapping("/sumLuong")
	public int SumLuong() {
		return customerRepository.SumLuong();
	}
	
}
