package Zadaci;

import java.util.Scanner;

public class IznadIispodProsjeka {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("How much numbers do you want entre? ");

		int total = input.nextInt();

		int[] numbers = new int[total];

		int sum = 0;

		double average = 0;

		double max = 0;

		for (int i = 0; i < numbers.length; i++) {

			System.out.print("Number " + i + " ---> ");

			numbers[i] = input.nextInt();

			// racunamo sumu unesenih brojeva

			if (numbers[i] > max) { // ukoliko je broj veci od naseg startnog
									// maksimalnog broja

				max = numbers[i]; // nas startni postaje taj broj

			}

			sum += numbers[i]; // zbir dobijamo kada svaki uneseni elemenat
								// saberemo

		}

		// racunanje prosjeka

		average = sum / numbers.length; // prosjek dobijamo kada zbir podijelimo
										// sa brojem elemenata

		String ispisBrojeva = "The array is ";

		for (int n = 0; n < numbers.length; n++) {

			ispisBrojeva += numbers[n] + " "; // stampamo unesene brojeve sa
												// konzole od korisnika

		}

		ispisBrojeva += "\nThe average is: " + average;

		System.out.println(ispisBrojeva);

		String iznad = "The numbers above average are ";

		for (int j = 0; j < total; j++) {

			if (numbers[j] > average) { // uslov ukoliko su elemenati niza
										// brojeva veci od prosjeka

				iznad += numbers[j] + " "; // dodajemo te elemente

			}

		}

		System.out.println(iznad); // printamo te elemente

		String ispod = "The numbers below average are ";

		for (int n = 0; n < total; n++) {

			if (numbers[n] < average) { // uslov ukoliko su elemenati niza
										// brojeva manji od prosjeka

				ispod += numbers[n] + " "; //

			}

		}
		System.out.println(ispod); // printamo te elemente
	}
}
