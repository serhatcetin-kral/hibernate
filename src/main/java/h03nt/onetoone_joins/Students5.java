package h03nt.onetoone_joins;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Students5 {

	@Id
	private int id;
	private String name;
	private  int grade;
	
	@OneToOne(mappedBy="student")
	private Diary5 diary;
	
	
	
	
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
	@Override
	public String toString() {
		return "Students03 [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}
	Diary5 getDiary() {
		return diary;
	}
	void setDiary(Diary5 diary) {
		this.diary = diary;
	}
	
	
}
