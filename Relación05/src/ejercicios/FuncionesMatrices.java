package ejercicios;

import java.util.Scanner;

public class FuncionesMatrices {
	
	public static void pedirMatriz(int matriz[][]) {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < matriz.length; i++) {
			for (int j =0; j < matriz[0].length; j++) {
				System.out.printf("Introduce un elemento (%d,%d)", i ,j);
				matriz[i][j]= teclado.nextInt();
			}
		}
		
	}
	
	public static void pedirMatriz(double matriz[][]) {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < matriz.length; i++) {
			for (int j =0; j < matriz[0].length; j++) {
				System.out.printf("Introduce un elemento (%d,%d)", i ,j);
				matriz[i][j]= teclado.nextInt();
			}
		}
		
	}
	
	public static void mostrarMatriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j =0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void mostrarMatriz(double matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j =0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void rellenarMatriz(int matriz[][], int valor) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j =0; j < matriz[0].length; j++) {
				matriz[i][j]= valor;
			}
		}
	}
	
	public static boolean esCero(int matriz[][]) {
		boolean cero=true;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if(matriz[i][j]!=0) {
					cero=false;
				}
			}
		}
		return cero;
	}

	public static boolean sonTodosNum(int matriz[][], int num) {
		boolean sonNum=true;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if(matriz[i][j]!=num) {
					sonNum=false;
				}
			}
		}
		return sonNum;
	}
	
	public static void inicilizar(int matriz[][], int n) {
		for(int i = 0; i < matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {
				matriz[i][j]=n;
			}
		}
	}
	public static boolean sonTodosCeros(int matriz[][]) {
		boolean ceros=true;
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {
				if(matriz[i][j]!=0) {
					ceros =false;
				}
			}
		}
		return ceros;
	}
	
	public static int cuantaVeces(double m[][], double num) {
		int contador= 0;
		
		for (int i=0; i<m.length; i++) {
			for (int j=0;j<m[0].length; j++) {
				if (m[i][j]==num) {
					contador++;
				}
			}
		}
		return contador;
	}
	
	public static boolean esTriangularSuperior(int matriz[][]) {
		boolean triangular = true;
		
		for (int i=1;i<matriz.length;i++) {
			for (int j=0; j<i; j++) {
				if (matriz[i][j]!=0) {
					triangular=false;
				}
			}
		}
		return triangular;
	}
	
	public static int devuelveMayor(int matriz[][]) {
		int mayor=matriz[0][0];
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {
				if(matriz[i][j] > mayor) {
					mayor = matriz[i][i];
				}
			}
		}
		return mayor;
	}
	
	public static double devuelveMayor(double matriz[][]) {
		double mayor=matriz[0][0];
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {
				if(matriz[i][j] > mayor) {
					mayor = matriz[i][i];
				}
			}
		}
		return mayor;
	}
	
	public static double mediaMatriz(double matriz[][]) {
		double suma=0;
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length;j++) {
				suma=suma+matriz[i][j];
			}
		}
		return suma/(matriz.length*matriz[0].length);
	}
	
	public static double [] mediaPorColumnas(int matriz[][]) {
		double medias [] = new double[matriz[0].length];
		int suma=0;
		
		for (int j=0; j<matriz[0].length;j++) {
			for (int i =0; i<matriz.length; i++) {
				suma=suma+matriz[i][j];
			}
			medias[j] = suma/matriz.length;
		}
		return medias;
	}
	
	public static double[][] traspuesta(double matriz[][]){
		double tras[][]=new double[matriz[0].length][matriz.length];
		
		for(int i =0; i< tras.length; i++) {
			for (int j=0; j<tras[0].length; j++) {
				tras[i][j]=matriz[j][i];
			}
		}
		return tras;
	}
}