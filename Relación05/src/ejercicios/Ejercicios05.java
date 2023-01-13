package ejercicios;

import java.util.Scanner;

public class Ejercicios05 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double triangular = teclado.nextDouble();
		System.out.println("Filas: ");
		int filas = teclado.nextInt();
		
		System.out.println("Columnas: ");
		int cols = teclado.nextInt();
		
		System.out.println("Introduce la matriz");
		double matriz[][] = new double[filas][cols];
		FuncionesMatrices.pedirMatriz(matriz);
		
		System.out.println("La matríz es ");
		FuncionesMatrices.mostrarMatriz(matriz);
		
		boolean triangular = FuncionesMatrices.esTriangularInferior(matriz);
		if (triangular) {
			System.out.println("Es triangular inferior");
		}else {
			System.out.println("No es triangulo inferio");
		}
		
	 

	}

}
