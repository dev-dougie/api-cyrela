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
@RequestMapping("activity")
public class ScheduleActivityResource {
	
	@Autowired
	private ScheduledActivityRepository repo;
	
	@GetMapping
	private List<ScheduledActivity> getAll(){
		return repo.findAll();
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	private ScheduledActivity create(@RequestBody ScheduledActivity activity) {
		return repo.save(activity);
	}
	
	@GetMapping("{id}")
	public ScheduledActivity find(@PathVariable int id) {
		return repo.findById(id).get();
	}
	
	@PutMapping("{id}")
	public ScheduledActivity update(@RequestBody ScheduledActivity activity, @PathVariable int id) {
		activity.setId(id);
		return repo.save(activity);
	}
	
	@DeleteMapping("{id}")
	public void remove(@PathVariable int id) {
		repo.deleteById(id);
	}
}