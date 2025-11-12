package MárquezOrtegaJulio3_10;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int [] numeros; 
		numeros = new int[20]; 
		int num;
		int div = 20;
		int total = 0;
		double media = 0;
		for( int i=0;i<20;i++) {
		System.out.println("Dime un numero:");	
		num = scanner.nextInt();
		numeros[i] = num;
		total += numeros[i];
		media = total/div;
		}
		System.out.println("La media de todos los números es " + media);
	}

}
