package h09.hql_queries;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch099 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
               Students099 st=new Students099();
               
		

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Students099.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		
		// update whose id is 9
		//1way java
		st=session.get(Students099.class,9);
		st.setName("kaan");
//		session.save(st);
	//	session.update(st);
		
		//2.way  use hql
		
		String hql="update Students099 s set s.name='murat' where id=10";
		int result=session.createQuery(hql).executeUpdate();
		System.out.print(result);
		
		//3.way 
		
		st=session.get(Students099.class,11);
		st.setName("kaan");
		session.update(st);
		
		
		
		//update grade to 100 whosr grades greater than90
		
		String hql1="update Students099 s set s.grade=100 where s.grade>90";
		int result1=session.createQuery(hql1).executeUpdate();
		System.out.println(result1+" result updated");
		
		// update data to 50 whose grade less than 50
		String hql3="from Students099 s where s.grade<50";
		List<Students099> result3=session.createQuery(hql3).getResultList();
		
		for(Students099 w:result3) {
			
			w.setGrade(50);
		     session.update(w);
		     
			
		}
		
		
		//update the record names of student whose ids less than11 to junior murat
		
		
		String hql4="update Students099 s set s.name='junior murat' where s.id<11";
		
		int result4=session.createQuery(hql4).executeUpdate();
		
		System.out.println(result4+" result updated");
		
		
		
		
		//change the names whose is ids less greater than 90 to sennior murat
		
		for(int i=11; i<=20; i++) {
		st=session.get(Students099.class, i);	
	st.setName("sessnior murat iki");
	session.update(st);
			
		}
		
		
		
		
		
		
		
		
		tx.commit();
		
		
		
		
	}

}
