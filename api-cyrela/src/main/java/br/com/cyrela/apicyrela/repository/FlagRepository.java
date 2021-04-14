package br.com.cyrela.apicyrela.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cyrela.apicyrela.model.Flag;

public interface FlagRepository extends JpaRepository<Flag, Integer>{
	
}
