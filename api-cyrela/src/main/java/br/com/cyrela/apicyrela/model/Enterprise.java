package br.com.cyrela.apicyrela.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "enterprise", sequenceName = "SQ_ENTERPRISE", allocationSize = 1)
public class Enterprise {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "enterprise")
	private int id;
	
	private String address;
	
	private int number;
	
	private String city;
	
	private String state;
	
	private String zipcode;
	
	private String condominium;
	
	@OneToOne
	private Flag flag;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCondominium() {
		return condominium;
	}

	public void setCondominium(String name) {
		this.condominium = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Flag getFlag() {
		return flag;
	}

	public void setFlag(Flag flag) {
		this.flag = flag;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
