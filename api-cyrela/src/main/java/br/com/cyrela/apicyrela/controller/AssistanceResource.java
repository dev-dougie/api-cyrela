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

import br.com.cyrela.apicyrela.model.ScheduledActivity;
import br.com.cyrela.apicyrela.repository.ScheduledActivityRepository;

@RestController
@RequestMapping("assistance")
public class AssistanceResource {
	
	@Autowired
	private ScheduledActivityRepository repo;
	
	@GetMapping
	public List<ScheduledActivity> findAll() {
		return repo.findAll();
	}
	
	@GetMapping("{id}")
	public ScheduledActivity find(@PathVariable int id) {
		return repo.findById(id).get();
	}
	
	@PutMapping("{id}")
	public ScheduledActivity update(@RequestBody ScheduledActivity assistance, @PathVariable int id) {
		assistance.setId(id);
		return repo.save(assistance);
	}
	
	@DeleteMapping("{id}")
	public void remove(@PathVariable int id) {
		repo.deleteById(id);
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public ScheduledActivity create(@RequestBody ScheduledActivity assistance) {
		return repo.save(assistance);
	}
	
}
