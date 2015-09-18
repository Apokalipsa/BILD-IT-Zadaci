package ZadaciAvgust24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BabyNames {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner input = new Scanner(System.in);              //  kreiramo skener da bi dopustili unos korisniku

		System.out.print("\nEnter the year: ");             // trazimo unos potrebnih podataka od korisnika
		String year = input.next();

		System.out.print("\nEnter the gender (M( male) or F(female)): ");
		String gender = input.next();

		System.out.print("\nEnter the name: ");               // smjestamo sve unose sa konzole
		String name = input.next();

		File file = new File("names" + year + ".txt");     // kreiramo file sa imenima
		boolean isOn = false;                             // kreiramo promenljivu za postojanje imena

		try {                                           // kreiramo try blok radi eventualnih gresaka pri unosu

			Scanner readFromFile = new Scanner(file);           // pozivamo se na scener da bi citali podatke iz filea
			while ( readFromFile.hasNext()) {                  // petlja radi sve dok ima sadrzaja u fileu

				int rank =  readFromFile.nextInt();           // kreiramo promenljivu koja smjesta broj u rang listi iz filea
				String male =  readFromFile.next();          // kreiramo string za musko ime
				 readFromFile.nextInt();
				String famale =  readFromFile.next();       // kreiramo string za zensko ime
				 readFromFile.nextInt();

				if (gender.equalsIgnoreCase("M")                           // postavljamo uslov 
						&& name.equalsIgnoreCase(male)) {

					System.out.println(name + " is ranked #" + rank      // ukoliko je uslov ispunjen 
							+ " in year " + year);
					isOn = true;                                        // vracamo ime kao true

					break;

				} else if (gender.equalsIgnoreCase("F")               // isto ponavljamo i za zensko ime
						&& name.equalsIgnoreCase(famale)) {
					System.out.println(name + " is ranked #" + rank
							+ " in year " + year);
					isOn= true;
					break;
				}

			}

			 readFromFile.close();                                  // zatvaramo file

			if (!isOn) {
				System.out.println("\nThe name " + name           // ukoliko nema tog imena u fileu vracamo poruku upozorenja
						+ " is not ranked in year " + year);
			}

		} catch (FileNotFoundException e) {          // ukoliko  postoji greska pri unosu sa catch blokom je hvatamo
			e.printStackTrace();                    //  te je ispisujemo pomocu javine metode koja tacno pokazuje gdje i koja je greska u kodu
		}
	}

}
