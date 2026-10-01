package unidad01.ejercicios;

import java.util.Scanner;

public class EjercicioPag79 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int edad;
		boolean edadTrabajo;
		System.out.println("¿cuantos años tines?");
		edad = sc.nextInt();
		edadTrabajo = edad >= 16 && edad < 67;
		System.out.println("¿Estas en edad de trabajo?");
		System.out.println(edadTrabajo);
		
	}

}
