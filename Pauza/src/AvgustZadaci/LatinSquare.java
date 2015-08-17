package AvgustZadaci;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LatinSquare {

	public static char[][] inputLetters() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number n: ");                        // trazimo unos od korisnika za duzinu matrice
		int n = input.nextInt();

		System.out.println("\nEnter " + " n "
				+ "rows of letters separated by spaces: ");
		char[][] square = new char[n][n];                          // kreiramo 2D niz u koji smjestamo unesenu duzinu redova i kolona od korisnika
		char ch;                                                   // stvaramo memoriski prostor za provjeru karaktera u nizu
		for (int i = 0; i < n; i++) {                              // petljom prolazimo kroz redove
			for (int j = 0; j < n; j++) {                          // -//-  -//- kroz kolone niza
				ch = input.next().charAt(0);                       // sada  varijabli karakter dodajemo unos od korisnika na pocetnu poziciju
				ch = Character.toUpperCase(ch);                    // tajpkastamo taj unos u veliko slovo preko javine klase
				if (ch < 'A' || ch > 'Z') {
					System.out.println("Wrong input: input must be letters"); // uslov za unos karaktera
					
				
				} else {
					square[i][j] = ch;   // u 2D niz smjestamo dobijene karaktere
				}
			}
		}
		return square;                // vracamo taj niz napunjen karakterima
	}

	public static boolean check(char[][] ch, int n) {        // metoda koja provjerava karaktere

		for (int x = 0; x < n; x++) {
			for (int y = 0; y < n; y++) {

				
				for (int i = 0; i < n; i++) {
					if (ch[x][i] == ch[x][y])               // Provjerava redova
						return false;
				}

				
				for (int i = 0; i < n; i++) {
					if (ch[i][y] == ch[x][y])               // Provjerava kolona
						return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {

		char[][] latinSquare = inputLetters();                      // kreiramo 2D niz koji izjednacavamo sa metodom koja puni slova u niz

		if (check(latinSquare, latinSquare.length)) {               // provjeravamo tako sto toj metodi prosledjujemo parametre
			System.out.println("The input array is not a Latin square");
		} else {                                                         // ispisujemo rezultat provjere u konzoli
			System.out.println("The input array is  a Latin square");
		}
	}

}