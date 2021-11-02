package h06_ManyToMany_joins;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch06 {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		
		Students066 st=new Students066();
		Books066 book=new Books066();
		
		
		
		Configuration con =new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Students066.class).addAnnotatedClass(Books066.class);
         SessionFactory sf=con.buildSessionFactory();
         Session session=sf.openSession();
         
         
         Transaction tr=session.beginTransaction();
         
         // fetch the studnets whose id is 1001
//         
//        st=session.get(Students066.class,101);
//         System.out.print(st);
         
//         book=session.get(Books066.class, 1);
//         System.out.print(book);
      
         //fetch the recored whose name is owner name as well
//         String hql="from Books066 b where b_name='hansel'";
//         List<Object[]> result=session.createQuery(hql).getResultList();
//         System.out.print(result);
         
         //fetch record murat kaans boook and info
         
         
//         String hql="from Students066 s where s.name='murat'";
//        Object result=session.createQuery(hql).getSingleResult();
//        System.out.print(result);
         
         
        // /fetch all students name
         
//         String hql="SELECT s.name FROM Students066 s";
//         List<Object> result=session.createQuery(hql).list();
//        // System.out.print(result);
//         
//         for(Object w:result) {
//        	 System.out.print(w); 
//        	 
//         }
         
         
         //fetch books names
//         String hql="select b.b_name from Books066 b";
//         List<Object[]> result=session.createQuery(hql).getResultList();
//         System.out.println(result);
         //book name id 1
//         String hql="select b.b_name from Books066 b where b.b_id='1'";
//         Object result=session.createQuery(hql).uniqueResult();         
//         System.out.println(result);
         
         // fetch the recor students name books name  whose id is 1002
         
         String hql="select s.name,b.b_name from Students066 s inner join fetch Books066 b  on  s.id='102'";
        List<Object[]> result=session.createQuery(hql).getResultList();
         for(Object[] w:result) {
        	 System.out.println(Arrays.toString(w));
        	 
         }
         
         
         tr.commit();
         session.close();
         sf.close();
		
		
	}

}
