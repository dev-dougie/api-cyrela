package br.com.cyrela.apicyrela.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

//Cyrela, Living or Vivaz

@Entity
@SequenceGenerator(name = "flag", sequenceName = "SQ_FLAG", allocationSize = 1)
public class Flag {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "enterprise")
	private int id;
	
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
