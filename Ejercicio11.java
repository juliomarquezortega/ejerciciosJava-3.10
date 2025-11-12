/*
 * Nombre:Julio
 * Descripcion:Crear dos arrays que tenga del numero del 1 al 100 y en el segundo muestre esos numeros pero al reves 
 * Fecha:9/11/2025
 */
package MárquezOrtegaJulio3_10;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] primerarray;
		primerarray = new int[100];
		
		int[] segundoarray;
		segundoarray = new int[100];
		
		for(int i =0;i < primerarray.length;i++) { //para primer array
			primerarray[i] = i+1;
			
			
		}
		
		for(int i = 0; i < segundoarray.length;i++ ) { //lo metemos al segundo pero cambiando los valores
			segundoarray[i] = primerarray[primerarray.length - 1 - i];
		}
		System.out.println("El primer array es ");
		for (int i = 0;i<primerarray.length;i++) {  //Lo mostramos
			System.out.println(primerarray[i]);
			
			
		}
		System.out.println("El segundo array es ");
		for (int i = 0;i<segundoarray.length;i++) {
			System.out.println(segundoarray[i]);
			
			
		}
	}

}
