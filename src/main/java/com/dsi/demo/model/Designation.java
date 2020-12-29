package com.dsi.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Designation {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "designation_generator")
	@SequenceGenerator(name = "designation_generator" , sequenceName = "designation_seq")
	private int id;
	
	private String name;
	
	private String email;
	
	public Designation() {
		super();
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Designation [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

}
