package Jul27;

import java.util.Scanner;

public class MaxBrojSaPonavljanjem {
	public static void main(String[] args) {

		// odredimo pocetne vrijednosti varijablama
		int count = 0;
		int number = -1;
		int max = -1;

		// Create a scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite zeljene brojeve (0 prekida unos): ");

		// uslov je da sve dok broj nije nula program nastavlja da prima upis sa
		// konzole
		while (number != 0) {
			number = input.nextInt();
			// ukoliko je uneseni broj veci od naseg zadatog
			if (number > max) {
				// taj uneseni broj direktno postaje nas max
				max = number;
				count = 1; // povecavamo brojac za 1 ukoliko je uslov ispunjeen
			}

			else if (number == max) {// ukoliko je uneseni broj jednak nasem max
				count++; // povecavamo nas brojac sve dok se ne pojavi veci
			}
		}

		// ispis u konzolu
		System.out.println("Najveci broj je: " + max);
		System.out.println("On se ponavlja " + count + " puta ");

	}

}
