package AvgustZadaci;

import java.util.Scanner;

public class LargestNumbIn2Darray {
	public static int[] locateLargest(int[][] matrica) {          // metoda za pronalazenje najveceg elementa u 2D nizu i njegove lokacije
		int max = matrica[0][0];
		int[] largest = new int[2];
		for (int i = 0; i < matrica.length; i++) {             // petljom prolazimo kroz citavu duzinu redova
			for (int j = 0; j < matrica[i].length; j++) {     // petljom prolazimo kroz citavu duzinu kolona
				if (max < matrica[i][j]) {
					max = matrica[i][j];
					largest[0] = i;                         // postavljamo najvecu lokciju na pocni index niza u redu
					largest[1] = j;                        // postavljamo najvecu lokciju na pocni index niza u koloni

				}
			}
		}
		return largest;

	}

	public static int[][] getRandomMatrix() {                             // metod koji ce upisati random brojeve u  matrix

		int[][] matrica = new int[4][4];

		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				matrica[i][j] = (int) (Math.random() * 2);            // popunjavamo matricu random brojevima od 0 do 1 radi preglednosti
			}
		}

		return matrica;
	}

	public static void printMatrix(int[][] matrix) {                         // metod koji ce ispisati matrix
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] matrica = getRandomMatrix();             //kreiramo instancu matrica od prethodno kreirane metode za popunjavanje matrice
		printMatrix(matrica);                           //pozivamo prethodno kreiranu metodu za printanje matrice u konzolu
		System.out.println(locateLargest(matrica));    // pozivanje prethodno kreirane metode koja ispisuje lokaciju najveceg broja u 2D nizu
	}
}
