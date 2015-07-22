package Zadaci;

import java.util.Scanner;

public class Zadaci20Jul2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Unesite jednu rijec");
		
		String recenica;
		recenica = input.nextLine();
		
		int BrojSamoglasnika = 0;
		
		for (int i = 0; i < recenica.length(); i++) { // prolazak kroz citavu unesenu recenicu
			if (recenica.charAt(i) == 'a')
				BrojSamoglasnika++;
			else if (recenica.charAt(i) == 'A')
				BrojSamoglasnika++;
			else if (recenica.charAt(i) == 'e')
				BrojSamoglasnika++;
			else if (recenica.charAt(i) == 'E')
				BrojSamoglasnika++;
			else if (recenica.charAt(i) == 'i') // postavljeni uslovi koji provjeravaju da li se u recenici nalaze zadata slova
				BrojSamoglasnika++;
			else if (recenica.charAt(i) == 'I')
				BrojSamoglasnika++;
			else if (recenica.charAt(i) == 'o')
				BrojSamoglasnika++;
			else if (recenica.charAt(i) == 'O')
				BrojSamoglasnika++;
			else if (recenica.charAt(i) == 'u')
				BrojSamoglasnika++;
			else if (recenica.charAt(i) == 'U')
				BrojSamoglasnika++;                       // ukoliko je svaki uslov ispunjen brojac zapisuje koliko trazenih slova ima
		}
		System.out.println("U recenici ima: " + BrojSamoglasnika
				+ " samoglasnika. ");
	}
}