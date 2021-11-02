package h12.sessionfactory_entitymanager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Save {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Students12 st=new Students12();
		
		st.setId(1005);
		st.setMathGrade(85);
		st.setName("serhat");
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
		
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		
		//em.persist(st);
		
		
//		st=em.find(Students12.class, 1001);
//		System.out.print(st);
		
		//em.remove(st);
		
		
		Students12 st1=em.find(Students12.class, 1005);
		st1.setMathGrade(100);
		em.merge(st1);
		
		
        em.getTransaction().commit();
		
		
        
        
	}

}
