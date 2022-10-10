package com.curso.modulo6;

public class App {
	public void hablarconGente(Empleado[] lista) {
		for(Empleado a : lista) {
			a.hablar();
		}
	}
	
	public static void main(String[] args) {
		
		Empleado[] empleados = {//array de tipos Empleados
				new Ingeniero(),
				new Gerente(),
				new Secretario(),
				new Director(),
			
		};
		
		App app = new App();
		app.hablarconGente(empleados);
		
	}
}
