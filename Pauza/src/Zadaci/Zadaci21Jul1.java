package Zadaci;

public class Zadaci21Jul1 {
	public static void main(String[] args) {
		System.out.println(" Prestupne godine od 101 do 2100 - te ");
		int pocni = 101;// godina od koje krecemo
		int zavrsi = 2100;// god do koje racunamo
		int suma = 0;// suma je na nuli
		int numberPerLine = 10;// u zadatku se trazi 10 godina po liniji
		for (int i = 101; i <= 2100; i++) {// for petlja da prodjemo kroz sve
											// godine
			if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)) {// uslov za
																// prestupnu
																// godinu
				suma++;// kad god je uslov ispunjen uvecavamo sumu koja broji
						// koliko je prestupnih god
				if (suma % 10 == 0) {// uslov za ispis 10 godina po liniji
					System.out.println(i + " ");

				} else {
					System.out.print(i + " ");
				}
			}

		}
		System.out
				.println("\nUkupan broj prestupnih godina u vremenskom periodu od 101 god do 2100 je: "
						+ suma);

	}
}
