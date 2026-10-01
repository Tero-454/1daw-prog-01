package unidad01.ejercicios;

import java.util.Scanner;

public class Ejercicio002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuanto mide el primer cateto del rectangulo?");
		double cateto1 = sc.nextDouble();
		System.out.println("¿Cuanto mide el segundo cateto del rectangulo?");
		double cateto2 = sc.nextDouble();
		double hipotenusa = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2)) ;
		System.out.printf("La hipotenusa del triangulo rectangulo es %.2f", hipotenusa);
	}

}
