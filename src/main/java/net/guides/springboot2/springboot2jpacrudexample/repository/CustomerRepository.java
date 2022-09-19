package net.guides.springboot2.springboot2jpacrudexample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import net.guides.springboot2.springboot2jpacrudexample.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	@Query(value = "SELECT * FROM nhanvien WHERE Luong < 10000",nativeQuery = true)
	List<Customer> luongless10000();
}
