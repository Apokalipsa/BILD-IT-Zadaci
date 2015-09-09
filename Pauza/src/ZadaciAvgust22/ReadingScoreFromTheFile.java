package ZadaciAvgust22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class ReadingScoreFromTheFile {
	public static void main(String[] args) throws FileNotFoundException {

		String UrlAdress = "http://cs.armstrong.edu/liang/data/Scores.txt";    // u string smjestamo trazenu adresu

		try {                                                 // kreiramo try blok

			URL urlad = new URL(UrlAdress);                 // kreiramo url objekat prosledjujemo mu prethodno kreiranu adresu
			Scanner input = new Scanner(UrlAdress);        // pomocu skenera citamo podatke iz url adrese
			input = new Scanner(urlad.openStream());      // pozivamo se na javinu metodu za otvaranje

			int sum= 0;
            int number=0;
            int counter=0;
			while (input.hasNext()) {                 // uslov za rad petlje je dok god ima sadrazaja u fileu
				number = input.nextInt();            // brojevi iz file se dodjeljuju promenljivoj number      
				sum += number;                      // sabiramo sve brojeve u fileu
				counter++;                         // kroz svaku iteraciju petlje brojac se povecava

				System.out.print(number + " ");  // ispis brojeva u konzolu

			}
			double prosjek=0;
			 prosjek= (double) sum / counter;  //  tajpkastamo int iz sume u double i dijelimo sa svim brojevima
														
			System.out.println("\nUkupna suma svih brojeva je: " + sum+ "\nProsjek sume svih brojeva je: " + prosjek);
					

		} catch (IOException ex) {         // catch blok hvata gresku i ispisuje se poruka upozorenja

			System.out.println(ex.getMessage());  

		}

	}

}