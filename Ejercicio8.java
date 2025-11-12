package MárquezOrtegaJulio3_10;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double num;
		int contador = 0;
		System.out.println("Dime un numero entre 0 y 1");
		num = scanner.nextDouble();
	
		double[] array;
		array = new double[100];
		
		for(int i = 0;i < array.length;i++) {
			array[i] = Math.random();
		}
		for(int i =0;i < array.length;i++) {
			if(num <= array[i]) {
				contador = contador + 1 ;
			}
		}
		System.out.println("Hay en total " + contador + " " + "que son mayores o iguales que el numero que pusiste");
	}

}
