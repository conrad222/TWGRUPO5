package com.curso.spring.ejemplo001;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MiAplicacion {
	
	public static void main(String[] args) {
		
		//SIN SPRING Inyeccion de la Dependencia
		SaludoService servicio = new SaludoServiceImp();
		servicio.saludar("Amigo");
		
		
		//CON SPRING IOC
		// ya no voy yo a crear nunca mas una instancia de la clase
		//SaludoServiceImp
		//sino que voy a solicitar al Contenedor de Beans de Spring
		//que me entregue una instancia
		
		//sitio donde va a acceder al contenedor beans
		ApplicationContext ctx = new ClassPathXmlApplicationContext("mis-beans.xml");
		
		System.out.println(".... solicito el bean saludador1");
		
		SaludoService s1 = (SaludoService) ctx.getBean("saludadorPrototipo");
		s1.saludar("soy saludador1");
		
		SaludoService s2 = (SaludoService) ctx.getBean("saludador1");
		System.out.println(s2);
		
		SaludoService s3 = (SaludoService) ctx.getBean("saludadorAdios");
		s3.saludar("Adios saludador");
	}

}
