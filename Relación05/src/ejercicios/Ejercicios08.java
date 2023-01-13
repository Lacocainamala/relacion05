package ejercicios;

import java.util.Scanner;

public class Ejercicios08 {

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
		
		double resultado [] =FuncionesMatrices.mediaPorColumnas(matriz);
		System.out.println("Las medias son");
		Vectores.mostrar_vector(resultado);
		
		System.out.println("La matriz traspuesta es");
		FuncionesMatrices.mostrarMatriz(FuncionesMatrices.traspuesta(matriz));
		
		teclado.close();

	}

}
