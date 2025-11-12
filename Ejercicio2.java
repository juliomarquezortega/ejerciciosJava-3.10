/*
 * Nombre:Julio
 * Descripción:Lo mismo pero al final se debe que sumar todos los números
 * Fecha:1/11/2025
 */
package MárquezOrtegaJulio3_10;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numTotal = 0;
		
		int[] numeros = new int[10];
		
		for(int i=0;i < numeros.length;i++) {
			System.out.println("Dime un número");
			numeros[i] = scanner.nextInt();
			
			
		}
		for(int i = 0;i <numeros.length;i++) {
			numTotal = numTotal + numeros[i];
			
		}
		System.out.println("La suma total es: " + numTotal);

	}

}
