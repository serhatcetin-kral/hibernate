package h04_onetomany_join;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Student04 stu=new Student04();
		
		Books04 book=new Books04();
		
		
		
		Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student04.class).addAnnotatedClass(Books04.class);
		
		SessionFactory sf=con.buildSessionFactory();
		
		Session session=sf.openSession();
		
		
		Transaction tr=session.beginTransaction();
		
		
		//fetch the all books of a student whose id is 1001 by using get() meth
		stu=session.get(Student04.class,1001);	
		System.out.println(stu);
//		
		// fetch owner of whose id is 101 book by using get() method
		
//		book=session.get(Books04.class, 101);
//		
	//stu=session.get(Student04.class,book.getStudent().getId() );
//		
//		
//		
//		System.out.print(stu);
	
		
		//fetch student name and book name of common record from student04 and books04 inner oin
//		
//		String sql="select s.name,b.b_name from Student04 s inner join Books04 b on s.id=b.stuent_id";
//		
//		List<Object[]> result=session.createSQLQuery(sql).getResultList();
//		
//		for(Object[] w:result) {
//			
//			
//			System.out.println (Arrays.toString(w));
//		}
		// 2way use hql
//		System.out.println ("==============");
//		
//		String hql="select s.name,b.b_name from Student04 s inner join Books04 b on s.id=b.student";
//		
//		List<Object[]> result1=session.createQuery(hql).getResultList();
//		
//		
//		for(Object[] w:result1) {
//			
//			
//			System.out.println (Arrays.toString(w));
//		}
//		
		
		
		
		// fetch record student name book name from student04 table left join
//		
//		String sql="select s.name,b.b_name from Student04 s left join Books04 b on s.id=b.Stuent_id";
//		
//		List<Object[]> result=session.createSQLQuery(sql).getResultList();
//		for(Object[] w :result) {
//			
//			
//			System.out.println(Arrays.toString(w));
//		}
//		
		
//		
//		
//		String hql="select s.name,b.b_name from Student04 s left join Books04 b on s.id=b.student";
//		
//		List<Object[]> result=session.createQuery(hql).getResultList();
//		for(Object[] w :result) {
//			
//			
//			System.out.println(Arrays.toString(w));
//		}
//		
		
		
		
		//hw to delete al record from a table
		
//		String sql ="delete from Student04";
//		
//	int result=session.createSQLQuery(sql).executeUpdate();
//	System.out.println(result);	
//		
//		
	
//	String sql1 ="delete from Books04";
//	
//int result1=session.createSQLQuery(sql1).executeUpdate();
//System.out.println(result1);	
//	
//	
	
	// delete all data  use hql sort way
	
		session.delete(stu);
		//hata var bida bak
	
	
	
	
		tr.commit();
		
		
		
		session.close();
		sf.close();
		
		
		
		
		
		
	}

}
