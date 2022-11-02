package com.curso.spring.Prácticas_Spring_IoC_Anotaciones;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-jefe.xml");
		
		Gestor g = (Gestor) ctx.getBean("jefe");
	
		g.gestionar();
		
	}
	
}
