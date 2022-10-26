package com.curso.jpa.pruebas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.curso.jpa.entidades.*;
import com.curso.jpa.entidades.Record;

public class PruebaOneToOne {
	
	public static void main(String[] args) {
		//1. crea la factoria de EM(Entity Manager)
				EntityManagerFactory factory= Persistence.createEntityManagerFactory("OracleHRPU");
				
				//2.crea un Em
				EntityManager em = factory.createEntityManager();
				
				//3. crear una transaccion
					em.getTransaction().begin();
					
					//crear un record
					//crear un cliente que tenga es record
					//y mostrar sus datos y los de su record
					Record rec = new Record(null, "REC UNO");
					em.persist(rec);
					
					Customer cliente= new Customer(null, "Luis Ramos", rec);
					
					em.persist(cliente);
					int id = cliente.getId();
					em.getTransaction().commit();
					
					System.out.println("Buscar el empleado cuyo id es "+ id);
				
					Customer cEncontrado= em.find(Customer.class, id);
					if(cEncontrado !=null) {
						System.out.printf("El cliente %s tiene el record %s",
								cEncontrado.getCustomerName(),
								cEncontrado.getRecord().getName());
					}else {
						System.out.println("cliente no encontrado");
					}
					
						
	}

}
