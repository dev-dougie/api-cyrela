package br.com.cyrela.apicyrela.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "apartamentUnity", sequenceName = "SQ_APARTAMENT", allocationSize = 1)
public class ApartamentUnity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "apartamentUnity")
	private int id;
	
	private int number;
	
	private int block;
	
	@ManyToOne
	private Enterprise enterprise;	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getBlock() {
		return block;
	}

	public void setBlock(int block) {
		this.block = block;
	}

	public Enterprise getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}
}
