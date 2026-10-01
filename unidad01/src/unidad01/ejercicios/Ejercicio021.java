package unidad01.ejercicios;

import java.util.Scanner;

public class Ejercicio021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		System.out.println("Dime la primera nota");
		double nota1 = sc.nextDouble();
		System.out.println("Dime la segunda nota");
		double nota2 = sc.nextDouble();
		System.out.println("Dime la tercera nota");
		double nota3 = sc.nextDouble();
		double media = (nota1 + nota2 + nota3)/3;
		boolean aprobado = media>=5 && nota1>3 && nota2>3 && nota3>3;
		System.out.printf("Tu media es de %.2f", media);
		System.out.println(aprobado ? " estas aprobado":" has suspendido");
	}

}
