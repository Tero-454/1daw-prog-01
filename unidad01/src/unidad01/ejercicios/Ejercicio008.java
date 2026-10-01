package unidad01.ejercicios;

import java.util.Scanner;

public class Ejercicio008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero");
		double numeroUno = sc.nextDouble();
		System.out.println("Dime otro numero");
		double numeroDos = sc.nextDouble();
		double distancia = Math.abs(numeroUno - numeroDos);
		System.out.printf("La distancia de %.3f y %.3f es de %.3f\n", numeroUno , numeroDos , distancia);
		

	}

}
