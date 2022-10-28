package com.curso.spring.ejemplo002;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.curso.spring.ejemplo001.NominaService;

public class MiAplicacion {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-con-anotaciones.xml");
	
		NominaService s = (NominaService) ctx.getBean("nominas");
	
		s.calcularNomina();
	}
	
}