package Zadaci;

import java.util.Scanner;

public class Polindrome {
	public static boolean isPalindrome(int number) {
		int palindrom = number; // kopiramo broj u varijablu polindrom
		int obrnutiBroj = 0; // mjesto za obrnuti broj

		while (palindrom != 0) { // sve dok uneseni broj nije 0
			int ostatak = palindrom % 10; // kreiramo ostatk od naseg broja
			obrnutiBroj = obrnutiBroj * 10 + ostatak; // obrnuti broj mnozimo sa
														// 10 da dobijemo 2 broj
														// i dodajemo mu ostatak
			palindrom = palindrom / 10; // polindrom je tada podijeljen sa 10 i
										// dobijamo prvi broj od unesenog
			
		}
		System.out.println(" Vas broj u obrnutom redoslijedu je: " + obrnutiBroj);

		// ukoliko je uneseni broj jednak obrnutom broju koji smo dobili taj
		// broj je polindrom
		if (number == obrnutiBroj) {
			return true;
		}
		return false; // ukoliko brojevi nisu jednaki broj nije polindrom
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Molim unesite broj : ");
		int palindrome = input.nextInt();

		if (isPalindrome(palindrome)) { // pozivanje  prethodno kreirane metode  unesenog broja i ispis
			System.out
					.println("Uneseni broj : " + palindrome + " je palindrom");
		} else {
			System.out.println("Uneseni broj : " + palindrome
					+ " nije palindrome");
		}

	}

}