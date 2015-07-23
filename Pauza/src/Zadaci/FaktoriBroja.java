package Zadaci;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FaktoriBroja {
	public static List<Integer> primeFactors(int number) {

		List<Integer> primefactors = new ArrayList<>(); // kreiramo listu
														// brojeva

		int num = number; // kreiramo jednu promenljivu pomocu koje racunamo
							// dalje faktor

		for (int i = 2; i <= num; i++) { // 2 je najmanji broj od kojeg krecemo
											// u nasoj petlji jer je moguc kao
											// faktor

			if (num % i == 0) { // ukoliko nema ostatka i postaje faktor datog
								// broja

				primefactors.add(i); // dodajemo i -ti clan u listu koji je
										// faktor po formuli

				num = num / i; // sada taj broj dijelimo sa i-tim

				i--;

			}

		}

		return primefactors;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter one number");
		int number = input.nextInt();
		System.out.println("This number " + number + " has next factors"
				+ primeFactors(number));

	}

}
