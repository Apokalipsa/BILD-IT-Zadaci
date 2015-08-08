package AvgustZadaci;

import java.util.Scanner;

public class MultiplayTwoMatrixa {
	
	public static double[][]multiplyMatrix(double[][] a, double[][] b){
		double[][] matrix = new double[3][3];               // postavimo da je matrix dimenzija 3x3

		for (int i = 0; i < a.length; i++) {               // kroz petlju prolazino kroz sve clanove prve matrice
			for (int j = 0; j < a[i].length; j++) {       // kroz 2 petlju prolazimo kroz sve clanove 2 matrice
				matrix[i][j] = a[i][j] + b[i][j];        //  trecu matricu dobijemo kada saberemo obe prethodno unesene
													
			}
		}
		return matrix;                               // vratimo trecu matricu koja sadrzi sabrane clanove druge 2
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of rows: ");  // trazimo unos od korisnika za odredjene duzine matrica
		int rows = s.nextInt();
		
		System.out.print("Enter number of columns: ");
		int columns = s.nextInt();
		
		double[][] a = new double[rows][columns];
		double[][] b = new double[rows][columns];
		
		System.out.println("Enter the first matrix");       // trazimo od korisnika da unese elemente u  1 matricu
		for (int i = 0; i < rows; i++) {
			
			for (int j = 0; j < columns; j++) {
				a[i][j] = s.nextInt();
			}
		}
		System.out.println("Enter the second matrix");      // trazimo od korisnika da unese elemente u 2 matricu
		for (int i = 0; i < rows; i++) {
			
			for (int j = 0; j < columns; j++) {
				b[i][j] = s.nextInt();
			}
		}
		double[][] c = multiplyMatrix(a, b);                   // da saberemo elemnte unijete od korisnika pozivamo se na prethodno kreiranu metodu koja ce ih sabrati

		System.out.println("Sum of all elements from two matrix is: "); 
																	
		for (int i = 0; i < c.length; i++) {
			
			for (int j = 0; j < c[i].length; j++) {      // prolazkom petljom kroz sve clanove reda i kolona printamo brojeve u konzolu
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}

	


