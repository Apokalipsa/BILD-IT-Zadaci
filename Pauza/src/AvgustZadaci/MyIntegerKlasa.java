package AvgustZadaci;

import java.util.Scanner;

public class MyIntegerKlasa {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Unesite 2 broja: ");                                      // trazimo unos od korisnika

		int broj1 = input.nextInt();
		int broj2 = input.nextInt();                                              // unos smjestamo u odgovarajuci memoriski prostor

		
		MyIntegerKlasa n1 = new MyIntegerKlasa(broj1);                          // kreiramo 1 objekat nase klase i proslijedimo mu unos od korisnika
		System.out.println("n1 is even? " + n1.isEven(broj1));
		System.out.println("n1 is prime? " + n1.isPrime());                   // pozivamo se na prethodno kreirane metode i ispitujemo brojeve
		System.out.println("15 is prime? " + MyIntegerKlasa.isPrime(n1));

		MyIntegerKlasa n2 = new MyIntegerKlasa(broj2);                      // kreiramo 2 objekat nase klase i proslijedimo mu unos od korisnika
		System.out.println("n2 is odd? " + n2.isOdd(broj2));
		System.out.println("45 is odd? " + MyIntegerKlasa.isOdd(n2));
		System.out.println("n1 is equal to n2? " + n1.equals(n2));        // pozivamo se na prethodno kreirane metode i ispitujemo brojeve
		System.out.println("n1 is equal to 5? " + n1.equals(n2));
	}

	private int value;                               // kreiramo memoriski prostor za odredjen data field
  
	public MyIntegerKlasa(int value) {             // kreiramo konstruktor koji sadrzi data field
									 
		this.value = value;
	}

	public int getValue() {                     // kreiramo geter za dobijanje odredjene vrijednosti
		return value;
	}

	public boolean isEven(int valeu) {       // metoda provjerava da li je broj paran
		if (this.value % 2 != 0) {          // nije paran ukoliko dijeljen sa dva ima ostatka
									
			return false;
		}
		return true;                     // ukoliko nema ostatka broj je paran i metoda vraca true
	}

	public boolean isOdd(int valeu) { // metoda provjerava da li je broj neparan
		if (this.value % 2 == 0) {   // ukoliko nema ostatka broj je paran
			return false;
		}
		return true;               // nije paran ukoliko dijeljen sa dva ima ostatka i metoda  vraca true
					
	}

	public boolean isPrime() {  // meoda koja vraca paran broj

		int factor = 0;

		for (factor = 2; factor <= value / 2; factor++) {

			if (value % factor != 0) {

				return true;

			}

		}

		return false;

	}


	public static boolean isEven(MyIntegerKlasa myInt) {

		return myInt.isEven(myInt.getValue());

	}

	public static boolean isOdd(MyIntegerKlasa myInt) {

		return myInt.isOdd(myInt.getValue());

	}

	public static boolean isPrime(MyIntegerKlasa MyInt) {

		return MyInt.isPrime();

	}

	public boolean equals(int intValue) {

		return value == intValue;

	}

	public boolean equals(MyIntegerKlasa myInt) {

		return equals(myInt.getValue());

	}

	public static int parseInt(String s) {

		return Integer.parseInt(s);

	}

}
