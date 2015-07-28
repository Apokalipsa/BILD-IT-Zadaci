package Zadaci2;

import java.util.Scanner;

public class KalendarSaDanima {
	public static void main(String[] args) {
		// unosimo potrebne podatke od korisnika
		Scanner input = new Scanner(System.in);
		System.out.println(" Unesite zeljeni mjesec");
		String mjesec = input.nextLine();
		System.out.println(" Unesite zeljenu godinu");
		int godina = input.nextInt();
		try { // da bi izbjegli prekidanja programa stavljam kod u try blok
			switch (mjesec) {
			case "Jan": {
				System.out.println("Januar " + godina + ". ima 31 dan.");
				break;
			}
			case "Feb": {

				System.out.println("Februar " + godina + ". ima 29 dana");

			}
				break;

			case "Mar": {
				System.out.println("Mart " + godina + ". ima 31 dan.");
				break;
			}
			case "Apr": {
				System.out.println("April " + godina + ". ima 30 dan.");
				break;
			}
			case "Maj": {
				System.out.println("Maj " + godina + ". ima 31 dan.");
				break;
			}
			case "Jun": {
				System.out.println("Jun " + godina + ". ima 30 dan.");
				break;
			}
			case "Jul": {
				System.out.println("Jul " + godina + ". ima 31 dan.");
				break;
			}
			case "Avg": {
				System.out.println("Avgust " + godina + ". ima 31 dan.");
				break;
			}
			case "Sep": {
				System.out.println("Septembar " + godina + ". ima 30 dan.");
				break;
			}
			case "Okt": {
				System.out.println("Oktobar " + godina + ". ima 31 dan.");
				break;
			}
			case "Nov": {
				System.out.println("Novembar " + godina + ". ima 30 dan.");
				break;
			}
			case "Dec": {
				System.out.println("Decembar " + godina + ". ima 31 dan.");
				break;
			}
			// ukoliko se inicijali unesu malim slovom izlistavam poruku
			// ponovnog pokusaja
			default: {
				System.out
						.println("Doslo je do greske! Pokusajte ponovo sa velikim slovom");
				break;
			}
			}
		} catch (Exception e) { // ukoliko postoji greska hvata se catch blokom
								// i program se nastavlja

		} finally {
			input.close();

		}
	}
}
