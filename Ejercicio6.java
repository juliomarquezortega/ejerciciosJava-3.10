package MárquezOrtegaJulio3_10;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num;
		int espacio;
		
		System.out.println("Dime el espacio del array");
		espacio = scanner.nextInt();
		int [] n;
		n = new int[espacio]; 
		
		for(int i = 0;i < n.length;i++) {
			System.out.println("Introduce un número");
			num =  scanner.nextInt();
			n[i] = num;
		}
		System.out.println("Los numeros del arrays son");
		for(int i = 0;i < n.length;i++) {
			System.out.println(n[i]);
		}
	}

}
