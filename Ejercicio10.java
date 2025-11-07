/*
 * Nombre:Julio
 * Descripcion:Un programa de java que contenga alturas introducidas por el usuario,se debe que hacer la media,que altura es la máxima,la mínima y cuantas peronas miden por debajo de la mínima y por encima
 * Fecha:07/11/2025
 */
package MárquezOrtegaJulio3_10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double [] alturas;
		alturas = new double[10];
		double altura;
		double alturaMedia = 0;
		double alturaTotal = 0;
		double alturaMax;
		double alturaMin;
		alturaMedia = alturaTotal/10;
		for(int i = 0;i <alturas.length;i++) {
			System.out.println("Dime una altura en metros: ");
			altura = scanner.nextInt();
			alturaTotal = altura + alturas[i];
			
			
		}
		System.out.println("La altura media de todas es " + alturaMedia);
		System.out.println(alturaTotal);
	}

}
