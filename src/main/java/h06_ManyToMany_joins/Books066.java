package h06_ManyToMany_joins;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.ManyToMany;

@Entity
public class Books066 {

	private String b_name;
	@Id
	private int b_id;
	
	@ManyToMany(mappedBy="booklist")
	private List<Students066> students=new ArrayList<Students066>();

	String getB_name() {
		return b_name;
	}

	void setB_name(String b_name) {
		this.b_name = b_name;
	}

	int getB_id() {
		return b_id;
	}

	void setB_id(int b_id) {
		this.b_id = b_id;
	}

	List<Students066> getStudents() {
		return students;
	}

	void setStudents(List<Students066> students) {
		this.students = students;
	}
//
//	@Override
//	public String toString() {
//		return "Books066 [b_name=" + b_name + ", b_id=" + b_id + ", students=" + students + "]";
//	}
}
