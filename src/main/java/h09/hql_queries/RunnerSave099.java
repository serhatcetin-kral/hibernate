package h09.hql_queries;

import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave099 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Students099.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		
		Random r=new Random();
		
		for(int i=1; i<=50; i++) {
			
		Students099 st=new Students099();
		
		st.setId(i);
		st.setName("name "+i);
		st.setGrade(r.nextInt(100));
		session.save(st);
		}
		
		
		
		
		tx.commit();
		
		
		
		
		
		
		
		
		
	}

}
