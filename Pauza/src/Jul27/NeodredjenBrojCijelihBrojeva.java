package Jul27;

import java.util.Scanner;

public class NeodredjenBrojCijelihBrojeva {
	
	public static void main(String[] args) {
// Uzimamo potrebne podatke od korisnika sa tastature
		Scanner input = new Scanner(System.in);

		int suma = 0;
		int pozitivni = 0;
		int negativni = 0;
		double prosjek = 0;
		int brojac = 0;
		int broj;

		System.out.print("Unesite brojeve (0 prekida unos): ");
		do {

			broj = input.nextInt();
			suma += broj;
			if (broj > 0) {         // uslov za pozitivne brojeve
				pozitivni++;
			}
			if (broj < 0) {       // uslov za negativne brojeve
				negativni++;
			}
		} while (broj != 0);    //  uslov za unos sa konzole
		
		prosjek = suma / (double) brojac; // tajpkastamo int u double i dobijamo prosjek
		
		System.out.println("Broj pozitivnih brojeva je: " + pozitivni);                   // ispisujemo u konzolu pozitivne brojeve
		
		System.out.println("Broj negativnih brojeva je: " + negativni);                  //  ispisujemo u konzolu negativnebrojeve
		
		System.out.println("Ukupan zbir svih brojeva je: " + suma);                    // ispisujemo  zbit svih nesenih brojeva u konzolu 
		
		System.out.println("Prosjek svih unesenih brojeva je: " + prosjek);           //  ispisujemo  prosjek brojeva u konzolu 

	}
}