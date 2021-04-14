package br.com.cyrela.apicyrela.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

//Entidade de projetos. Nela será possível verificar custos e informações necessárias.
@Entity
@SequenceGenerator(name = "project", sequenceName = "SQ_PROJECT", allocationSize = 1)
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "project")
	private int id;
	
	@ManyToOne
	private ApartamentUnity unity;
	
	private String description;
	
	private Date InitialDate;
	
	private Date finalDate;
	
	private double cost;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
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

	public Date getInitialDate() {
		return InitialDate;
	}

	public void setInitialDate(Date initialDate) {
		InitialDate = initialDate;
	}

	public Date getFinalDate() {
		return finalDate;
	}

	public void setFinalDate(Date finalDate) {
		this.finalDate = finalDate;
	}
	
}
