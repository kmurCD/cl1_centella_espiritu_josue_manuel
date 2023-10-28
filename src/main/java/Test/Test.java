package Test;

import java.time.LocalDate;

import Model.Empleado;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
	    EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
	    EntityManager manager = factory.createEntityManager();
	    
	    EntityTransaction tx = manager.getTransaction();
	    
	  //  CREATE
	    tx.begin();
	    Empleado empleado = new Empleado();
	    empleado.setApellidoPaterno("Centella");
	    empleado.setApellidoMaterno("Espiritu");
	    empleado.setNombres("Josue");
	    empleado.setNroHijos(1);
	    empleado.setSueldo(50000.00);
	    empleado.setFechaNacimiento(LocalDate.of(1995, 07, 05));
	    manager.persist(empleado);
	    tx.commit();

	  //READ
	    tx.begin();
	    Empleado empleadoEncontrado = manager.find(Empleado.class, empleado.getId());
	    System.out.println("Empleado encontrado: " + empleadoEncontrado.getNombres());
	    tx.commit();

	   // UPDATE
	    empleadoEncontrado.setNombres("Nuevos Nombres");
	    manager.merge(empleadoEncontrado);
	    tx.commit();

	    // DELETE
	    tx.begin();
	    manager.remove(empleadoEncontrado);
	    tx.commit();
	    
	    manager.close();
	    factory.close();
	}

	
}
