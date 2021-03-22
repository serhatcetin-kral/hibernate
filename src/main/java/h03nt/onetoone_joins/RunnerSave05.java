package h03nt.onetoone_joins;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave05 {

	public static void main(String[] args) {
	
		
		Diary5 di=new Diary5();
	    Diary5 di1=new Diary5();
		
	    
		Students5 st=new Students5();
		
		Students5 st1=new Students5();
		
		
		
		st.setGrade(2);
		st.setId(100);
		st.setName("serpil");
		st.setDiary(di);
		
		di.setD_id(1);
		di.setD_name("pinokyo");
		di.setStudent(st);
	  
		
		st1.setDiary(di1);
		st1.setGrade(3);
		st1.setId(101);
		st1.setName("murat");
		
		di1.setD_id(2);
		di1.setD_name("yazin gunluk");
		
		di1.setStudent(st1);
		
		
		
	Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Students5.class).addAnnotatedClass(Diary5.class);
	
	
	SessionFactory sf=con.buildSessionFactory();
	Session session=sf.openSession();
	
	
	Transaction tr=session.beginTransaction();
	
	//session.save(st);
	//session.save(di);
	
//	session.save(st1);
	session.save(di1);
	
	
	
	tr.commit();
	
	
	
	
	}
	
	
	
	
	
}
