package unidad01.ejercicios;

import java.util.Scanner;

public class Ejercicio020 {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		System.out.println("Dime tu edad");
		int edad = sc.nextInt();
		boolean descuento = edad<18 || edad>65; 
		System.out.println(descuento ? "Descuento aplicable":"Tarifa normal");
	}

}
