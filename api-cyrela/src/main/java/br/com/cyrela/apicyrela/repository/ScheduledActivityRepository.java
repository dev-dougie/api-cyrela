package br.com.cyrela.apicyrela.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cyrela.apicyrela.model.ScheduledActivity;

public interface ScheduledActivityRepository extends JpaRepository<ScheduledActivity, Integer> {

}
