package h04_onetomany_join;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Books04 {

	@Id
	private int b_id;
	private String b_name;
	
	 @ManyToOne
	 @JoinColumn(name="student_id")
	 private Student04 student;
	
	
	
	int getB_id() {
		return b_id;
	}
	void setB_id(int b_id) {
		this.b_id = b_id;
	}
	String getB_name() {
		return b_name;
	}
	void setB_name(String b_name) {
		this.b_name = b_name;
	}
//	@Override
//	public String toString() {
//		return "Books04 [b_id=" + b_id + ", b_name=" + b_name + "]";
//	}
	Student04 getStudent() {
		return student;
	}
	void setStudent(Student04 student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Books04 [b_id=" + b_id + ", b_name=" + b_name + ", student=" + student + "]";
	}
	
	
	
	
}
