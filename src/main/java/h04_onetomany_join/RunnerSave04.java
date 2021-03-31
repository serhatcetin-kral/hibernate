package h04_onetomany_join;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Books04 book1=new Books04();
		Books04 book2=new Books04();
		Books04 book3=new Books04();
		
		Student04 std1=new Student04();
		Student04 std2=new Student04();
		Student04 std3=new Student04();
		
		book1.setB_id(101);
		book1.setB_name("hansel");
		book1.setStudent(std1);
		
		std1.getBooks().add(book1);
		std1.getBooks().add(book2);
		
		std1.setName("murat");
		std1.setId(1001);
		std1.setGrade(6);
		std1.setBooks(std1.getBooks());
		
		book2.setB_id(102);
		book2.setB_name("gratel");
		book2.setStudent(std1);
		
		book3.setB_id(103);
		book3.setB_name("pinokya");
		book3.setStudent(std3);
		
		
		
		std2.getBooks().add(book2);
		std2.getBooks().add(book3);
		
		std2.setName("kaan");
		std2.setId(1002);
		std2.setGrade(1);
		std2.setBooks(std2.getBooks());
		
		std3.setName("serpil");
		std3.setId(1003);
		std3.setGrade(8);
		std3.setBooks(std3.getBooks());
		
		
		
		
		Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student04.class).addAnnotatedClass(Books04.class);
		
		
		SessionFactory sf=con.buildSessionFactory();
		
		Session session=sf.openSession();
		
		
		Transaction tr=session.beginTransaction();
		
		session.save(std1);
		session.save(std2);
		session.save(std3);
		session.save(book1);
		session.save(book3);
		session.save(book2);
		
		tr.commit();
		
	}

}
