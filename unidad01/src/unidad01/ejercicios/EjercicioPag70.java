package unidad01.ejercicios;

import java.util.Scanner;

public class EjercicioPag70 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int suma12;
		int resta12;
		double division;
		int mult12;
		
		System.out.println("Hola dime un numero");
		numero1 = sc.nextInt();
        System.out.println("Dime otro numero");
		numero2 = sc.nextInt();
		
		suma12 = numero1 + numero2;
		resta12 = numero1 - numero2;
		mult12 = numero1 * numero2;
		division = (numero1 * 1.0) / numero2;
		
		System.out.printf("La suma de los numeros %d y %d es %d \n", numero1 , numero2 , suma12);
		System.out.printf("La resta de los numeros %d y %d es %d \n", numero1 , numero2 , resta12);
		System.out.printf("La multiplicación de los numeros %d y %d es %d \n", numero1 , numero2 , mult12);
		System.out.printf("La suma de los numeros %d y %d es %.3f \n", numero1 , numero2 , division);
	}

}
