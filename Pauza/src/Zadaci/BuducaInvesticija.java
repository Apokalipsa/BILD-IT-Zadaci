package Zadaci;

import java.util.Scanner;

public class BuducaInvesticija {

	public static void main(String[] args) {
		// unos podataka od korisnika
		Scanner input = new Scanner(System.in);
		System.out.println(" Molim unesite iznos Vase investicije");
		double investicija = input.nextDouble();
		System.out.println(" Molim unesite iznos godisnje kamatnu stopu");
		double kamatnaStopa = input.nextDouble();
		System.out
				.println(" Molim unesite iznos godina koje zelite da provjerite");
		int godine = input.nextInt();
		double buducaVrijednost;
		double mjesecnaKamata;
		mjesecnaKamata = kamatnaStopa * 1200; // formula za dobijanje mjesecnog
												// iznosa
		buducaVrijednost = investicija
				* Math.pow((1 + mjesecnaKamata), (godine * 12)); // formula za
																	// buducu
																	// vrijednost
																	// investicije
		System.out.println(" Iznos Vase investicije od " + investicija
				+ " nakon " + godine + " godina po kamtanoj stopi od "
				+ kamatnaStopa + " % iznosit ce " + buducaVrijednost
				+ " konvertibilnih maraka.");

	}

}
