package br.com.cyrela.apicyrela.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cyrela.apicyrela.model.Occurrence;

public interface OccurrenceRepository extends JpaRepository<Occurrence, Integer> {
}
