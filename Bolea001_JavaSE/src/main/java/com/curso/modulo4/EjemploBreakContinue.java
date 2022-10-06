package com.curso.modulo4;


public class EjemploBreakContinue {

	public static void main(String[] args) {
		
		//break y continue
		//caso 1
//		int a =7;
//		
//		for(int i =2; i<a;i++) {
//			
//			System.out.println(" linea "+i);
//			if(i== 4)break;
//			System.out.println(" y escribo esto ");
//		}
		
		// caso 2. CONTINUE
//		int a =7;
//		for(int i =2; i<a;i++) {
//		
//		System.out.println(" linea "+i);
//		if(i == 4)continue;
//		System.out.println(" y escribo esto ");
		// mas codigo
//	}
//		//CASO 3. BREAK ANIDADO SIN ETIQUETA
//		int a =7;
//		for(int i =2; i<a;i++) {
//			System.out.println(" linea "+i);
//			for(int j =0; j < 3; j++) {
//				System.out.println(j);//0
//			if(i == 4)break;
//			System.out.println(" y escribo esto ");
//			}
//			System.out.println("-------- bucle externo");
//			//mas codigo
//		}
		
		//CASO 4. BREAK ANIDADO con ETIQUETA
		int a =7;
		forexterno:
		for(int i =2; i<a;i++) {
			System.out.println(" linea "+i);
			for(int j =0; j < 3; j++) {
				System.out.println(j);//0
			if(i == 4)
				continue forexterno;
			System.out.println(" y escribo esto ");
			}//fin for interno
			System.out.println("-------- bucle externo");
			//mas codigo
		}// fin for externo

	}

}
