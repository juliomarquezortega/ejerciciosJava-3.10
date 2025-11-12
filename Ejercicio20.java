package MárquezOrtegaJulio3_10;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros;
		int N;
		int contador = 0;
		numeros = new int[1000];
		
		
		for (int i = 0;i < numeros.length;i++) {
			numeros[i] = (int)(Math.random() * 100);
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("Di un numero entre 0 y 99");
		N = scanner.nextInt();
		for (int i= 0;i<numeros.length;i++) {
			if(numeros[i] == N) {
				contador = contador + 1;
			}
		}
		if (contador > 0) {
			System.out.println("El numero " + N + " aparece " + contador + " veces" );
		} else {
			System.out.println("El numero " + N + " no aparece ");
		}
	}

}
