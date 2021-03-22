package hibernate7.hibernate7;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Teacher tc2=new Teacher();
//		Teacher tc3=new Teacher();
		
		Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Teacher.class);
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		
		
		/*
		 get() method is used to fetch data from database
		 I created a Students object to store the data which get() method returned
		 The object can be created like Students student1 = null; as well
		 I created a toString() method to be able to see the output on the console
		*/
		
		
		
		
		Transaction tr=session.beginTransaction();
		
//		tc2=session.get(Teacher.class,101);
//		
//		tc3=session.get(Teacher.class, 103);
//		System.out.println(tc2);
//		System.out.println(tc3);
		
		//2way use sql queries better  but not good
//		
//	String sql1="select * from Teacher";
//       List<Object[]> resultlist=session.createSQLQuery(sql1).getResultList();
//		for(Object[] w:resultlist) {
//			System.out.println(Arrays.toString(w));
//			
//		}
		
	//3.way hoq hibernate
//		
//		String hql1="from Teacher";
//		List<Object> result2=session.createQuery(hql1).getResultList();
//		
//		//System.out.println(result2); 
//		
//		
//		
//		for(Object w:result2) {
//			System.out.println(w);
//			
//		}
//		
		
		
		//give result whose name is 'murat' if not uniqe
//		
//		String sql="select * from Teacher where FULLNAME='murat' ";
//		
//		List<Object[]> result=session.createSQLQuery(sql).getResultList();
//		for(Object[] w : result) {
//			System.out.println(Arrays.toString(w));
//		}
		
		//if sure record is uniqe
		
//		
//		String sql="select * from Teacher where FULLNAME='serhat' ";
//		Object[] result=(Object[])session.createSQLQuery(sql).uniqueResult();
//		System.out.print(Arrays.toString(result));
//		
		
		
		
		
		
		//fetch serhat with hql
		// hql use aliasess most of time
		//String hql="from Teacher t where t.name='serhat'";
//		Object result=session.createQuery(hql).uniqueResult();
		//System.out.print(result);
//		
//		//by using the hql whose salary is 120
//			String hql="from Teacher where salary=120";
//			List<Object> result=session.createQuery(hql).getResultList();
//		      for(Object w:result) {
//		    	  
//		    	  System.out.print(w);
//		      }
		
		
		      //by use hql whose salary grater than 120 fetch the names
		      String hql="SELECT t.name from Teacher t where salary=120";
		      List<Object> result=session.createQuery(hql).getResultList();
		      for(Object w:result) {
		    	  System.out.print(w);
		    	  
		      }
		      
		      
		tr.commit();
		
		
		sf.close();
		session.close();
		
		
	}

}
