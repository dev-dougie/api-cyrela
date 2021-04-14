package br.com.cyrela.apicyrela.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cyrela.apicyrela.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer>{
	public List<Project> findByCostGreaterThan(double cost);
}
