/*
 * Nombre:Julio
 * Descripcion:Lo mismo que el ejercicio 14 pero con array.fillç
 * Fecha: 9/11/2025
 */
package MárquezOrtegaJulio3_10;

import java.util.Arrays;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros;
		numeros = new int[55];
		
		int comienzo = 0;
		
		for (int i = 1;i <=10;i++) {
			Arrays.fill(numeros, comienzo, comienzo +i,i);
				comienzo = comienzo + i;
			}
		System.out.println("El array tiene");
		for (int i = 0; i <numeros.length;i++) {
			System.out.println(numeros[i]);
		}
		}
		
	}


