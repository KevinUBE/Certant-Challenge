package com.Certant.Challenge.Entity;

import javax.persistence.*;


@Entity
public class CarEntity {

	@Id
	private String domain; 
	//
	private String brand; 
	private String model;
	private String nameOwner; //En la base de datos lo tengo con una FK en dni_persona
	
	public CarEntity() {
		
	}

	public CarEntity(String domain, String brand, String model, String nameOwner) {
		this.domain = domain;
		this.brand = brand;
		this.model = model;
		this.nameOwner = nameOwner;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getNameOwner() {
		return nameOwner;
	}

	public void setNameOwner(String nameOwner) {
		this.nameOwner = nameOwner;
	}

	@Override
	public String toString() {
		return "CarEntity [domain=" + domain + ", brand=" + brand + ", model=" + model + ", nameOwner=" + nameOwner
				+ "]";
	}
	
}
