package Zadaci;

import java.util.Arrays;
import java.util.Scanner;

public class Zadaci22Jul5 {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Eneter elements");

		double[][] niz = new double[3][3];

		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 3; k++) {
				niz[i][k] = input.nextDouble();
			}

		}
		double[][] result = sortRow(niz);

		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 3; k++) {
				System.out.print(result[i][k] + " :: ");
			}
			System.out.println();
		}

	}

	public static double[][] sortRow(double[][] array) {
		double[] red = new double[3];

		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 3; k++) {
				red[k] = array[i][k];
			}
			Arrays.sort(red);
			for (int k = 0; k < 3; k++) {
				array[i][k] = red[k];
			}
		}
		return array;

	}
}
