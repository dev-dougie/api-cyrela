package br.com.cyrela.apicyrela.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cyrela.apicyrela.model.Customer;
import br.com.cyrela.apicyrela.model.Occurrence;

public interface OcurrenceRepository extends JpaRepository<Occurrence, Integer> {
	public List<Occurrence> findByCustomer(Customer customer);
}
