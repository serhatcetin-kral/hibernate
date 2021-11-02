package h08.firstcache_secondcache;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Students088")
public class Students088 {
	
	@Id
	private int id;

	@Column(name="students_name")
	private String name;
	private int grade;

	@OneToMany(mappedBy="student") 
	private List<Books088> booksList = new ArrayList<Books088>();

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
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

	List<Books088> getBooksList() {
		return booksList;
	}

	void setBooksList(List<Books088> booksList) {
		this.booksList = booksList;
	}

	@Override
	public String toString() {
		return "Students08 [id=" + id + ", name=" + name + ", grade=" + grade +  "]";
	}
	
	
	
}
