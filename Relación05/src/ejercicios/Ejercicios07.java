package ejercicios;

import java.util.Scanner;

public class Ejercicios07 {

	public static void main(String[] args) {
		
Scanner teclado = new Scanner(System.in);
		
		System.out.println("Filas: ");
		int filas = teclado.nextInt();
		
		System.out.println("Columnas: ");
		int cols = teclado.nextInt();
		
		System.out.println("Introduce la matriz");
		double matriz[][] = new double[filas][cols];
		FuncionesMatrices.pedirMatriz(matriz);
		
		System.out.println("La matríz es ");
		FuncionesMatrices.mostrarMatriz(matriz);
		
		System.out.println("Introduce el número a comprobar");
		double num = teclado.nextDouble();
		
		System.out.println("La matríz es ");
		FuncionesMatrices.mostrarMatriz(matriz);
		
		System.out.printf("La media de los elementos de la matriz es %.2f", FuncionesMatrices.mediaMatriz(matriz));
		
	}

}
