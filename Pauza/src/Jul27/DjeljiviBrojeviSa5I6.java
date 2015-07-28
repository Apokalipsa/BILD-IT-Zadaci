package Jul27;

public class DjeljiviBrojeviSa5I6 {
	public static void main(String[] args) {
		int numberPerLine = 10; // brojevi po liniji za ispis
		for (int i = 100; i <= 1000; i++) { // for petlja koja ce proci kroz sve
											// brojeve
			numberPerLine++;
			if (i % 5 == 0 && i % 6 == 0) // pod uslovom da su brojevi djeljivi
											// bez ostatka sa 5 i 6 oni se
											// ispisuju

				System.out.print(i + " "); // ispis u konzoli ukoliko je uslov
											// ispunjen

			if (i != 100 && (i - 100) % 300 == 0) // ukoliko uslov nije ispunjen
													// te je i ti broj manji od
													// 100

				System.out.println();
		}

	}

}
