package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static EntityManagerFactory emf;
	public static EntityManager em;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		debutTest();
		finTest();
	}
	
	public static void debutTest(){
		emf= Persistence.createEntityManagerFactory("jpa");
		em = emf.createEntityManager();
	}

	public static void finTest(){
		em.close();
		emf.close();
	}
}
