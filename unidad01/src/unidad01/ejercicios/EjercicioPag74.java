package unidad01.ejercicios;

import java.util.Scanner;

public class EjercicioPag74 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int edad;
		boolean permitido;
		System.out.println("¿Cual es tu edad?");
		edad = sc.nextInt();
		permitido = 18 <= edad; 
		System.out.println("Tienes mas de 18 o 18 = " + permitido );
	
				
	}

}
