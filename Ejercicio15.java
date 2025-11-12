/*
 * Nombre:Julio
 * Descripcion:Un array que tu pongas cuanto espacio tiene y el numero que tenga todos los espacios
 * Fecha : 9/11/2025
 */
package MárquezOrtegaJulio3_10;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int N;
		int M;
		System.out.println("Dime el espacio del array ");
		N = scanner.nextInt();
		
		System.out.println("Dime el valor para todo el espacio");
		M = scanner.nextInt();
		int array[];
		array = new int[N];
		
		for(int i = 0;i< N;i++) {
			array[i] = M;
		}
		System.out.println("El contenido del array es");
		for(int i = 0;i < N;i++) {
			System.out.println(array[i]);
		}
	}

}
