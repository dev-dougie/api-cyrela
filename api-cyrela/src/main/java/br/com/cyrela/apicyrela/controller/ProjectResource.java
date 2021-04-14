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

import br.com.cyrela.apicyrela.model.Project;
import br.com.cyrela.apicyrela.repository.ProjectRepository;

@RestController
@RequestMapping("project")
public class ProjectResource {
	
	@Autowired
	private ProjectRepository repo;
	
	@GetMapping
	private List<Project> getAll(){
		return repo.findAll();
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	private Project create(@RequestBody Project project) {
		return repo.save(project);
	}
	
	@GetMapping("{id}")
	public Project find(@PathVariable int id) {
		return repo.findById(id).get();
	}
	
	@PutMapping("{id}")
	public Project update(@RequestBody Project project, @PathVariable int id) {
		project.setId(id);
		return repo.save(project);
	}
	
	@DeleteMapping("{id}")
	public void remove(@PathVariable int id) {
		repo.deleteById(id);
	}
	
	@GetMapping("/costGraterThan={cost}")
	private List<Project> listAll(@PathVariable double cost) {
        return repo.findByCostGreaterThan(cost);
    }
}
