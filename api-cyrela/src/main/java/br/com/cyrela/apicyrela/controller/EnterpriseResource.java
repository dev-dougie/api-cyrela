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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.cyrela.apicyrela.model.Enterprise;
import br.com.cyrela.apicyrela.repository.EnterpriseRepository;

@RestController
@RequestMapping("cyrela/enterprise")
public class EnterpriseResource {
	
	@Autowired
	private EnterpriseRepository repo;
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public Enterprise create(@RequestBody Enterprise enterprise) {
		return repo.save(enterprise);
	}
	
	@GetMapping
	public List<Enterprise> getAll(){
		return repo.findAll();
	}
	
	@GetMapping("{id}")
	public Enterprise find(@PathVariable int id) {
		return repo.findById(id).get();
	}
	
	@PutMapping("{id}")
	public Enterprise update(@RequestBody Enterprise enterprise, @PathVariable int id) {
		enterprise.setId(id);
		return repo.save(enterprise);
	}
	
	@DeleteMapping("{id}")
	public void remove(@PathVariable int id) {
		repo.deleteById(id);
	}
	
}
