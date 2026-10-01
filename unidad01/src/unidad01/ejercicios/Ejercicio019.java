package unidad01.ejercicios;

import java.util.Scanner;

public class Ejercicio019 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cual es tu edad?");
		int edad = sc.nextInt();
		System.out.println("¿Tienes pase VIP?");
		boolean vip = sc.nextBoolean();
		boolean entrar = edad>= 18 && vip; 
		System.out.println(entrar? "Si puedes entrar":"No puedes entrar");
		
	}

}
