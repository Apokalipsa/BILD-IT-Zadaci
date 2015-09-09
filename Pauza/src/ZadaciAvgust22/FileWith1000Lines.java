package ZadaciAvgust22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWith1000Lines {
	
	public static double getSalary(String rank) { // metoda koja vraca trazene podatke u odredjenom vremenu
		double salary = 1.0;
		if (rank.equals("assistant")) {                          // poredimo unos sa pozicijom pomocu javine metode equals
			salary = (double) (Math.random() * 30001) + 50000;  // dodjeljujemo pozicije te random dodjeljujemo iznos plate
		} else if (rank.equals("associate")) {
			salary = (double) (Math.random() * 50001) + 60000;
		} else {
			salary = (double) (Math.random() * 55001) + 75000;
		}
		return salary;                   // vracamo iznos plate 
	}



	
	public static void main(String[] args) {
		File file = new File("Salary.txt");                    // kreiramo file 
		if (file.exists()) {                                  // provjeravamo da li file vec postoji
			System.out.println("This file already exists!"); // ukoliko file postoji ispisujemo poruku upozorenja i kreiramo novi file
			System.exit(0);                                 // program u tom slucaju prestaje sa radom
		}
		double salary;       // kreiramo memoriski prostor za promenljivu koja ce smjestiti iznos plate
		String rank = "";   // kreiramo memoriski prostor za promenljivu koja prima radne pozicije
		String[] ranks = { "assistant", "associate", "full" };  // kreiramo string niz i dodajemo mu trazene vrijednosti
																
		
		try {       // otvaramo try blok
			PrintWriter output= new PrintWriter(file);   // pomocu javine metode Print Writer upisujemo podatke u file
			                                            // 1000 linija koje sadrze ime,prezime, platu i poziciju zaposlenih
			for (int i = 1; i <= 1000; i++) {          // petlju postavljamo na 1000 obrtaja
				rank = ranks[(int) (Math.random() * ranks.length)]; // random biramo poziciju
				salary = getSalary(rank);                          // pozivamo se na  prethodno kreiranu metodu metodu prodledjujemo joj  random poziciju
				output.print("FirstName" + i + " LastName" + i);  // upisujemo podatke u file
				output.printf(" " + rank + " %.2f\n", salary);
				output.println();
			}
		} catch (FileNotFoundException e) {           // ukoliko ima gresaka u programu u  catch bloku je hvatamo
			e.printStackTrace();                     // pozivamo se na javinu metodu koja vraca tacno mjesto i gresku u kodu
		}

	}
	}

	
	
