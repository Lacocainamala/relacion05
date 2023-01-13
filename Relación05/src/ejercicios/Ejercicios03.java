package ejercicios;

import java.util.Scanner;

public class Ejercicios03 {

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
		
		int veces = FuncionesMatrices.cuantaVeces(matriz, num);
		System.out.printf("El numero %.2f se repite %d veces en la matriz", num,veces);

	}

}
