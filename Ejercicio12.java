/*
 * Nombre:Julio
 * Descripcion:
 * Fecha:9/11/2025
 */
package MárquezOrtegaJulio3_10;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int [] numeros;
		numeros = new int [10];
		int num;
		char elegir;
		int posicion;
		do {
			System.out.println();
			System.out.println("a para mostrar valores");
			System.out.println("b introducir valores");
			System.out.println("c Para salir");
			elegir = scanner.next().toLowerCase().charAt(0);
			switch (elegir) {
			case 'a':
				System.out.println("numeros del array");
				for (int i = 0;i <numeros.length;i++) {
					System.out.println("La posicion " + i + ":" + numeros[i]);
				}
				break;
				
			case 'b' :
				System.out.println("Pon un numero");
				num = scanner.nextInt();
				
				System.out.println("Pon la posicion");
				posicion = scanner.nextInt();
				
				if (posicion >= 0 && posicion < numeros.length) {
					numeros[posicion] = num;
					System.out.println("se guardo el valor");
				}else {
					System.out.println("No valido");
				}
				break;
			case 'c':
				System.out.println("Se termina");
				break;
				
				default :
					System.out.println("Esa opcion no funciona");
			}
		} while (elegir != 'c');
	}

}
