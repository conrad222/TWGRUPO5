package com.curso.jpa.pruebas;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.curso.jpa.entidades.Trabajo;

public class PruebaTrabajoJPA {

	public static void main(String[] args) {
		
		//1. Crear una Factoria de Entity Manager
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("OracleHRPU");
	
		//2. Obetenemos un Entity Manger
		// 	que conecta con HR de ORACLE  y mapea clases entidad
		EntityManager em = factory.createEntityManager();
	
		//3. Obtener el trabajo con el id "AD_VP"
		
		Trabajo t = em.find(Trabajo.class, "AD_VP");
		System.out.println(t);
	
		//4. Crear un trabajo
		
		Trabajo tNuevo = new Trabajo("BE_OL", "Tareas Super Dificiles", 233330.0,53000.0);
		//inicia una nueva transaccional
		em.getTransaction().begin();
		
		
//		em.persist(tNuevo); //insert
		
		//Obtiene la transaccion y la confirma
		em.getTransaction().commit();
		
		//5. Modificacion
		Trabajo tNuevoModificado = new Trabajo("BE_OL", "Tareas Super Dificiles de verdad", 233330.0,53000.0);
		//5.1 -modificar despues de un find
		try {
			
		
		Trabajo tDesdeBD = em.find(Trabajo.class, tNuevoModificado.getId());
		
		tDesdeBD.setTituloTrabajo(tNuevoModificado.getTituloTrabajo());
		
		em.getTransaction().commit();
		
		}catch(Exception e){
			em.getTransaction().rollback();
		}
		
		//5. Modificar Modo 2. usando em.merge
		
		Trabajo otraVezTrabajoModif = new Trabajo("BE_OL", "Tareas Super Dificiles de verdad *", 233330.0,53000.0);
		
		em.getTransaction().begin();
		
		System.out.println("...merge");
		Trabajo trabajoEnBD = em.merge(otraVezTrabajoModif);
		System.out.println("...después de merge");
		//otraVezTrabajoModif no esta attached contra la bd
		otraVezTrabajoModif.setTituloTrabajo("asdfsfd");
		
		//trabajoEnb si esta sincronizado con la bd
		trabajoEnBD.setTituloTrabajo("este si esta attached");
		System.out.println("...antes de commit");
		em.getTransaction().commit(); //-> update
		System.out.println("...después de commit");
		
		//6. Borrar
		em.getTransaction().begin();
		Trabajo tABorrar = new Trabajo();
		tABorrar.setId("BE_LOL");
		
		//find objeto
		Trabajo tBD= em.find(Trabajo.class, tABorrar.getId());
		
		//tBD si está sincronizado
		
		//remove
		em.remove(tBD);
		em.getTransaction().commit();
		
		// 7. CONSULTA JPAQUERY
		Query consulta = em.createNamedQuery("SELECT t FROM Trabajo t");
		
		List<Trabajo> lista = consulta.getResultList();
		System.out.println(".... lista de trabajos");
		for(Trabajo trabajo : lista) {
			System.out.println(trabajo);
		}
	}
}
