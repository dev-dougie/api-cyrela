package br.com.cyrela.apicyrela.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "occurrence", sequenceName = "SQ_OCCURRENCE", allocationSize = 1)
public class Occurrence {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "occurence")
	private int ticketId;
	
	@OneToOne
	private ScheduledActivity relatedToActivity;
	
	private String description;
	
	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ScheduledActivity getRelatedToActivity() {
		return relatedToActivity;
	}

	public void setRelatedToActivity(ScheduledActivity relatedToActivity) {
		this.relatedToActivity = relatedToActivity;
	}
	
	

}
