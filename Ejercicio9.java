/*
 * Nombre:Julio
 * Descripcion:Un programa con un array de tamaño 100 que tenga numeros de entre 0.0 y 1.0 con el math.random,se debe que mostrar al final un numero que pide el usuario y en que posiciones del array esta 
 * Fecha:06/11/2025
 */
package MárquezOrtegaJulio3_10;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[]array;
		array = new int [100];
		int num;
		int contador = 0;
		System.out.println("Dime un numero");
		num = scanner.nextInt();
		
		for(int i = 0;i < array.length;i++) {
			array[i] = (int) (1 + Math.random()*10);
			if (array[i] == num) {
				contador = contador + 1;
			}
		}
		System.out.println("El valor que pusiste aparece un total de " + contador + "" + " veces");
	}

}
