package br.com.cyrela.apicyrela.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "customer", sequenceName = "SQ_CUSTOMER", allocationSize = 1)
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer")
	private int id;
	
	private String name;
	
	private String cpf;
	
	private String email;
	
	private String phone;
	
	
	@ManyToOne
	private ApartamentUnity ownership;

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public ApartamentUnity getOwnership() {
		return ownership;
	}

	public void setOwnership(ApartamentUnity ownership) {
		this.ownership = ownership;
	}
	
}
