package h09.hql_queries;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students099 {

	
	@Id
	private int id;
	private int grade;
	private String name;
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	int getGrade() {
		return grade;
	}
	void setGrade(int grade) {
		this.grade = grade;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Students099 [id=" + id + ", grade=" + grade + ", name=" + name + "]";
	}
	
	
	
	
}
