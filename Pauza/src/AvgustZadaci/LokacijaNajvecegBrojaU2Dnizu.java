package AvgustZadaci;

import java.util.Scanner;

public class LokacijaNajvecegBrojaU2Dnizu {
	
public static int locateLargest(double[][] a) {        // kreiramo metodu koja ce pronaci najveci broj u nizu i njegovu lokaciju
		
		double max = a[0][0];                          // postavljamo svoj max broj na 0 te pozicije u datom nizu                      
		int indexRed = 0;                                                       
		int indexKolona = 0;                           // kreiramo memoriski prostor za indexe u nizu koji ce primiti kada ih nadjemo                               
		
		for (int row=0; row<a.length; row++) {         // petljom prolazimo kroz sve elemente u  redovma matrice   
			for (int column=0; column<a[row].length; column++) {  // sledecom teljom provjeravamo sve elemente u kolonama matrice
				if (a[row][column] > max) {                      // ukoliko su brojevi veci od naseg max mijenjamo im mjesta
					max = a[row][column];                       
					indexRed = row;                          // dodjeljujemo indexu za red broj max  broja nadjenog u redu
					indexKolona = column;                    // dodjeljujemo indexu za kolonu broj max  broja nadjenog u koloni           
				}
			}
		}
		                                                 
		System.out.println("Najveci broj matrice je " + max + "\nLokacija najveceg elementa je na: [" + indexRed + ", " + indexKolona + "]");
		return (int)max;                // tajpkastamo iz double u int nadjeni najveci broj i vracamo rezultat
	}
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Unesite broj redova niza: ");
	int row = input.nextInt();
	                                                      // trazimo unos od korisnika
	System.out.print("Unesite broj redova niza: ");
	int column = input.nextInt();                      
	
	double [][] matrica = new double [row][column];     // kreiramo 2D niz koji ce primiti podatke od korisnika
	
    System.out.print("Unesite elemente za " + row+ " reda i elemente za  " + column + " kolone niza: ");
	
	for (int i=0; i<matrica.length; i++) {              
		for (int j=0; j<matrica[i].length; j++) {      // popunjavamo matricu unosom od korisnika
			matrica[i][j] = input.nextInt(); 
			                                             
			System.out.print(matrica[i][j] + " ");      // ispisjujemo matricu u konzoli
		}
		System.out.println();
	}
	
	locateLargest(matrica);   // pozivamo se na prethodno kreiranu metodu koja ce u unijetoj da najde i ispise lokaciju najveceg broja
}
}


