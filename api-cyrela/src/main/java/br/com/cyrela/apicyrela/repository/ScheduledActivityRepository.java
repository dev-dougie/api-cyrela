package br.com.cyrela.apicyrela.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cyrela.apicyrela.model.ScheduledActivity;

public interface ScheduledActivityRepository extends JpaRepository<ScheduledActivity, Integer> {
	List<ScheduledActivity> findByFinished(boolean finished);
	List<String> findByInitialDateAndExpectedFinalDate(String initalDate, String expectedFinalDate);
}
