/*
 * Nombre:Julio
 * Descripcion:Un array de tamaño 30 y tenga valores aleatorios entre 
 * Fecha:09/11/2025
 */
package MárquezOrtegaJulio3_10;

import java.util.Arrays;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[ ] num;
		num = new int[30];
		
		for (int i = 0; i < num.length;i++) {
			num[i] = (int) (Math.random() * 10);
		}
		Arrays.sort(num);
		System.out.println("El array ordenado es ");
		System.out.println(Arrays.toString(num));
	}

}
