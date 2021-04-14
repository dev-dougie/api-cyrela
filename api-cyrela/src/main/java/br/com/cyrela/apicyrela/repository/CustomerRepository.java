package br.com.cyrela.apicyrela.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cyrela.apicyrela.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
