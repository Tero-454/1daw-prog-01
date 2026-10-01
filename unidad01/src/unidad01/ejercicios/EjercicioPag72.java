package unidad01.ejercicios;

import java.util.Scanner;

public class EjercicioPag72 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero1;
		int numero2;
		
		
		
		System.out.println("Hola dime un numero entero");
		numero1 = sc.nextInt();
		System.out.println("Hola dime otro numero entero");
		numero2 = sc.nextInt();
		
		double media = ((numero1 + numero2) * 1.0)/2;
		
		System.out.printf("La media de los numeros %d y %d es %.3f\n" , numero1 , numero2 , media);
		
		
	}

}
