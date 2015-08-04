package AvgustZadaci;

import java.util.Scanner;

public class AsciiCodeToCaracter {

	public static void main(String[] args) {
		// pretvaranje  ASCII koda u odgovarajuci karakter
		Scanner input = new Scanner( System.in);
		
		System.out.println("  Unesite jedan cijeli broj: ");      // trazimo unos od korisnika
		int unos= input.nextInt();                               // smjestamo unos u odgovarajuci memoriski prostor
		
		char karakter = (char) unos;                            // tajpkastamo int ( unos) u char

        System.out.println ("Karakter unesenog broja " +  unos + " je---> " + karakter);  // ispis u konzoli
   }

}		
		
		
	

	