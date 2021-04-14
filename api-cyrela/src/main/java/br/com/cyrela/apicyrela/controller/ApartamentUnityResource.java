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

import br.com.cyrela.apicyrela.model.ApartamentUnity;
import br.com.cyrela.apicyrela.repository.BuildingUnityRepository;

@RestController
@RequestMapping("unity")
public class ApartamentUnityResource {
	
	@Autowired
	private BuildingUnityRepository repo;
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public ApartamentUnity create(@RequestBody ApartamentUnity unity) {
		return repo.save(unity);
	}
	
	@GetMapping
	public List<ApartamentUnity> getAll(){
		return repo.findAll();
	}
	
	@GetMapping("{id}")
	public ApartamentUnity find(@PathVariable int id) {
		return repo.findById(id).get();
	}
	
	@PutMapping("{id}")
	public ApartamentUnity update(@RequestBody ApartamentUnity unity, @PathVariable int id) {
		unity.setId(id);
		return repo.save(unity);
	}
	
	@DeleteMapping("{id}")
	public void remove(@PathVariable int id) {
		repo.deleteById(id);
	}
	
	
}
