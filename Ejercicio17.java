/*
 * Nombre:Julio
 * Descripcion:dos array en que el usuario pide 20 numeros y los 10 primeros numeros esta en el primer array y los otros numeros en el segundo array y luego hay que decir si son iguales 
 * Fecha:9/11/2025
 */
package MárquezOrtegaJulio3_10;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int [] primerarray; 
		primerarray = new int[20];
		int [] segundoarray;
		segundoarray = new int[10];
		int num;
		
		for(int i = 0;i < 10;i++) {
			System.out.println("Dime un número");
			num = scanner.nextInt();
		}
		
	}

}
