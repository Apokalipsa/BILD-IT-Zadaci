package ZadaciAvgust24;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class TotalSalaryBigDataSet {
	public static void main(String[] args) throws MalformedURLException {
		URL salary = new URL("\nhttp://cs.armstrong.edu/liang/data/Salary.txt");   // kreiramo promenljivu sa url adresom
		try {                                                                     // kreiramo try blok
			Scanner readFromUrl = new Scanner(salary.openStream());              // ucitavamo podatke iz url adrese pomocu skenera
			while (readFromUrl.hasNextLine()) {                                 // petlja radi dok god ima podataka
				String line = readFromUrl.nextLine();                          // kreiramo promenljivu za podatke po  liniji
				System.out.println(line);                                     // prosledjujemo te linije na obradu i printamo rezultat
			}
			readFromUrl.close();                                  // yatvaram citanje sa url-a
		} catch (IOException e) {                                // catch blokom hvatamo gresku
			e.getStackTrace();                                  // javinoom klasom ispisujemo gdje je tacno napravljena greska u kodu
		}
	}
}