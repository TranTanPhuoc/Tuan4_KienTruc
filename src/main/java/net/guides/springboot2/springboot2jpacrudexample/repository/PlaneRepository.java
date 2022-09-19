
package net.guides.springboot2.springboot2jpacrudexample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.guides.springboot2.springboot2jpacrudexample.model.Flight;
import net.guides.springboot2.springboot2jpacrudexample.model.Plane;

@Repository
public interface PlaneRepository extends JpaRepository<Plane, Long>{

	@Query(value="SELECT * FROM maybay ",nativeQuery = true)
	List<Plane> findPlanesGoToDalat();
	@Query(value="SELECT * FROM maybay WHERE TamBay > 10000 ",nativeQuery = true)
	List<Plane> findPlaneGreaterThan10000();
}
