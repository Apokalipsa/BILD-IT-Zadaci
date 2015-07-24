package Zadaci;

import java.util.Scanner;

public class BrojSlovaUStringu {
	public static int countLetters(String s) {
		int rezultat = 0;
		for (int i = 0; i < s.length(); i++) {
			char size = s.charAt(i); // izracunavanje broja karaktera prolazkom
										// petlje kroz unos sa konzole
			rezultat++;
		}
		System.out.println(" Vasa recenica ima " + rezultat + " karaktera");
		return rezultat;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Unesite jednu recenicu");
		String recenica = input.nextLine();

		countLetters(recenica);// pozivanje metode uz proslijedjen unos sa
								// konzole

	}

}
