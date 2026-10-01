package unidad01.ejercicios;

import java.util.Scanner;

public class Ejercicio022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		System.out.println("Dime la que temperatura que hace");
		double temp = sc.nextDouble();
		System.out.println("Dime la humedad del ambiente en numero entero");
		double humedad = sc.nextDouble();
		boolean clima = 0<temp && temp<35 && 85>humedad;
		System.out.println(clima ? "Clima moderado":"Clima extremo");
		
	}

}
