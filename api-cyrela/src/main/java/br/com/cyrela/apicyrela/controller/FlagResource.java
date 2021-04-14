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

import br.com.cyrela.apicyrela.model.Flag;
import br.com.cyrela.apicyrela.repository.FlagRepository;

@RestController
@RequestMapping("cyrela/flag")
public class FlagResource {
	
	@Autowired
	private FlagRepository repo;
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public Flag create(@RequestBody Flag flag) {
		return repo.save(flag);
	}
	
	@GetMapping
	public List<Flag> getAll(){
		return repo.findAll();
	}
	
	@GetMapping("{id}")
	public Flag find(@PathVariable int id) {
		return repo.findById(id).get();
	}
	
	@PutMapping("{id}")
	public Flag update(@RequestBody Flag flag, @PathVariable int id) {
		flag.setId(id);
		return repo.save(flag);
	}
	
	@DeleteMapping("{id}")
	public void remove(@PathVariable int id) {
		repo.deleteById(id);
	}
	
}
