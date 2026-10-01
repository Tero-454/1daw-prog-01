package unidad01.ejercicios;

import java.util.Scanner;

public class EjercicioPag84 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pManzanas = 2.35;
		double pPeras = 1.95;
		System.out.println("¿Cuantos kilos de manzana haz vendidido el primer semestre?");
		double manzanas = sc.nextDouble();
		System.out.println("¿Cuantos kilos de peras haz vendidido el primer semestre?");
		double peras = sc.nextDouble();
		double total1Semestre = (pManzanas * manzanas ) +  (pPeras * peras );
		
		System.out.println("¿Cuantos kilos de manzana haz vendidido el segundo semestre?");
		double manzanas2 = sc.nextDouble();
		System.out.println("¿Cuantos kilos de peras haz vendidido el segundo semestre?");
		double peras2 = sc.nextDouble();
		double total2Semestre = (pManzanas * manzanas2) +  (pPeras * peras2);
		double total = total1Semestre + total2Semestre; 
		System.out.printf("Haz ganado %.2f$ en todo el año", total);
		

	}

}
