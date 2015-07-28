package Zadaci2;

import java.util.Scanner;
import java.lang.Character; // importujemo iz java biblioteke metode koje rade sa karakterima

public class Password {
	public static boolean isValidPassword(String password) {

		if (password.length() < 8) // ukoliko password nema 8 karaktera vracamo
									// gresku tj invalid password

			return false;

		int counter = 0;

		for (int i = 0; i < password.length(); i++) // prolazimo kroz sve
													// karaktere unosa

		{

			if (!Character.isLetterOrDigit(password.charAt(i))) // ukoliko se u
																// unosu ne
																// nalaze slova
																// opet vracamo
																// invalid
																// password

			{

				return false;

			}

			if (Character.isDigit(password.charAt(i))) // provjeravamo brojeve i
														// ukoliko ih ima
														// brojimo ih

			{

				counter++;

			}

		}

		if (counter >= 2) { // ukoliko ih ima vise od 2 uslov za validan
							// password je ispunjen vracamo tru za printanje
			System.out.println(" Valid password");

			return true;
		} else {
			System.out.println(" Invalid password");
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a Password: ");
		String password = input.next();

		System.out.println(isValidPassword(password)); // prosledjujemo uneseni
														// password prethodno
														// kreiranoj metodi

	}
}
