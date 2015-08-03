package AvgustZadaci;

import java.util.Scanner;

public class SamoglasnikSuglasnik {
	public static void main(String[] args) {
		// ovo je program za provjeru da li je uneseni karakter samoglasnik ili suglasnik
		Scanner input = new Scanner(System.in);
                                                                                   // trazimo unos karaktera od korisnika
		System.out.print("Unesite slovo:");
		char znak = input.nextLine().charAt(0);                                   // smjestamo unos u promenljivu 

		if ((znak >= 'A' && znak <= 'Z') || (znak >= 'a' && znak <= 'z')) {
			if (znak == 'A' || znak == 'E' || znak == 'I' || znak == 'O'          // uslov za pronalazak samoglasnika ukoliko je znak jednak
					|| znak == 'U' || znak == 'a' || znak == 'e' || znak == 'i'   // kao i a,o,e,i,u ili A,O,E,I,U
					|| znak == 'o' || znak == 'u') {
				System.out.println("Znak koji ste unijeli " + znak
						+ " je samoglasnik ");
			} else  {                                                            // ukoliko nije printamo suglasnik
				System.out.println("Znak koji ste unijeli " + znak
						+ " je suglasnik ");
			}
		} else if (znak >= '0' && znak <= '9') {
			System.out.println("Znak koji ste unijeli " + znak + " je broj");   // ukoliko je unos izmedju 0 i 9 onda je to broj
		} else {
			System.out.println("Znak koji ste unijeli  " + znak
					+ " nije ni broj, ni samoglasnik, ni suglasnik");          // ispis ukoliko unos nije niti slovo niti broj

		}

	}
}
