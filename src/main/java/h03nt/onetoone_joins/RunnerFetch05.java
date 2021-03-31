package h03nt.onetoone_joins;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Students5 s=new Students5();
		
		Diary5 d=new Diary5();
		
		
		
		Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Students5.class).addAnnotatedClass(Diary5.class);
		
		SessionFactory sf=con.buildSessionFactory();
		
		Session session=sf.openSession();
		
		
		Transaction tr=session.beginTransaction();
		
		
		
		// fetch data whose is id is 101 use get
		
	
//		s=session.get(Students5.class, 101);
//		
//		System.out.print(s);
		
		// fetch the diary details whose id is 101 by using get
		
//		d=session.get(Diary5.class,1);
//		System.out.print(d);
//		
		// fetch student name from student table diary name from diary table and student grade common record with inner join
		
//		String hql="select s.name,d.d_name,s.grade from Students5 s INNER JOIN Diary5 d on s.id=d.student";
//		
//		List<Object[]> result=session.createQuery(hql).getResultList();
//		
//		for(Object[] w: result) {
//			
//			System.out.println(Arrays.toString(w));
//		}
//		
//		
		// fetch data student5 name grade and dria name use left join 
		
		
		
//		String hql="select s.name,d.d_name,s.grade from Students5 s left JOIN Diary5 d on s.id=d.student";
//		List<Object[]> result=session.createQuery(hql).getResultList();
//		for(Object[] w: result) {
//			System.out.println(Arrays.toString(w));
//		}
//		
//		// fetch data student5 name grade and dria name use full join 
//		
//		System.out.println("+++++++++++++");
//		
//		
//		String hql1="select s.name,d.d_name,s.grade from Students5 s  full join  Diary5 d on s.id=d.student";
//		List<Object[]> result1=session.createQuery(hql1).getResultList();
//		for(Object[] w1: result1) {
//			System.out.println(Arrays.toString(w1));
//		}
//		
		// fetch all student data of common record from studnts5 and diary5 table 
		
//		
//		String hql="from Students5 s inner join fetch s.diary";
//		
//		List<Students5> result=session.createQuery(hql).getResultList();
//		
//		for(Students5 w:result) {
//			
//			System.out.println(w);
//		}
//		
		
		//fetch all diary information of common record from student5 and Diary5
		
//		String hql="from Diary5 d inner join fetch d.student";
//		
//		List<Diary5> result=session.createQuery(hql).getResultList();
//		for(Diary5 w:result) {
//			
//			
//			System.out.print(w);
//		}
		
		
//		// fetch student name student grade diary name of all records from students5 and diary5 tables
//		
//		
//		String sql="select s.name,s.grade,d.d_name from Students5 s full join Diary5 d on s.id=d.student_id";
//		//1way sql
//		List<Object[]> result=session.createSQLQuery(sql).getResultList();
//		
//		for(Object[] w : result) {
//			
//			System.out.print(Arrays.toString(w));
//		}
		
		//2.way hql 
		 String  hql="select s.name,s.grade,d.d_name from Students5 s full join Diary5 d on s.id=d.student";
		 List<Object[]> result=session.createQuery(hql).getResultList();
		 
		for(Object[] w:result) {
			
			
			System.out.println(Arrays.toString(w));
		}
		
		tr.commit();
		
		session.close();
		sf.close();
		
		
		
		
		
		
		
	}

}
