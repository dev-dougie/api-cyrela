package br.com.cyrela.apicyrela.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "occurrence", sequenceName = "SQ_OCCURRENCE", allocationSize = 1)
public class Occurrence {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "occurence")
	private int ticketId;
	
	@ManyToOne
	private Customer customer;

	@ManyToOne
	private ApartamentUnity unity;
	
	private String description;
	
	private boolean finished;

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}
}
