/*
 * Nombre:Julio
 * Descripción: un programa que pida 20 numeros y que los separe de positivos y negativos
 * Fecha:03/10/20205
 */
package MárquezOrtegaJulio3_10;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int sumaNegativos = 0;
		int sumaPositivo = 0;
		int num;
		
		int [] numeros; 
		numeros = new int[20]; //declaramos variable
		
		for(int i = 0;i < numeros.length;i++) {
			System.out.println("Dime un número");
			num = scanner.nextInt();
			numeros[i] = num;
			if(num < 0) {
				sumaNegativos = sumaNegativos + num;
			}else {
				sumaPositivo = sumaPositivo + num;
			}
	
		}
		System.out.println("La suma de los positivos es " + sumaPositivo);
		System.out.println("La resta de los negativos es" + sumaNegativos);
		
		
		
		
	}

}
