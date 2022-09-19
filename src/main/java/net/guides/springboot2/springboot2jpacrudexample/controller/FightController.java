package net.guides.springboot2.springboot2jpacrudexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.guides.springboot2.springboot2jpacrudexample.model.Flight;
import net.guides.springboot2.springboot2jpacrudexample.model.Plane;
import net.guides.springboot2.springboot2jpacrudexample.repository.FlightRepository;

@RestController
@RequestMapping("/")
public class FightController {
	@Autowired
	private FlightRepository flightRepository;

}
