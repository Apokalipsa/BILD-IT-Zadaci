package ZadaciAvgust24;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DisplaysOccurrencesEachLetterInFile {


	public static void main(String[] args) throws IOException {
	

		 Scanner input = new Scanner(System.in);     // kreiramo skener za unos od korisnika
		
		System.out.print("\nEnter file name: ");    //  trazimo unos od korisnika tj: lincoln.txt
		
		String fileName = input.next();            // smjestamo taj unos
		
		File file = new File(fileName);           // provjeravamo da li file postoji i kreiramo ga ako ne postoji
		if( file.exists()) {
			System.out.println(" File olready exist!");
			System.exit(0);                         
		}
		
		char[] leters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		int [] counter = new int[26];                               // kreiramo niz koji ima 26 polja
		
		 Scanner redFromFile = new Scanner(file);                 // citamo podatke iz filea
		
		System.out.println("\n");
		
		while(redFromFile .hasNext()) {                        // petlja se vrti dok ima sadzaja u fileau
			
			String line = input.nextLine();                  // kreiramo string koji prima podatke iz file u obliku recenica
			
			for(int i=0; i<line.length(); i++) {            // prolazimo kroz citavu duzinu recenice tj reda
				
				char slovo = line.charAt(i);              // izjednacujemo slova iz niza sa slovima iz recenica u redu filea
				
				for(int j=0; j<counter.length; j++) {   // prolazimo kroz niz koji sadrzi slova njih 26
				   
					if(slovo == leters[j]) {          // poredimo slova iz niza sa karakterima iz recenica u redu
						counter[j]++;                // kroz svaku iteraciju uvecavamo brojac i tako dobijamo broj odredjenog slova
				   }
					
				}	
			}
		}
		
		for(int i=0; i<leters.length; i++) {         // za sve karaktere iz niza slova
			                                        // ispis svih karaktera i broj njihovog pojavljivanja
			System.out.println("\nThe occurrences of each letter in the file '" + leters[i] + "' are: " +counter[i]); // printamo
		}
	}
	
}
