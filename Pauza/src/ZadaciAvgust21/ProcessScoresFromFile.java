package ZadaciAvgust21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProcessScoresFromFile {
	public static void main(String[] args) {

		Scanner in= new Scanner(System.in);
		System.out.println("Enter name of file: ");                    // trazimo unos imena file od korisnika     
		String fileName = in.nextLine();
		
		File file = new File(fileName);                              // kreiramo file
		if (!file.exists()) {                                       // provjeravamo da li kreirani file  vec postoji 
			System.out.println(args[0] + " File does not exist!"); // ukoliko file ne postoji ispisujemo poruku
			System.exit(1);
		}
		double sum = 0;                               // kreiramo memoriski prostor za sumu
		int numberOfScores = 0;                      // kreiramo memoriski prostor za broj rezultatta
		double score=0;                             // kreiramo memoriski prostor za rezultat
		try {                                      // kreiramo try blok u kojem cemo citati iz filea
			Scanner input = new Scanner(file);
			while (input.hasNext()) {
				 score = input.nextDouble();      // sada score promenljivoj dodajemo sadrzaj iz filea
				 sum += score;                   // sabiramo sadrzaj i dodajemo ga promenljivoj sum

				numberOfScores++;              // kroz svaku iteraciju uvecavamo broj rezultata
			}
			System.out.printf("Number of scors in file is : %d", numberOfScores);
			System.out.printf("\nSum of all numbers in file is: %.2f", sum);                           // ispis rezultata u konzolu
			System.out.printf("\nAvarge of all numbers in file is: %.2f",(sum / numberOfScores));
					

		} catch (FileNotFoundException e) {       // ukoliko postoji greska catch blok je hvata i procesuira poruku
			e.printStackTrace();                 // pozivamo javinu metodu koja vraca gresku  u kodu
		}

	}

}
