package ejercicios;

import java.util.Scanner;

public class Ejercicios02 {

	public static void main(String[] args) {


		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Filas: ");
		int filas = teclado.nextInt();
		
		System.out.println("Columnas: ");
		int cols = teclado.nextInt();
		
		System.out.println("Introduce la matriz");
		int matriz[][] = new int[filas][cols];
		FuncionesMatrices.pedirMatriz(matriz);
		
		boolean esNula = FuncionesMatrices.sonTodosCeros(matriz){
			if(esNula) {
				System.out.println("La matriz contiene sólo ceros");
			} else (esNula){
				System.out.println("hay al menos algún elemento en la matriz que no es cero");
			}
		}

	}

}
