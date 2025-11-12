/*
 * Nombre:Julio
 * Descripcion:Un array que contenga numeros y se repita cada vez que se avanza como 1 22 333 4444 5555,etc... hasta 10
 */
package MárquezOrtegaJulio3_10;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros;
		numeros = new int[55];
		
		int comienzo = 0;
		
		for (int i = 1;i <=10;i++) {
			for( int a = 0;a < i;a++) {
				numeros[comienzo] = i;
				comienzo = comienzo + 1;
				
			}
		}
		System.out.println("El array tiene");
		for (int i = 0; i <numeros.length;i++) {
			System.out.println(numeros[i]);
		}
	}

}
