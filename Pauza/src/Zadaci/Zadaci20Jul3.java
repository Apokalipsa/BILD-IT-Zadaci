package Zadaci;

import java.util.Scanner;

public class Zadaci20Jul3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Unesite prvi broj");
		int prvi = input.nextInt();
		System.out.println(" Unesite drugi broj");
		int drugi = input.nextInt();
		int rezultat = djelilac(prvi, drugi); // pozivamo metodu koja vraca najmanji djelilac
		System.out.println(" Zajednicki djelilac brojeva " + prvi + " i "
				+ drugi + " je " + rezultat);

	}

	public static int djelilac(int a, int b) { // metoda sa dva parametra
		while (a != b) { // sve dok prvi broj nije jednak drugom uradi nesto
			if (a > b) // ukoliko je  prvi broj veci od drugog
				a -= b; // oduzimamo taj broj sa drugim
			else        // ukoliko nije
				b -= a; //odu\imamo drugi od prvog
		}
		return a;

	}
}
