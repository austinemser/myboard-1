package com.myboard.dao;

import java.util.HashSet;
import java.util.Set;

// Generated Mar 13, 2013 12:50:36 AM by Hibernate Tools 4.0.0

/**
 * CourseInfo generated by hbm2java
 */
public class CourseInfo implements java.io.Serializable {

	private static final long serialVersionUID = 3954810895342753491L;

	private Integer courseInfoId;
	private String courseId;
	private String courseName;
	private String courseDescription;
	private Department department;
	private int credits;
	private Set<CourseSection> courseSections = new HashSet<CourseSection>(0);

	public CourseInfo() {
	}
	
	public CourseInfo(String courseId, String courseName,
			String courseDescription, Department department, int credits) {
		this.department = department;
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.credits = credits;
	}
	
	public CourseInfo(String courseId, String courseName,
			String courseDescription, Department department, int credits,
			Set<CourseSection> courseSections) {
		this.department = department;
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.credits = credits;
		this.courseSections = courseSections;
	}
	
	public Integer getCourseInfoId() {
		return this.courseInfoId;
	}

	public void setCourseInfoId(Integer courseInfoId) {
		this.courseInfoId = courseInfoId;
	}

	public String getCourseId() {
		return this.courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescription() {
		return this.courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public int getCredits() {
		return this.credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	public Set<CourseSection> getCourseSections() {
		return this.courseSections;
	}

	public void setCourseSections(Set<CourseSection> courseSections) {
		this.courseSections = courseSections;
	}
}
