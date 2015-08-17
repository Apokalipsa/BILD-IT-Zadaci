package AvgustZadaci;

import java.util.Scanner;
import java.util.Stack;

public class FactorOfPrimeNumber {
	public static void main(String[] args) {

		int number, integer, count = 0;                               // stvaramo memoriski prostor za varijable koje cemo koristiti

		Scanner input = new Scanner(System.in);

		Stack<Integer> stack = new Stack<>();                        // kreiramo steck listu brojeva tj integera
		System.out.println("Enter a positive integer: ");
		integer = input.nextInt();                                  // trazimo unos od korisnika i smjestamo taj unos

		
		for (number = 2; number < integer; number++) {            // petljom prolazimo kroz sve brojeve u steku
			if (isPrime(number) && integer % number == 0) {      // ukoliko su ti brojevi prosti i jednaki nuli
				stack.push(number);                             // ispisuemo taj broj
				count++;                                       // svaku iteraciju pozitivnog broja zabiljezimo
				
			}
		}

		
		System.out
				.println("The smallest prime factors of " + integer + " are ");       // ispisujemo najmanje faktore u opadajucem redoslijedu

		while (!stack.empty()) {                                                     // sve dok citav stek ne bude prazan 
			System.out.print(stack.pop() + ", ");
		}
		System.out.println(); 
	}

	public static boolean isPrime(int number) {                                   // metoda koja provjerava da li je broj prost

		for (int divisor = 2; divisor <= number / 2; divisor++) {
			
			if (number % divisor == 0)                                          // ukoliko nema ostatka kada se broj podijeli onda vraca false
				return false;
		}
		return true;                                                          // u suprotnom vraca true
	}

}
