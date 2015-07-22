package Zadaci;

import java.util.Scanner;

public class Zadaci22Jul4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite redove i kolone 2D niza:");
		int row = input.nextInt();
		int column = input.nextInt();
		double[][] matrica = new double[row][column];
		System.out.println("Popunite matricu");
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				matrica[i][j] = input.nextDouble();
			}
		}
		int[] forPrint = locateLargest(matrica);
		System.out.println("Lokacija najveceg elementa je: " + forPrint[0]
				+ ", " + forPrint[1]);
	}

	public static int[] locateLargest(double[][] matrica) {
		double max = matrica[0][0];
		int[] largest = new int[2];
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				if (max < matrica[i][j]) {
					max = matrica[i][j];
					largest[0] = i;
					largest[1] = j;

				}
			}
		}
		return largest;

	}
}
