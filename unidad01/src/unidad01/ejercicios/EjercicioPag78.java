package unidad01.ejercicios;

import java.util.Scanner;

public class EjercicioPag78 {
	public static void main(String[] args) {
		int numero;
		boolean par;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un numero");
		numero = sc.nextInt();
		par = 0 == (numero%2);
		System.out.printf("¿El numero %d es par? %s\n", numero , par);

	}


}
