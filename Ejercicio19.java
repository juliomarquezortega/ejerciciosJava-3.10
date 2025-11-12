/*
 * Nombre:Julio
 * Descripcion:Hacer un array de ranking de 8 jugadores con un puntaje entre 1000 y 2800,despues se muestra los puntajes en orden descendente (de la más alta a la mas baja
 * Fecha:9/11/2025
 */
package MárquezOrtegaJulio3_10;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int [] ranking;
		ranking = new int [8];
		
		
		for (int i = 0;i < ranking.length;i++) {
			System.out.println("Introduce un puntaje entre 1000 y 2800");
			ranking[i] = scanner.nextInt();
			if (ranking[i] < 1000 || ranking[i] >2800) {
				System.out.println("Lo siento pero no es un puntaje valido");
				i--;
			}
				
			
		}
		Arrays.sort(ranking);
		
		for (int i = ranking.length - 1; i >= 0 ; i--) {
			System.out.print(ranking[i] + " ");
		}
	}

}
