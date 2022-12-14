package net.guides.springboot2.springboot2jpacrudexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.guides.springboot2.springboot2jpacrudexample.model.Flight;
import net.guides.springboot2.springboot2jpacrudexample.model.Plane;
import net.guides.springboot2.springboot2jpacrudexample.repository.PlaneRepository;

@RestController
@RequestMapping("/api")
public class PlaneController {
	@Autowired
	private PlaneRepository planeRepository;
	@GetMapping("/planes")
	public List<Plane> getAllPlant() {
		return planeRepository.findAll();
	}
	@GetMapping("/planes10000")
	List<Plane> findPlaneGreaterThan10000(){
		return planeRepository.Cau2();
	};
	@GetMapping("boeing")
	List<Plane> findLoai(){
		return planeRepository.Cau7();
	}

}
