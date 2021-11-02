package h06_ManyToMany_joins;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Students066 {

	
	private String name;
	@Id
	private int id;
	private int grade;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
            name = "Students066_Books066", 
            joinColumns = { @JoinColumn(name = "id") }, 
            inverseJoinColumns = { @JoinColumn(name = "b_id") }
        )
	private List<Books066> booklist = new ArrayList<Books066>();

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

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

	List<Books066> getBooklist() {
		return booklist;
	}

	void setBooklist(List<Books066> books) {
		this.booklist = books;
	}

	@Override
	public String toString() {
		return "Students06 [name=" + name + ", id=" + id + ", grade=" + grade + ", books=" + booklist + "]";
	}
	
//	@Override
//	public String toString() {
//		return "Students06 [name=" + name + ", id=" + id + ", grade=" + grade + "]";
//	}
	
	
	
}
