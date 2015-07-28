package Zadaci;

import java.util.Scanner;

public class PrestupneGodine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out
				.println(" Unesite pocetnu godinu racunanja prestupnih godina ");
		int pocetnaGodina = input.nextInt();// godina od koje krecemo
		System.out
				.println(" Unesite godinu do koje zelite racunati prestupne godine ");
		int krajnjaGodina = input.nextInt();// god do koje racunamo
		int sumaSvihGodina = 0;// suma je na nuli
		int brojeviPoLiniji = 10;// u zadatku se trazi 10 godina po liniji
		for (int i = pocetnaGodina; i <= krajnjaGodina; i++) {// for petlja da
																// prodjemo kroz
																// sve
			// godine
			if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)) {// uslov za
																// prestupnu
																// godinu
				sumaSvihGodina++;// kad god je uslov ispunjen uvecavamo sumu
									// koja broji
				// koliko je prestupnih god
				if (sumaSvihGodina % 10 == 0) {// uslov za ispis 10 godina po
												// liniji
					System.out.println(i + " ");

				} else {
					System.out.print(i + " ");
				}
			}

		}
		System.out
				.println("\nUkupan broj prestupnih godina u vremenskom periodu od "
						+ pocetnaGodina
						+ " god do "
						+ krajnjaGodina
						+ " je: "
						+ sumaSvihGodina);

	}
}
