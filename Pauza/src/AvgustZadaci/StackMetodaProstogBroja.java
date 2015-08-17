package AvgustZadaci;

import java.util.Scanner;
import java.util.Stack;

public class StackMetodaProstogBroja {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Izaberite broj do 120: ");   // trazimo unos od  korisnika
														

		int unos = input.nextInt();                  // smjestamo taj unos

		Stack<Integer> primeNumbers = new Stack<>();    // kreiramo stek listu brojeva

		for (int i = 2; i < unos; i++) {           // petljom krecemo od broja 2 koji je prvi prost broj pa do unosa od korisnika
											     
			if (isPrime(i)) {                     // provjeravamo da li su brojevi prosti pozivajuci se na metodu i prosledjujuci joj i kao argumenat
				
				 primeNumbers .add(i);                 // ukoliko je uslov ispunjen upisujemo te brojeve u listu stek
			}
		}
		System.out
				.println("Prosti brojevi u rastucem redoslijedu su: ");

		for (int i =  primeNumbers .size() - 1; i >= 0; i--) {    //petljom prolazimo kroz sve brojeve u listi od poslednjeg ka prvom
															
			System.out.print( primeNumbers .get(i) + " ");      // ispis svih brojeva u konzoli
													
		}

		
	}

	public static boolean isPrime(int number) {                            // metoda koja provjerava da li
												                          // je broj prost

		for (int divisor = 2; divisor <= number / 2; divisor++) {

			if (number % divisor == 0)                                 // ukoliko nema ostatka kada se broj
										                              // podijeli onda vraca false
				return false;
		}
		return true;                                                // u suprotnom vraca true
	}
}
