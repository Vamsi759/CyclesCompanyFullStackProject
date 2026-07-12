package demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.dto.PriceResponse;
import demo.entity.Component;
import demo.entity.Cycle;
import demo.repository.ComponentRepository;
import demo.repository.CycleRepository;
import demo.service.PricingService;

@RestController

@RequestMapping("/cycles")

public class CycleController {

	@Autowired
	CycleRepository repository;

	@Autowired
	PricingService service;
	
	@Autowired
	private ComponentRepository componentRepository;

	@PostMapping("/add")
	public Cycle saveCycle(@RequestBody Cycle cycle) {

	    List<Component> components = cycle.getComponents()
	            .stream()
	            .map(c -> componentRepository.findById(c.getId()).orElseThrow())
	            .toList();

	    cycle.setComponents(components);
	   
	   

	    return repository.save(cycle);
	}
	
	@GetMapping("/getall")
	public List<Cycle> getAll() {

		return repository.findAll();
	}

	@GetMapping("/{id}/price")
	public PriceResponse getPrice(@PathVariable Long id) {

		Cycle cycle = repository.findById(id).get();

		double price = service.calculatePrice(id);

		return new PriceResponse(cycle.getCycleName(), price);

	}

}
