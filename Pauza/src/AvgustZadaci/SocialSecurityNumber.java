package AvgustZadaci;

import java.util.Scanner;

public class SocialSecurityNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);                   // trazimo unos od korisnika
		System.out.println("Provjera  Social Security Number !");
		System.out.println("Unesite svoj SSN");
		String unos = input.nextLine();
		
		boolean isSSN = true;

		if (unos.length() != 11) {                     // ukoliko unos nema 11 elemenata program ispisuje da broj nije ispravan
			isSSN = false;
		}
		if (!Character.isDigit(unos.charAt(0)))      // uslov za provjeru da li je prvi elemenat unosa broj
			isSSN = false;                          //  ako nije program vraca broj nije ispravan
		else if (unos.charAt(2) != '_')            // ukoliko je sledeci elemenat nije znak program opet vraca neispravan broj
			isSSN = false;
		else if (unos.charAt(5) != '_')          // isto tako i peti index se provjerava da li ima potrebni znak
			isSSN = false;

		System.out.println(isSSN);             // ispis potvrde da je broj ispravan

		if (isSSN == true)
			System.out.println(unos + " ovaj broj je ispravan");
		else                                                        // u zavisnosti od uslova ispis u konzoli
			System.out.println(unos + " ovaj broj nije ispravan! Molimo pokusajte ponovo");
	}

}
