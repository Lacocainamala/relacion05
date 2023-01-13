package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Dado un array de tamaño (N,M) de reales, decir cuántos 
		// elementos tiene igual a un número A dado
		
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
		
		System.out.println("¿Que número quieres comprobar?");
		int num = teclado.nextInt();
		
		if (FuncionesMatrices.sonTodosNum(matriz,num)) {
			System.out.printf("Toda la matriz esta compuesta por %d ",num);
		} else {
			System.out.printf("No todos los números son ",num);
		}
		
	}

}
