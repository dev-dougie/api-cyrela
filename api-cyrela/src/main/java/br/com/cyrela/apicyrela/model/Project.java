package br.com.cyrela.apicyrela.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;

//Entidade de projetos. Nela será possível verificar custos e informações necessárias.
@Entity
@SequenceGenerator(name = "project", sequenceName = "SQ_PROJECT", allocationSize = 1)
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "project")
	private int id;
	
	@JsonFormat(pattern = "dd-MM-yyyy", shape = JsonFormat.Shape.STRING, timezone = "GMT-3")
	private Date initialDate;
	
	@JsonFormat(pattern = "dd-MM-yyyy", shape = JsonFormat.Shape.STRING, timezone = "GMT-3")
	private Date finalDate;
	
	private String description;
	
	@ManyToOne
	private ApartamentUnity unity;
	
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

	
}
