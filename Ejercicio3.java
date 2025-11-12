/*
 * Nombre:Julio
 * Descripcion:Ahora se deb que mostrar cual es el valor mas grande y cual el mas pequeño 
 * Fecha:1/11/2025
 */
package MárquezOrtegaJulio3_10;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		for(int i=0;i < numeros.length;i++) {
			System.out.println("Dime un número");
			numeros[i] = scanner.nextInt();
			
			
		}
		int numeroMayor = numeros [0];
		int numeroMenor = numeros[0];
		for(int i=0;i < numeros.length;i++) {
			if(numeroMayor < numeros[i]) {
				numeroMayor = numeros[i];
			}
			if(numeroMenor > numeros[i]) {
				numeroMenor = numeros[i];
			}
		}
		System.out.println("El numero mas grande es :" + numeroMayor);
		System.out.println("El numero mas pequeño es :" + numeroMenor);
	}

}
