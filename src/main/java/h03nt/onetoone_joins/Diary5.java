package h03nt.onetoone_joins;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Diary5 {
    
	
	@Id
	private int d_id;
	private String d_name;
	
	@OneToOne
	@JoinColumn(name="student_id")
	private Students5 student;
	
	
	int getD_id() {
		return d_id;
	}
	void setD_id(int d_id) {
		this.d_id = d_id;
	}
	String getD_name() {
		return d_name;
	}
	void setD_name(String d_name) {
		this.d_name = d_name;
	}
	@Override
	public String toString() {
		return "Diary [d_id=" + d_id + ", d_name=" + d_name + ", student=" + student + "]";
	}
	Students5 getStudent() {
		return student;
	}
	void setStudent(Students5 student) {
		this.student = student;
	}
	
	
	
	
}
