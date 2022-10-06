package com.curso.modulo5;

public class EjemploArraysMultidimensional {

	public static void main(String[] args) {
	
		int[][][][][][] datos;
		int[][][] datos2[][][];
		
		int [] [] d = new int[3] [5];//array regular
		
		d[0][1] = 4;
		for(int[] f: d) {
			for(int c : f){
				System.out.println(c);
			}
			System.out.println();
		}
		
		//crear un array de dos dimensiones pero irregular
		
		int[] [] notas = new int[3][];//creo la variable
		notas [0]= new int[2]; //0, 0
		notas[1] = new int[6];//notas 1 apunta, mete un array de 6 elementos //0, 0, 0, 0, 0, 0
//		notas[2] = new int[5];//inicializo notas 2 para que no me quede null
		notas[1][2] = 7;
		notas[2][1] = 44;// produce nullpointerException porque notas[2] es null		
		
		
		int[][][] grande = new int[3][][];
		
		/*
		  grande --> NULL 		| NULL 		| NULL
		  			grande[0]	 grande[1]	  grande[2]
		  espera que  que en estas tres posiciones guardemos int[][]
		  
		 */
		
		grande[0] = new int[2][2];
		
		/*
		  grande -->   direccionmemoria		| NULL 		| NULL
		  					grande[0]	 grande[1]	  grande[2]
								|
								|
								v
					|		   dir	|	dir	|
								|		|
								v		v
								0  | 0    0 | 0 
		  
		 */
		
	}

}
