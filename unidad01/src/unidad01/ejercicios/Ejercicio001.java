package unidad01.ejercicios;

import java.util.Scanner;

public class Ejercicio001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Hola dime cual es la base del rectángulo");
		double base = sc.nextDouble();
		System.out.println("Ahora dime cual es la altura del rectángulo");
		double altura = sc.nextDouble();
		double perimetro = (base * 2 ) + (altura * 2);
		double area = base * altura;
		System.out.printf("El perímetro de rectangulo es %.3f y el área es %.2f\n", perimetro , area);
		
	}

}
