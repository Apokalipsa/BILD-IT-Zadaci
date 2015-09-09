package ZadaciAvgust22;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AdresCountingWords {
	public static void main(String args[]) throws FileNotFoundException {

		System.out.println("Counting Words in President Abraham Lincoln’sGettysburg address");
				

		//String adress = "http://cs.armstrong.edu/liang/data/ Lincoln.txt.";

		File file = new File("source.txt");           // kreiramo file koji sadrzi Abraham Lincoln adresu
		if (!file.exists());                         // provjeravamo da li file vec postoji
		System.out.println("File does not exixt");  // ukoliko ne postoji ispisujemo poruku upozorenja
		System.exit(0);
	
		Scanner input = new Scanner(new FileInputStream(file));            // kreiramo scener da bi iscitali podatke iz filea
		int counter = 0;                   // kreiramo promenljivu za brojac koji ce brojati rijeci u fileu
		while (input.hasNext()) {         // postavljamo petlju da radi sve dok ima sadrazaja u fileu
			input.next();
			counter++;                   // kroz svaku iteraciju brojac uvecavamo dok ima sadrzaja
		}
		System.out.println("Number of words: " + counter);  // ispis rezultatta u konzolu
	}
}
