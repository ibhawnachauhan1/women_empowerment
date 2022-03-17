package com.lti.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue
	
	private int userid;
	
	private String firstname;
	private String lastName;

	private int age;
	private int mobileno;
	private String fathername;
	
	private int fatherage;
	
	private String fatheroccupation;
	
	private int fathermobileno;
	
	private String address;
	private String qualification;
	
	
	@ManyToOne
	@JoinColumn(name="admin_id")
	private Admin admin;


	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getMobileno() {
		return mobileno;
	}


	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}


	public String getFathername() {
		return fathername;
	}


	public void setFathername(String fathername) {
		this.fathername = fathername;
	}


	public int getFatherage() {
		return fatherage;
	}


	public void setFatherage(int fatherage) {
		this.fatherage = fatherage;
	}


	public String getFatheroccupation() {
		return fatheroccupation;
	}


	public void setFatheroccupation(String fatheroccupation) {
		this.fatheroccupation = fatheroccupation;
	}


	public int getFathermobileno() {
		return fathermobileno;
	}


	public void setFathermobileno(int fathermobileno) {
		this.fathermobileno = fathermobileno;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public Admin getAdmin() {
		return admin;
	}


	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	
}
