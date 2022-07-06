package com.spring.aero.model;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="Country")
public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column (name="code")
	private String code;
	
	@Column (name="name")
	private String name;
	
	@ManyToOne
	@JsonBackReference
	private Employee ownerContry;
	
	@OneToMany(mappedBy = "country",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JsonBackReference
	private java.util.List<Airport> airports = new ArrayList<>(); 
	
	

	public Country(int id, String code, String name) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
