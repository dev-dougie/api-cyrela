package br.com.cyrela.apicyrela.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cyrela.apicyrela.model.Occurrence;

public interface OcurrenceRepository extends JpaRepository<Occurrence, Integer> {
	List<Occurrence> findByFinished(boolean finished);
}
