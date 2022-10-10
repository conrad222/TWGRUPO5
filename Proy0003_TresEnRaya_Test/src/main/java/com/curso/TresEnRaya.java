package com.curso;

public class TresEnRaya {
	
	private Character[][] tablero; //array de dos dimensiones
	private Character jugadorActual;
	
	//constructor
	public TresEnRaya() {
		this.tablero= new Character[3][3]; //todas las celdas tendran null
		this.jugadorActual= 'X';
	}

	public int suma(int n, int n2) {
		//return n;// error
		return n + n2;
	}
	public void jugar(int x, int y) {
		validarCoordenadaX(x);
		validarCoordenadaY(y);
		ponerFicha(x,y);
		
	}
	
	public void ponerFicha(int x, int y) {
		
//		validarCoordenadaX(x);
//		validarCoordenadaY(y);
		//valida x
//		if(x < 0 || x >2) {
//			throw new RuntimeException("la ficha no se puede posicionar fuera del tablero");
//		}//valida y
//		if(y < 0 || y >2) {
//			throw new RuntimeException("la ficha no se puede posicionar fuera del tablero");
//		}
//		//valida que no hay ya una pieza
		if(tablero[x][y] !=null) {
			throw new RuntimeException("Ya hay una ficha en esta posicion");
		}
		
		tablero[x][y] = 'X';
		
		if(this.jugadorActual == 'X') {
			this.jugadorActual = '0';
			
		}else {
			this.jugadorActual = 'X';
		}
		
		
	}//fin ponerFicha

	public Character verFicha(int x, int y) {
		validarCoordenadaX(x);
		validarCoordenadaY(y);
		//TODO validar x , y
		return this.tablero[x][y];
		
	}
	
	private void validarCoordenadaX(int x) {
		if(x < 0 || x >2) {
			throw new RuntimeException("la ficha no se puede posicionar fuera del tablero");
		}
	}
	
	private void validarCoordenadaY(int y) {
		
		if(y < 0 || y >2) {
			throw new RuntimeException("la ficha no se puede posicionar fuera del tablero");
		}
		//va
	}

	public Character getJugadorActual() {
		return jugadorActual;
	}

	
	
	
	
	
}
