package unidad01.ejercicios;

import java.util.Scanner;

public class Ejercicio014 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los minutos");
		int minutos = sc.nextInt();
		int horas = minutos/60;
		int minutosExtras = minutos%60;
		System.out.printf("En los minutos %d hay un total de %d horas y %d minutos.\n" , minutos , horas , minutosExtras);
	}

}
