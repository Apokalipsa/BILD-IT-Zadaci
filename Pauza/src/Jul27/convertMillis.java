package Jul27;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class convertMillis {
	public static String konverzija(long millis) {

		int milisekunde = (int) millis / 1000;          // formula za dobijanje
												       // milisekunda

		int sekunde = milisekunde % 60;               // milisekunde dijelimo sa 60 i dobijamo
										             // sekunde

		int minuti = (milisekunde / 60) % 60;     // formula za dobijanje minuta

		int sati = (milisekunde / (60 * 60)) / 60;   // dobijamo sate po navedenoj
													// formuli

		String result = sati + ":" + minuti + ":" + sekunde; // pravimo rezervni string u koji smijestamo dobijene informacije kako bi ih vratili

		return result;

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(" unesite zeljene milisekunde: ");
		long sekunde = s.nextLong();
		System.out.println(konverzija(sekunde));

	}

}
