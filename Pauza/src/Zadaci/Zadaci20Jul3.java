package Zadaci;

import java.util.Scanner;

public class Zadaci20Jul3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Unesite prvi broj");
		int prvi = input.nextInt();
		System.out.println(" Unesite drugi broj");
		int drugi = input.nextInt();
		int rezultat = djelilac(prvi, drugi);
		System.out.println(" Zajednicki djelilac brojeva " + prvi + " i "
				+ drugi + " je " + rezultat);

	}

	public static int djelilac(int a, int b) {
		while (a != b) {
			if (a > b)
				a -= b;
			else
				b -= a;
		}
		return a;

	}
}
