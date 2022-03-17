package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {

	@Id
	@GeneratedValue
	private int course_id;
	private String course_name;
	private LocalDate course_duration;
	
	@ManyToOne
	@JoinColumn(name="ngo_id")
	private NGO ngo;

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public LocalDate getCourse_duration() {
		return course_duration;
	}

	public void setCourse_duration(LocalDate course_duration) {
		this.course_duration = course_duration;
	}

	public NGO getNgo() {
		return ngo;
	}

	public void setNgo(NGO ngo) {
		this.ngo = ngo;
	}
	
	
}
