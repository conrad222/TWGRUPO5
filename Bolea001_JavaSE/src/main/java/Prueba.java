import com.curso.modulo6.Empleado;
import com.curso.modulo6.Gerente;

public class Prueba {

	public static void main(String[] args) {
		Empleado e = new Empleado();
		e.setSalario(40.000);
	
	Gerente g = new Gerente();
	g.setNombre("Begoña Olea");
	g.setDepartamento("Desarrollo");
	g.setSalario(7000);
	
	System.out.println("g es un gerente? "
	+ ( g instanceof Gerente));
	
	System.out.println("g es un empleado? "
			+ ( e instanceof Empleado));
			
	System.out.println("e es un Gerente? "
	+ ( e instanceof Gerente));
	
	//una variable de referencia puede apuntar
	// a objetos de su clase o clases hijas
	
	Empleado carlos = new Gerente();
	
	carlos.setNombre("Carlos Romero");
	carlos.setSalario(45000);
	//carlos.setDepartamento("");
	
	//carlos tiene forma de Empleado
	//solo permite acceder a los métodos
	//declarados en la clase empleado
	
	//carlos.setDepartamento("");
	
	carlos = new Empleado();
	
	
	}
	
	
}
