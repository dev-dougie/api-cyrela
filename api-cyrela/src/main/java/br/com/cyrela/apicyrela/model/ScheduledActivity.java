package br.com.cyrela.apicyrela.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "scheduledActivity", sequenceName = "SQ_SCHED_ACTIV", allocationSize = 1)
public class ScheduledActivity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "scheduledActivity")
	private int id;
	
	private Date initialDate;

	private Date finalDate;
	
	private String activityType;
	
	private String subject;
	
	@OneToOne
	private Occurrence relatedToOcurrence;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Date getInitialDate() {
		return initialDate;
	}

	public void setInitialDate(Date initialDate) {
		this.initialDate = initialDate;
	}

	public Date getFinalDate() {
		return finalDate;
	}

	public void setFinalDate(Date finalDate) {
		this.finalDate = finalDate;
	}

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Occurrence getRelatedToOcurrence() {
		return relatedToOcurrence;
	}

	public void setRelatedToOcurrence(Occurrence relatedToOcurrence) {
		this.relatedToOcurrence = relatedToOcurrence;
	}

	

}
