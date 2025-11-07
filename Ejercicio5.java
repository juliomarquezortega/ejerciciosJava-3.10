/*
 * Nombre:Julio
 * Descripción:Programa que pide 20 números y que haga la media de la suma y se divida por el número total  que hay 
 * Fech:03/11/2025
 */
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
