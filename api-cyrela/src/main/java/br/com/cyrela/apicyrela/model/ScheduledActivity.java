package br.com.cyrela.apicyrela.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@SequenceGenerator(name = "scheduledActivity", sequenceName = "SQ_SCHED_ACTIV", allocationSize = 1)
public class ScheduledActivity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "scheduledActivity")
	private int id;
	
	@JsonFormat(pattern = "dd/MM/yyyy", shape = Shape.STRING)
	private String initialDate;
	
	@JsonFormat(pattern = "dd/MM/yyyy", shape = Shape.STRING)
	private String expectedFinalDate;
	
	@ManyToOne
	private Customer customer;

	@ManyToOne
	private ApartamentUnity unity;
	
	private String activityType;
	
	private String subject;
	
	private boolean finished;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getInitialDate() {
		return initialDate;
	}

	public void setInitialDate(String initialDate) {
		this.initialDate = initialDate;
	}

	public String getExpectedFinalDate() {
		return expectedFinalDate;
	}

	public void setExpectedFinalDate(String expectedFinalDate) {
		this.expectedFinalDate = expectedFinalDate;
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ApartamentUnity getUnity() {
		return unity;
	}

	public void setUnity(ApartamentUnity unity) {
		this.unity = unity;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	

}
