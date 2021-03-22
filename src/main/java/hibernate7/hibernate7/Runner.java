package hibernate7.hibernate7;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Teacher tc=new Teacher();
		
		tc.setId(101);
		tc.setName("murat");
		tc.setSalary(120);
		tc.setSubject("it");
		
	Teacher tc1=new Teacher();
		
		tc1.setId(102);
		tc1.setName("muratkaan");
		tc1.setSalary(125);
		tc1.setSubject("math");
		
		Teacher tc2=new Teacher();
		tc2.setId(103);
		tc2.setName("serhat");
		tc2.setSalary(300);
		tc2.setSubject("it");
		
		Teacher tc3=new Teacher();
		tc3.setId(105);
		tc3.setName("murat");
		tc3.setSalary(300);
		tc3.setSubject("bio");
		
		
		
		Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Teacher.class);
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tr=session.beginTransaction();
		
		
		//session.save(tc);
		//session.save(tc1);
//	       session.save(tc2);
	       session.save(tc3);
		
		tr.commit();
		
		sf.close();
		session.close();
		
	}

}
