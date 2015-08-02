package AvgustZadaci;

import java.util.Scanner;

public class PrvoSlovoStringaIduzina {

	public static void main(String[] args) {
		
		Scanner input= new Scanner ( System.in);       // Trazimo unos od korisnika
		System.out.println(" Unesite jednu rijec");
		
		String rijec= input.nextLine();              // smijestamo unos u promenljivu koju cemo dalje obradjivati
		
		for( int i =0;i<rijec.length();i++){        // petlja prolazi kroz svako slovo u jeci i tako dobijamo duzinu unosa
		
			// ispisujemo u konzolu rezultat tj duzinu rijeci i koje joj je prvo slovo dobijeno poocu javine metode charAt
			
		}System.out.println(" Duzina unijete rijeci " +rijec + "iznosi " + rijec.length() + " slova, a prvo slovo ovog stringa je " + rijec.charAt(0));
		

	}

}
