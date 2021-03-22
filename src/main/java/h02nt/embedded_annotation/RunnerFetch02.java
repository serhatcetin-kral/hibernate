package h02nt.embedded_annotation;



import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch02 {

	
	public static void main(String[] args) {
		
		
		Students02 st=new Students02();
		
		
		
		Configuration con =new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Students02.class);
		 SessionFactory sf=con.buildSessionFactory();
		 Session session=sf.openSession();
		 
		 
		 Transaction tr1=session.beginTransaction();
		 
		 
		 // fetch record whose id is 103 by get()
		 
		st=session.get(Students02.class, 102);		 
		 
		
		System.out.println(st);
		
		//fetch name courses by hql
		
		String hql="select s.name,s.courses.mandatory from Students02 s";
		
		List<Object[]> result=session.createQuery(hql).getResultList();
		
		
		for(Object[] w:result) {
			
			System.out.print(Arrays.toString(w));
			
		}
		
		
		
		
		 tr1.commit();
		
		 session.close();
		 sf.close();
		
		
		
	}
	
	
	
}
