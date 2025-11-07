/*
 * Nombre:Julio
 * Fecha:05/11/2025
 * Descripcion:Hacer un programa de array,el usuario pone dos valores,un valor sera para el principio del array y el otro para el final,se debe que mostrar todos sus números 
 */
package MárquezOrtegaJulio3_10;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numMinimo;
		int numMaximo;
		
		System.out.println("Dime el principio");
		numMinimo = scanner.nextInt();
		
		System.out.println("Dime el final");
		numMaximo = scanner.nextInt();
		
		int[] N;
		N = new int [numMaximo - numMinimo + 1];
		
		for(int i = 0;i < N.length;i++) {
			N[i] = numMinimo + i ;
		}
		System.out.println("El array es"  );
		for (int i = 0;i < N.length;i++) {
			System.out.println(N[i]);
		
		}
	}

}
