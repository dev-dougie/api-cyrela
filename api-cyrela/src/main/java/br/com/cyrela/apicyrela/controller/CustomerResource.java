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

import br.com.cyrela.apicyrela.model.Customer;
import br.com.cyrela.apicyrela.repository.CustomerRepository;

@RestController
@RequestMapping("customer")
public class CustomerResource {
	
	@Autowired
	private CustomerRepository repo;
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public Customer create(@RequestBody Customer customer) {
		return repo.save(customer);
	}
	
	@GetMapping
	public List<Customer> getAll(){
		return repo.findAll();
	}
	
	@GetMapping("{id}")
	public Customer getById(@PathVariable int id) {
		return repo.findById(id).get();
	}
	
	@PutMapping("{id}")
	public Customer update(@PathVariable int id, @RequestBody Customer customer) {
		customer.setId(id);
		return repo.save(customer);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable int id) {
		repo.deleteById(id);
	}
	

}
