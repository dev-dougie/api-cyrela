package br.com.cyrela.apicyrela.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.cyrela.apicyrela.model.Maintenance;
import br.com.cyrela.apicyrela.repository.MaintenanceRepository;

@RestController
@RequestMapping("app/maintenance")
public class MaintenanceResource {
	
	@Autowired
	private MaintenanceRepository repo;
	
	@GetMapping
	public List<Maintenance> getAll(){
		return repo.findAll();
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public Maintenance create(@RequestBody Maintenance project) {
		return repo.save(project);
	}
	
	@GetMapping("{id}")
	public Maintenance find(@PathVariable int id) {
		return repo.findById(id).get();
	}
	
	@PutMapping("{id}")
	public Maintenance update(@RequestBody Maintenance project, @PathVariable int id) {
		project.setId(id);
		return repo.save(project);
	}
	
	@DeleteMapping("{id}")
	public void remove(@PathVariable int id) {
		repo.deleteById(id);
	}
	
	@GetMapping("/costGreaterThan")
	// http://localhost:8080/app/maintenance/costGreaterThan?cost=X.XX
	public List<Maintenance> listAll(@RequestParam (required = true) double cost) {
        return repo.findByCostGreaterThan(cost);
    }
}
