package AvgustZadaci;

import java.util.Scanner;

public class NNmatrica {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);                 // trazimo unos od korisnika za  velicinu matrice
												
		System.out.println(" Unesite broj vase matrice");

		int broj = input.nextInt();

		printMatrix(broj);                                 // pozivanje prethodno kreirane metode i proslijedjivanje joj argumenta
							

	}

	public static void printMatrix(int n) {
		int[][] matrica = new int[n][n];                                         // odredjujemo velicinu matrice
		for (int red = 0; red < matrica.length; red++) {                        // kreiranje redova matrice
			for (int kolona = 0; kolona < matrica[red].length; kolona++) {     // kreiranje kolona matrice
				matrica[red][kolona] = (int) (Math.random() * 2);             // popunjavanje matrice brojevima od o do 2
			} 
		}
		for (int red = 0; red < matrica.length; red++) {                   
			for (int kolona = 0; kolona < matrica[red].length; kolona++) { // metoda za stampanje popunjene matrice
				System.out.print(matrica[red][kolona] + "  ");
			}
			System.out.println();
		}
	}

}
