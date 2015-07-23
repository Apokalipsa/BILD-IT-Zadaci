package Zadaci;

import java.util.Scanner;

public class ISBN {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int d1, d2, d3, d4, d5, d6, d7, d8, d9;
		int d10;

		System.out.print("Enter the first 9 digits of an ISBN as integer:");
		d1 = s.nextInt();
		d2 = s.nextInt();
		d3 = s.nextInt();
		d4 = s.nextInt();
		d5 = s.nextInt(); // dodjeljujemo vrijednosti sa konzole
		d6 = s.nextInt();
		d7 = s.nextInt();
		d8 = s.nextInt();
		d9 = s.nextInt();
// ovo je formula za racunanje ISBN-a po konvenciji
		d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7
				+ d8 * 8 + d9 * 9) % 11;

		if (d10 == 10) { // uslov pod kojim se printa X ukoliko se po formuli dobije 10 za 10 ti broj 
			String izlaz = d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + ""
					+ d6 + "" + d7 + "" + d8 + "" + d9 + "X";
			System.out.print(izlaz); // printanje brojeva sa X
		} else {
			String izlaz = d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + ""
					+ d6 + "" + d7 + "" + d8 + "" + d9 + "" + d10;
			System.out.print(izlaz); // printanje svih 9 brojeva po konvenciji
		}
	}
}