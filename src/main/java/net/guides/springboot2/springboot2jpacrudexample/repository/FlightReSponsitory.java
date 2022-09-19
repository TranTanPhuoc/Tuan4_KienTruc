package net.guides.springboot2.springboot2jpacrudexample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import net.guides.springboot2.springboot2jpacrudexample.model.Flight;

@Repository
public interface FlightReSponsitory extends JpaRepository<Flight, Long> {
	@Query(value="SELECT * FROM chuyenbay Where(DoDai > 8000 and DoDai < 10000)",nativeQuery = true)
	List<Flight> timDoDaiDuongDi();

}
