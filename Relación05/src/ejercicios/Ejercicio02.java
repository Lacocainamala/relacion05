package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Dado un array de tamaño (N,M) de enteros, decir si todos sus elementos son cero.
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el número de filas: ");
		int filas = teclado.nextInt();
		System.out.println("Introduce el número de columnas: ");
		int columnas = teclado.nextInt();
		
		int matriz[][] = new int [filas][columnas];
		System.out.println("Introduce la matriz");
		FuncionesMatrices.pedirMatriz(matriz);
		
		System.out.println("Tu matriz es ");
		FuncionesMatrices.mostrarMatriz(matriz);
		
		if (FuncionesMatrices.esCero(matriz)) {
			System.out.println("Toda la matriz es cero");
		} else {
			System.out.println("Algún número de la matriz no es cero");
		}
		
	}

}
