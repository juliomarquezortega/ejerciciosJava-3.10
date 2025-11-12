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
		int pordebajo = 0;
		int porencima = 0;
		
		
		for(int i = 0;i <alturas.length;i++) {
			System.out.println("Dime una altura en metros: ");
			altura = scanner.nextDouble();
			alturas[i] = altura;
			alturaTotal += altura;
			
			
		}
		alturaMedia = alturaTotal/alturas.length;
		alturaMax = alturas[0];
		alturaMin = alturas[0];
		
		for(int i = 0;i <alturas.length;i++) {
			if (alturaMin > alturas[i]) {
				alturaMin = alturas[i];
			}
			if (alturaMax < alturas[i]) {
				alturaMax = alturas[i];
			}
		}
		for(int i = 0;i < alturas.length;i++) {
			if(alturas[i] > alturaMedia) {
				porencima++;
			}
			if (alturas[i] < alturaMedia) {
				pordebajo++;
			}
		}
		
		
		System.out.println("La altura media de todas es " + alturaMedia);
		System.out.println("La altura minima es " + alturaMin);
		System.out.println("La altura máxima es " + alturaMax);
		System.out.println("La altura promedio por debajo de la media es " + pordebajo++);
		System.out.println("La altura promedio por encima de la media es " + porencima++);
	}

}
