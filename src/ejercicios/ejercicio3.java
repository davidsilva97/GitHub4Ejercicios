package ejercicios;

import java.util.Scanner;

public class ejercicio3 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		int i;
		System.out.print("Ingresa tu nombre: ");
		String nombre = entrada.nextLine();
		
		for( i=0; i<nombre.length();i++) {
			System.out.println(nombre.charAt(i));		
		}
		
		System.out.println("\nTu nombre tiene "+i+" letras.");
		
	}
	
	
}
