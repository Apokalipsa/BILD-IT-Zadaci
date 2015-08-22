package ZadaciAvgust20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMisMachExceptions {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean nastavakUnosa = true;                         // ovom linijom koda kontrolisemo unos sve
			int sum=0;							             // dok broj nije pravi unos ce trayiti
										                    // ponavljanje
		do {
			try {
				System.out.println("unesite jedan broj");
				int broj1 = input.nextInt();
				System.out.println("uneseni drugi broj:" );
				int broj2 = input.nextInt();
				nastavakUnosa = false;                            // ukoliko je unesen tacan broj nema
				sum = broj1 + broj2;                             // potrebe da se unos vise ponavlja
				System.out.println(" Uneseni brojevi su: " + broj1 + " i  "+ broj2 + " , a njihova suma je: " + sum);
						
			} catch (InputMismatchException ex) {             // ukoliko korisnik unese slovo ili neki drugi znak
				System.out
						.println(" Pogresan unos! Pokusajte ponovo sa brojem"); // ispisujemo poruku upozorenja
				input.nextLine();
			}
		} while (nastavakUnosa);                          // sve dok ima unosa tj dok je uslov ispunjen
	}

}
