package br.com.cyrela.apicyrela.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cyrela.apicyrela.model.Enterprise;

public interface EnterpriseRepository extends JpaRepository<Enterprise, Integer> {

}
