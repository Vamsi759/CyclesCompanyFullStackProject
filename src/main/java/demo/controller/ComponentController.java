package demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.entity.Component;
import demo.repository.ComponentRepository;

@RestController
@RequestMapping("/components")

public class ComponentController {

	@Autowired
	ComponentRepository repository;
	
	

	@PostMapping("/add")
	public Component save(@RequestBody Component component) {

		String c = component.getCategory();
		if (c.equals("Gear") || c.equals("Body") || c.equals("Wheel")) {
			return repository.save(component);
		}
		return null;

	}

	@GetMapping("/getall")
	public List<Component> getAll() {

		return repository.findAll();

	}
	
	 // Update Component
	@PutMapping("/update")
	public Component update(@RequestBody Component updatedComponent) {

	    Optional<Component> optional = repository.findById(updatedComponent.getId());

	    if (optional.isPresent()) {

	        Component component = optional.get();

	        component.setName(updatedComponent.getName());
	        component.setCategory(updatedComponent.getCategory());
	        component.setPrice(updatedComponent.getPrice());
	        component.setModel(updatedComponent.getModel());
	        component.setPricechangedmonth(updatedComponent.getPricechangedmonth());
	        component.setQuantity(updatedComponent.getQuantity());

	        return repository.save(component);
	    }

	    throw new RuntimeException("Component not found");
	}
    
    
    @GetMapping("/get/{id}")
    public Optional<Component> getbyid(@PathVariable Long id) {
    	if(repository.findById(id)!=null) {
    		System.out.println(repository.findById(id));
    		return repository.findById(id);
    	}
    	return Optional.empty();
    }
    
    
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
    	if(repository.findById(id)!=null) {
    		repository.deleteById(id);
    		return "deleted";
    	}
    	return "notdeleted";
    }

	
}
