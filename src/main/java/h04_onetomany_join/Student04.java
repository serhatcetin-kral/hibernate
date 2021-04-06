package h04_onetomany_join;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student04 {

	
	
	
	private String name;
	@Id
	private int id;
	private int grade;
	
	
	@OneToMany(mappedBy="student", orphanRemoval=true, cascade=CascadeType.ALL)
	//@OneToMany(mappedBy="student")
	private List<Books04> books=new ArrayList<Books04>();
	
	
	
	
	
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
	
	List<Books04> getBooks() {
		return books;
	}
	void setBooks(List<Books04> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "Student04 [name=" + name + ", id=" + id + ", grade=" + grade + ", books=" + books + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
