package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Principale.InterfazRecuperable;

import jpa.Employee;

public class Principal implements InterfazRecuperable {
	
    public Principal() {
    	
    }
	@Override
	public Object leerEmpleado(int id) {
				
		long empId = id;  // emp 190 - Timothy Gates
	    Employee yo = null;
	    EntityManagerFactory emf =	Persistence.createEntityManagerFactory("UnidadPersonas");
	    EntityManager em = emf.createEntityManager();
	    
	    try {	
	        em.getTransaction().begin();
	        yo = em.find(Employee.class, empId);
	        System.out.println(yo.toString());
	        em.getTransaction().commit();
	    } 
	    catch (Exception e) {
	    	e.printStackTrace();
	    }
	    finally {
	    	em.close();
	        System.exit(0);//no sé pporqué no acaba sólo...parace que se queda conlgando si no le pongo esto
	    }
		
	    return yo;
	}
       
}