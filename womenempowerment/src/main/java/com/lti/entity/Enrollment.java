package com.lti.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class Enrollment {

	@Id
	@GeneratedValue
	private int enrollment_id;
	private LocalDate enrollment_date;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private List<User> user;
	
	@OneToOne
	@JoinColumn(name="scheduled_id")
	private Scheduled_Course scheduledcourse;

	public int getEnrollment_id() {
		return enrollment_id;
	}

	public void setEnrollment_id(int enrollment_id) {
		this.enrollment_id = enrollment_id;
	}

	public LocalDate getEnrollment_date() {
		return enrollment_date;
	}

	public void setEnrollment_date(LocalDate enrollment_date) {
		this.enrollment_date = enrollment_date;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	public Scheduled_Course getScheduledcourse() {
		return scheduledcourse;
	}

	public void setScheduledcourse(Scheduled_Course scheduledcourse) {
		this.scheduledcourse = scheduledcourse;
	}

	
}
