package unidad01.ejercicios;

import java.util.Scanner;

public class Ejercicio018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		System.out.println("¿Cuantas monedas tienes de dos euros?");
		int dosEuro = sc.nextInt();
		System.out.println("¿Cuantas monedas tienes de un euro?");
		int unEuro = sc.nextInt();
		System.out.println("¿Cuantas monedas tienes de cicuenta centimos?");
		int cincuenta = sc.nextInt();
		System.out.println("¿Cuantas monedas tienes de vente centimos?");
		int vente = sc.nextInt();
		System.out.println("¿Cuantas monedas tienes de diez centimos?");
		int diez = sc.nextInt();
		int total = dosEuro * 200 + unEuro * 100 + cincuenta * 50 + vente * 20 + diez * 10;
		int euros = total/100;
		int centimos = total%100;
		System.out.printf("Tienes %d euros y %d centimos.\n",euros , centimos);

	}

}
