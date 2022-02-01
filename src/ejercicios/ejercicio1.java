package ejercicios;
import java.util.Scanner;

public class ejercicio1 {
	 public static void main(String[] args){
	        Scanner console = new Scanner(System.in);
	        int num;
	        
	        System.out.print("Enter any positive integer: ");
	        num = console.nextInt();
	                
	        System.out.println("Multiplication Table of " + num);
	        
	       //TODO implement While loop to get print result
	        int i = 1;
	        while(i<=10) {
	        	int multiplicacion = i*num;
	        	System.out.print(num+" x "+i+" = "+multiplicacion+"\n");
	        	i++;
	        }
	    }
}
