package unidad01.ejercicios;

import java.util.Scanner;

public class EjercicioPag80 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean lluvia;
		boolean tarea;
		boolean biblioteca;
		boolean salirCalle;
		System.out.println("¿Tienes que ir a a la biblioteca?");
		biblioteca = sc.nextBoolean();

		System.out.println("¿Tienes hecho los deberes?");
		tarea = sc.nextBoolean();
		
		System.out.println("¿Esta lloviendo?");
		lluvia = sc.nextBoolean();
		salirCalle = biblioteca || tarea && !lluvia;
		System.out.printf("¿Puedes slair a la calle? %s\n", salirCalle);



	}

}
