package h02nt.embedded_annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave02 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Courses courses=new Courses();
		courses.setElectives("art,music");
		courses.setMandatory("math,eng");
		
		Students02 st=new Students02();
		st.setGrade(101);
		st.setCourses(courses);
		st.setName("murat");
		st.setGrade(1);
		
		Students02 st1=new Students02();
		st1.setGrade(1);
		st1.setCourses(courses);
		st1.setName("muratkaan");
		st1.setGrade(2);
		st1.setSsd_id(102);
		
		Students02 st2=new Students02();
		st2.setGrade(1);
		
		st2.setName("muratkaancetin");
		st2.setGrade(2);
		st2.setSsd_id(103);
		
		
		
		Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Students02.class);
		
		SessionFactory sf=con.buildSessionFactory();
		 Session session=sf.openSession();
		 
		 Transaction tr=session.beginTransaction();
		 
		 
		// session.save(st);
		 
		 //session.save(st1);
		 session.save(st2);
		 
		 
		 tr.commit();
		
		
		
		
	}

}
