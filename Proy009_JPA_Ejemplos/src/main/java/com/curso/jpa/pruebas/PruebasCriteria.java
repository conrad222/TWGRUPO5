package com.curso.jpa.pruebas;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.curso.jpa.entidades.Departamento;
import com.curso.jpa.entidades.Empleado;

public class PruebasCriteria {
	
	public static void main(String[] args) {
		//Predicado parte de la consulta
		//1. Usando CriteriaBuilder
	
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("OracleHRPU");
					 
		EntityManager em = factory.createEntityManager();
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		
		CriteriaQuery<Departamento> cq = cb.createQuery(Departamento.class);
		
		Root<Departamento> departamento = cq.from(Departamento.class);

		Predicate idLocalidad = null;
		Predicate idManager = null;
		
		Predicate condicionLoc = null;
		Predicate condicionManager = null;
		
		//	 Obtener todos los departamentos
		//	 por localidad OR manager
		
		Predicate condiciones=null;
		if( idLocalidad !=null && condicionManager !=null ) {
			condicionLoc = cb.equal(departamento.get("idLocalidad"), idLocalidad);
		}else if(idManager !=null) {
			condicionManager = cb.equal(departamento.get("idManager"), idManager);
		}
		//condicion localidad y manger es opcional
		cq.where(condiciones);
		
		Query qCriteria = em.createQuery(cq);
		List<Departamento> listaDep = qCriteria.getResultList();
		
		System.out.println(".... LOS Departamentos: ");
		
		for(Departamento emp : listaDep) {
			System.out.printf(" %s %s %n", emp.getIdLocalidad(), emp.getIdManager());
		}
	}

}
