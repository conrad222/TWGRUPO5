package com.curso.spring.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages ="com.curso")
@ImportResource("classpath:mis-beans.xml")
public class ConfigurarBeansApp {
	
	@Bean
	public JefeEquipo jefe() {
		return new JefeEquipo();
	}

	@Bean
	public Programador programador1() {
		Programador p=new Programador();
		p.setTarea("Programa en PLSQL");
		return p;
	}
	
	@Bean
	public Programador programadorJava() {
		Programador p=new Programador();
		p.setTarea("Programa en JAVA");
		return p;
	}
	
	@Bean
	@Scope(value="prototpe")
	public Programador programador3() {
		Programador p=new Programador();
		p.setTarea("Programa en C++");
		return p;
	}
	
}
