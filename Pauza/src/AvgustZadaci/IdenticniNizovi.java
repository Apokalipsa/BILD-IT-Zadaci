package AvgustZadaci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IdenticniNizovi {
	public static boolean equals(int[][] m1, int[][] m2) {       // metoda koja provjerava da li su svi elementi u matrici isti
		
		boolean equals = true;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<m1.length; i++) {  // za elemente matrica
			list.add(m1[0][i]);           // dodajemo prvi red elemenata matrice u listu
			list.add(m1[1][i]);           // dodajemo drugi red elemenata matrice u listu
			list.add(m1[2][i]);           // dodajemo treci red elemenata matrice u listu
			                              // ako elementi iz liste odgovaraju elementima druge matrice
			if(list.contains(m2[0][i]) && list.contains(m2[1][i]) && list.contains(m2[2][i])) {
				equals= true;                // vraca true
			} else {                      // a ako ne odgovaraju
				equals = false;               // vraca false
			}
		}
		
		if(equals) {                          // ako je uslov ispunjen
			System.out.println("Identicne matrice !");  // ispis u konzolu			
		} else {                          // ako uslov nije ispunjen
			System.out.println("Neidenticne matrice !"); // ispis u konzolu			
		}
		return equals;			              // vraca vrijednost boolean, true ili false
	}


public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int[][] array1 = new int[3][3];                                               // kreiramo memoriski prostor za 2D niz

	System.out.println(" Unesite " + array1.length
			+ " elementa da popunite redove, te unesite " + array1.length      // trazimo unos od korisnika
																			
			+ " elementa da popunite kolone matrice ");

	for (int row = 0; row < array1.length; row++) {
		for (int column = 0; column < array1[row].length; column++) {      // popunjavamo matricu elementima od korisnika
																		
			array1[row][column] = input.nextInt();
			System.out.print(array1[row][column] + " ");
		}
		System.out.println();
	}                  
		int[][] array2 = new int[3][3];                                           // kreiramo memoriski prostor za 2D niz

		System.out.println(" Unesite " + array2.length
				+ " elementa da popunite redove, te unesite " + array2.length   // trazimo unos od korisnika
																				
				+ " elementa da popunite kolone matrice ");

		for (int rowe = 0; rowe < array1.length; rowe++) {
			for (int colum = 0; colum < array2[rowe].length; colum++) {      // popunjavamo matricu elementima od korisnika
																			
				array2[rowe][colum] = input.nextInt();
				System.out.print(array1[rowe][colum] + " ");
			}
			System.out.println();
			
			equals(array1,array2);        // pozivamo prethodno kreiranu metodu koja ce provjeriti jednakost elemenata matrixa
	}
}
}

