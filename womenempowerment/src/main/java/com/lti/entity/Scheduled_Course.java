package com.lti.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.OneToMany;

public class Scheduled_Course {
	
	private int scheduled_id;
	private LocalDate start_date;
	private LocalDate end_date;
	private int available_seats;
	
	@OneToMany(mappedBy="scheduled")
	private List<Course> courses;

	public int getScheduled_id() {
		return scheduled_id;
	}

	public void setScheduled_id(int scheduled_id) {
		this.scheduled_id = scheduled_id;
	}

	public LocalDate getStart_date() {
		return start_date;
	}

	public void setStart_date(LocalDate start_date) {
		this.start_date = start_date;
	}

	public LocalDate getEnd_date() {
		return end_date;
	}

	public void setEnd_date(LocalDate end_date) {
		this.end_date = end_date;
	}

	public int getAvailable_seats() {
		return available_seats;
	}

	public void setAvailable_seats(int available_seats) {
		this.available_seats = available_seats;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	
	
}
