package Zadaci;

import java.util.Scanner;

public class Zadaci22Jul2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ispisati najmanji clan u nizu");
		int niz[] = new int[20]; // niz ima 20 vrijednosti

		System.out.println("Ucitaj clanove niza:");
		for (int i = 0; i < niz.length; i++) { // prolazimo petljom kroz citav niz
			System.out.print(i + "-->");
			niz[i] = input.nextInt(); // ucitavamo niz[i] - i-ti clan niza
		}

		int min = niz[0]; // postavljamo min na pocetnu poziciju niza
		for (int i = 1; i < niz.length; i++) { // prolazimo petljom od sledeceg pa do kraja niza 

			if (min > niz[i]) 
				min = niz[i];
		}

		System.out.println("Najmanji clan niza je: " + min);
	}
}
