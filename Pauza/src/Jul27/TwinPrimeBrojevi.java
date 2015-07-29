package Jul27;

import java.io.IOException;
import java.util.Scanner;

public class TwinPrimeBrojevi {
	boolean isPrime(int n) // provjeravamo da li je broj prirodan
	{
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				count++;
		}                          // prirodan broj je djeljivi bez ostatka samo s brojem 1 i sami sa sobom
		if (count == 2)
			return true;
		else
			return false;
	}

	public static void main(String args[]) throws IOException {// bacam exceptio ukoli korisnik une neocekivane znake
		TwinPrimeBrojevi object = new TwinPrimeBrojevi();// pravimo instcu nase klase kako bi kasnije se pozivali na metode iz te klase
		Scanner input = new Scanner(System.in);

		System.out.print("unesite pocetni broj--> ");
		int numb1 = input.nextInt();
		System.out.print("unesite krajnji broj-->  ");
		int numb2 = input.nextInt();
		int numberPerLine = 0;
		if (numb1 > numb2)

			System.out.println("Neprirodan raspon! Pokusajte ponovo");
		else {
			System.out.println("Twin primarni brojevi u ovom rasponu su : ");

			for (int i = numb1; i <= (numb2 - 2); i++) {                             // petljom prolazimo kroz unijete brojeve
				numberPerLine++;
				if (object.isPrime(i) == true && object.isPrime(i + 2) == true) {  // ako su uslovi ispinjeni
					                                                             
					if (numberPerLine % 10 == 0) {                                // uslov za ispis 10 brojeva po linij
						
						System.out.print("(" + i + "," + (i + 2) + ") ");       // printamo twin brojeve
					} else {
						System.out.print("(" + i + "," + (i + 2) + ") ");

						

						

					}
				}
			}
		}
	}
}
