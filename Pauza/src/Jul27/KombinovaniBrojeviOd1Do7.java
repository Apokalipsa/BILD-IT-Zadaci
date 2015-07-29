package Jul27;

public class KombinovaniBrojeviOd1Do7 {
	public static void main(String[] args) {
		final int broj1 = 7;
		final int broj2 = 1;
		int brojac = 0;                          // brojacem cemo provjeravati broj iteracija u petlji
		System.out.println(" Moguce kombinacije brojeva: " + broj2 + " i " + broj1 + " su: ");
		for (int i = broj2; i <= broj1; i++) { // ovom  petljom prolazimo od 1 do 7 broja
												
			for (int j = broj2; j < i; j++) { // unutrasnjom petljom krecemo od prvog trazenog i pravimo kombinaciju sa i tim iz prethodne petlje
											// i(krece od 1 i povecava za 1)
				brojac++;                  // svaku kombinaciju sabiramo
				if (brojac % 2 == 0) {    // uslov za printanje po dva broja u redu
					
					System.out.println(" [" + j + " " + i + "] "); 
																	
																	
				} else {
					System.out.print(" [" + j + " " + i + "] ");
				}
			}
		}
		System.out.println();
		System.out.println("Ukupan broj kombinacija je: " + "[" + brojac+ "]");  // ispis broja komb. u konzoli
				 
	}
}
