package ejercicios;

import java.util.Scanner;

public class Ejercicios04 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int triangular = teclado.nextInt();
		System.out.println("Filas: ");
		int filas = teclado.nextInt();
		
		System.out.println("Columnas: ");
		int cols = teclado.nextInt();
		
		System.out.println("Introduce la matriz");
		double matriz[][] = new double[filas][cols];
		FuncionesMatrices.pedirMatriz(matriz);
		
		System.out.println("La matríz es ");
		FuncionesMatrices.mostrarMatriz(matriz);
		
		boolean triangular = FuncionesMatrices.esTriangularSuperior(matriz);
		if (triangular) {
			System.out.println("Es triangular superior");
		}else {
			System.out.println("No es triangulo superio");
		}
		
	}

}
