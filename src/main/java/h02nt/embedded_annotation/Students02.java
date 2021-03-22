package h02nt.embedded_annotation;

import javax.persistence.Entity;
import javax.persistence.Id;



/*
 * 
 plain old java object
 */


@Entity
public class Students02 {

	@Id
	private int ssd_id;
	private String name;
	private  int grade;
	
	
	private Courses courses;
	
	
	int getSsd_id() {
		return ssd_id;
	}
	void setSsd_id(int ssd_id) {
		this.ssd_id = ssd_id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getGrade() {
		return grade;
	}
	void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Students02 [ssd_id=" + ssd_id + ", name=" + name + ", grade=" + grade + "]";
	}
	Courses getCourses() {
		return courses;
	}
	void setCourses(Courses courses) {
		this.courses = courses;
	}
	
	
	
	
}
