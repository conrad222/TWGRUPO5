package com.curso.jpa.pruebas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.curso.jpa.entidades.Departamento;
import com.curso.jpa.entidades.Empleado;

public class PruebasEmpleado {

	public static void main(String[] args) {
		//1. crea la factoria de EM(Entity Manager)
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("OracleHRPU");
		
		//2.crea un Em
		EntityManager em = factory.createEntityManager();
		
		//3. crear una transaccion
		try {
			em.getTransaction().begin();
			
			Empleado e = new Empleado();
			e.setNombre("Luis");
			e.setApellidos("Ramos");
			e.setFechaContratacion(new java.util.Date());
			Departamento d = new Departamento();
			d.setNombreDepartamento("Departamento1");
			e.setIdTrabajo("ST_MAN");
			e.setEmail("luis.ramos@curso.es");
			
			em.persist(e);
			
			System.out.println("Creo el empleado. Nuevo id "+ e.getIdTrabajo());
			
			em.getTransaction().commit();
		}catch(Exception e) {
			em.getTransaction().rollback();
		}
				
		
		//4. crear un Empleado nuevo
		
		Empleado empleado = new Empleado();
		
		
		//5. persistir en bd
		
		
		//6 confirmar transaccion si ok rollback si fallo.
		
		
	}
}
