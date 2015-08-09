package AvgustZadaci;

import java.util.Arrays;
import java.util.Scanner;

public class StriktnoIdenticniNizovi { 
	public static boolean equals(int[][] m1, int[][] m2) {       // metoda koja provjerava da li su svi elementi u matrici isti
		
		 if(Arrays.deepEquals(m1, m2)) {                        // pozivamo se na javinu klasu koja provjerava jednakost obe matrice
			 
			System.out.println("Matrice su  identicne!");   
			return true;
			
		} else {                                                // u zavisnosti od ishoda vraca true ili false
			
			System.out.println("Matrice nisu  identicne!");
			return false;
		}
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

