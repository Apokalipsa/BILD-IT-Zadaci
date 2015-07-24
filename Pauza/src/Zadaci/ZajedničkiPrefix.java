package Zadaci;

import java.util.Scanner;

public class ZajednièkiPrefix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Unesite jednu recenicu");
		String s = input.nextLine();
		System.out.println(" Unesite drugu recenicu");
		String s2 = input.nextLine();
		String kraca, duza; // prazna mjesta za ispitivanje duzina unijetih
							// recenica
		if (s.length() > s2.length()) {
			kraca = s2;
			duza = s;
		} else { // ukoliko je prva veca od duze dodjeljujemo je u prazan sting
					// kraca
			kraca = s; // ukoliko nije prva duza onda nju dodajemo u taj string
			duza = s2;
		}
		int brojac = 0;
		for (char karakteri : duza.toCharArray()) { // for each petljom
													// prolazimo kroz sve
													// clanove duze recenice
			if (brojac == kraca.length()) // kada brojac bude iste duzine kao i
											// kraca rijec prestaje sa radom
				break;
			if (karakteri != kraca.charAt(brojac)) // prelazi da broji karaktere
													// iste rijeci sve dok ih
													// ima
				break;
			brojac++;
		}
		if (brojac == 0) // ukoliko je brojac jednak 0 to znaci da su recenic
							// razlicite
			System.out
					.println("" + s + " i" + s2 + " nemaju zajednicki prefix");
		else
			System.out.println(" Zajednicki prefix recenica " + s + " i " + s2
					+ " je " + duza.substring(0, brojac));
	}

}
