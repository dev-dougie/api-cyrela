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

import br.com.cyrela.apicyrela.model.Occurrence;
import br.com.cyrela.apicyrela.repository.OccurrenceRepository;

@RestController
@RequestMapping("app/occurrence")
public class OccurenceResource {

	@Autowired
	private OccurrenceRepository repo;
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public Occurrence create(@RequestBody Occurrence occurrence) {
		return repo.save(occurrence);
	}
	
	@GetMapping
	public List<Occurrence> getAll(){
		return repo.findAll();
	}
	
	@GetMapping("{id}")
	public Occurrence find(@PathVariable int id) {
		return repo.findById(id).get();
	}
	
	@PutMapping("{id}")
	public Occurrence update(@RequestBody Occurrence occurrence, @PathVariable int id) {
		occurrence.setTicketId(id);
		return repo.save(occurrence);
	}
	
	@DeleteMapping("{id}")
	public void remove(@PathVariable int id) {
		repo.deleteById(id);
	}

}
