package ejercicios;

import java.util.Scanner;

public class ejercicio2 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("--------------serie Fibonacci-------------\n");
		System.out.print("Ingresa el valor que va llegar la serie: ");
		int n = entrada.nextInt();
		
		int a = 0,b=1;
		int suma;
		System.out.print(a+" "+b);
		do {
			
			suma = a+b;
			System.out.print(" "+suma);
			a=b;
			b=suma;
		}while(suma<n);
	}
}
