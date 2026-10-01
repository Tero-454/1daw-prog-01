package unidad01.ejercicios;

import java.util.Scanner;

public class Ejercicio015 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime los segundos para transformarlos en horas, minutos y segundos.");
        int segundos = sc.nextInt();
        int horas = segundos/3600;
        int minutos = (segundos %3600)/60;
        int segundosRestantes = (segundos %3600)%60;
        System.out.printf("En los segundos %d hay %d horas, %d minutos y %d segundos\n", segundos ,horas , minutos , segundosRestantes);
	}

}
