/*
 * Nombre:Julio
 * Fecha:30/10/2025
 * Descripción:Un programa java en que el usuario ponga 10 números y esten almacenados con un array para luego mostrar sus valores
 */
package MárquezOrtegaJulio3_10;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numeros; //Declaramos array de enteros
		Scanner scanner = new Scanner(System.in);
		
		numeros = new int[9];
		
		for(int escrito =0;escrito <=numeros.length;escrito++) {
			System.out.println("Dime un número" );
			numeros[escrito] = scanner.nextInt();
			
			
		}
		for ( int mostrado = 0;mostrado < numeros.length;mostrado++) {
		System.out.println(numweos[mostrado]);
		}
		
		
	}

}
