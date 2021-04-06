package h06_ManyToMany_joins;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Books066 bk1=new Books066();
		Books066 bk2=new Books066();
	    Books066 bk3=new Books066();
		
		Students066 st1=new Students066();
		Students066 st2=new Students066();
		Students066 st3=new Students066();
		
		st1.setGrade(1);
		st1.setId(101);
		st1.setName("murat");
		st1.getBooklist().add(bk1);
		
		st2.setGrade(3);
		st2.setId(102);
		st2.setName("kaan");
		st2.getBooklist().add(bk2);
		st2.getBooklist().add(bk1);
		st2.getBooklist().add(bk3);
		
		
		st3.setGrade(5);
		st3.setId(103);
		st3.setName("serhat");
		st3.getBooklist().add(bk2);
		st3.getBooklist().add(bk3);
		
		
		bk1.setB_id(1);
		bk1.setB_name("hansel");
//		bk1.getStudents().add(st1);
//		bk1.getStudents().add(st2);
//		bk1.setStudents(bk1.getStudents());
		
		bk2.setB_id(2);
		bk2.setB_name("gratel");
//		bk2.getStudents().add(st2);
//		bk2.getStudents().add(st3);
//		bk2.setStudents(bk2.getStudents());
		
		bk3.setB_id(3);
		bk3.setB_name("pinokyo");
//		bk3.getStudents().add(st3);
//		bk3.getStudents().add(st2);
//		bk3.getStudents().add(st1);
		
		
		
		Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Students066.class).addAnnotatedClass(Books066.class);
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		
		
		Transaction tr=session.beginTransaction();
		
		session.save(st1);
		session.save(st2);
		session.save(st3);
		session.save(bk1);
		session.save(bk2);
		
		session.save(bk3);
		
		tr.commit();
		
		
		
		
	}

}
