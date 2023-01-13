package ejercicios;

import java.util.Scanner;

public class Ejercicios01 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Filas: ");
		int filas = teclado.nextInt();
		
		System.out.println("Columnas: ");
		int cols = teclado.nextInt();
		
		int matriz[][]=new int[filas][cols];
		
		System.out.println("Introduce el valor al que quieres incializar la matriz");
		int valor = teclado.nextInt();
		
		FuncionesMatrices.inicilizar(matriz, valor);
		
		System.out.println("Tu matriz incializada es ");
		FuncionesMatrices.mostrarMatriz(matriz);

	}

}
