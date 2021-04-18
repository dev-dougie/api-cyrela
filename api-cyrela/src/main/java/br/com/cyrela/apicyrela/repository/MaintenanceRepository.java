package br.com.cyrela.apicyrela.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cyrela.apicyrela.model.Maintenance;

public interface MaintenanceRepository extends JpaRepository<Maintenance, Integer>{
	public List<Maintenance> findByCostGreaterThan(double cost);
}
