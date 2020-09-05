package com.example.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AddmissionModel implements Serializable{
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int addmissionid;
	private String coursename;
	private String email;
	private String name;
	private String height;
	private int weight;
	
	public AddmissionModel() {}

	public int getAddmissionid() {
		return addmissionid;
	}

	public void setAddmissionid(int addmissionid) {
		this.addmissionid = addmissionid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
