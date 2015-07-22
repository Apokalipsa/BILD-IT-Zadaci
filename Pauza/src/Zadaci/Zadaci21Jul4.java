package Zadaci;

import java.util.Scanner;

public class Zadaci21Jul4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Unesite broj vase matrice");
		int broj = input.nextInt();
		printMatrix(broj); // pozivanje kreirane metode i prosledjivanje podataka istoj sa konzole tj  od korisnika

	}

	public static void printMatrix(int n) { // metoda za pravljenje matrice n*n
		int[][] matrica = new int[n][n];
		for (int red = 0; red < matrica.length; red++) {  // petlja za upisivanje brojeva u matricu
			for (int kolona = 0; kolona < matrica[red].length; kolona++) {
				matrica[red][kolona] = (int) (Math.random() * 2); // brojevi u matrici su ograniceni od 0 do 1 pomocu random unosa
			}
		}
		for (int red = 0; red < matrica.length; red++) { // ovom petljom ispisujemo u konzoli trazenu matricu
			for (int kolona = 0; kolona < matrica[red].length; kolona++) { // 
				System.out.print(matrica[red][kolona] + "  ");
			}
			System.out.println();
		}
	}

}
