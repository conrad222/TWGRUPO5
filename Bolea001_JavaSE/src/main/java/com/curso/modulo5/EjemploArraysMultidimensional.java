package com.curso.modulo5;

public class EjemploArraysMultidimensional {

	public static void main(String[] args) {
	
		int[][][][][][] datos;
		int[][][] datos2[][][];
		
		int [] [] d = new int[3] [5];
		
		d[0][1] = 4;
		for(int[] f: d) {
			for(int c : f){
				System.out.println(c);
			}
			System.out.println();
		}

	}

}
