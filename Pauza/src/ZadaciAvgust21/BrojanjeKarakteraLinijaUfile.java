package ZadaciAvgust21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BrojanjeKarakteraLinijaUfile {
	public static void main(String[] args) {
		
		File file = new File(args[0]);                          // kreiramo file
		if (!file.exists()) {                                  // provjeravamo da li kreirani file  vec postoji 
			System.out.println(args[0] + " does not exist!"); // ukoliko file ne postoji ispisujemo poruku
			System.exit(1);
		}
		if (args.length != 1) {                              // provjeravamo da li je unesen odgovarajuci argumenat  za pretragu po imenu u file
			System.out.println("Invalid arguments.");       // ukoliko nije ipsijujemo poruku i trazimo ponovni unos 
			System.out.println("Enter: \"fileName\"");     // imena file
			System.exit(0);
		}
		int caracters = 0;                   // kreiramo memoriski prostor za karaktere
		int words = 0;                 // kreiramo memoriski prostor za  rijeci
		int lines = 0;                // kreiramo memoriski prostor za linije
		String after = "";           // kreiramo memoriski prostor za prazan string kojim cemo mijenjati postojece u fileu
		
		try {                                             //  kreuramo try blok u koji pomocu skenera iscitavamo sadrzaj iz filea
			
			Scanner input = new Scanner(file);
			while (input.hasNext()) {
				after = input.nextLine();             // kazemo da je sada prazni string jednak saadrzaju iz filea
				lines++;                             // te brojimo koliko ima linija u tom fileu
				caracters += after.length();        // sada sabiramo sve karaktere iz svake linije filea
				String[] numberOfWords;            // kreiramo niz za rijeci koje se nalaze u fileu
				numberOfWords = after.split(" "); // linije moramo splitati kako bismo dobili rijeci dodavajuci im razmak
				for (int i = 0; i < numberOfWords.length; i++) {  // prolazimo petljom kroz sve rijeci
					words++;                                     // kroz svakuiteracijusabiramo rijeci
				}

			}
		} catch (FileNotFoundException e) {      // catch blokom hvatamo eventualne greske
		
			e.printStackTrace();                // pozivamo javinu metodu koja vraca gresku  u kodu
		}
		
		System.out.println("This file contains: " + caracters+ " numbers of characters ");
		System.out.println("This file contains: " + words + " numbers of words " );
		System.out.println("This file contains: " + lines + " numbers of lines ");              // ispis rezultata u konzolu
	}
}