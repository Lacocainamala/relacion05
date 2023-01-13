package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Dado un array de tamaño (N,M) de enteros, inicializarlo a un valor dado A.
		
		Scanner teclado = new Scanner(System.in);
	
		System.out.println("Introduce el número de filas: ");
		int filas = teclado.nextInt();
		System.out.println("Introduce el número de columnas: ");
		int columnas = teclado.nextInt();
		
		int matriz[][] = new int [filas][columnas];
		System.out.println("Introduce un número: ");
		int num = teclado.nextInt();
		FuncionesMatrices.rellenarMatriz(matriz, num);
		
		System.out.println("Tu matriz es ");
		FuncionesMatrices.mostrarMatriz(matriz);
		
	}

}
