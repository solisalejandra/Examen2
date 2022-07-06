package com.spring.aero.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity 
@Table(name ="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column (name="surname")
	private String surname;
	
	@Column (name="firstname")
	private String firstname;
	
	
	@OneToMany(mappedBy = "owner",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@Fetch (value = FetchMode.SUBSELECT)
	@JsonManagedReference
	private List<Language> employeeLanguages = new ArrayList<>();
	
	@OneToOne(cascade = CascadeType.ALL)
	@JsonManagedReference
	private Country employeeContry;
	
	
	public Employee() {
		
	}

	public Employee(int id, String surname, String firstname) {
		super();
		this.id = id;
		this.surname = surname;
		this.firstname = firstname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


}
