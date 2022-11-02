package com.curso.spring.configuracion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.curso.spring.Prácticas_Spring_IoC_Anotaciones.Gestor;

public class Prueba {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurarBeansApp.class);
		
		Gestor g = (Gestor) ctx.getBean("jefe");
	
		g.gestionar();
	}
}
