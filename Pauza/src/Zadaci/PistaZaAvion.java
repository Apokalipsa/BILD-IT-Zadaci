package Zadaci;

import java.util.Scanner;

public class PistaZaAvion {
	public static void main(String[] args) {
		// trazimo od korisnika da unese trazene informacije o duzini i ubrzanju
		// aviona
		Scanner s = new Scanner(System.in);
		double ubrzanje, brzina, duzina;

		System.out.print("Unesite brzinu aviona:");
		brzina = s.nextDouble();

		System.out.print("Unesite ubrzanje pri uzlijetanju:");
		ubrzanje = s.nextDouble();
		// metodom stepenovanja dobijamo izracunatu duzinu po datoj formuli
		duzina = (Math.pow(brzina, 2)) / (2 * ubrzanje);

		System.out.print("Avionu brzine " + brzina
				+ " koji ostvaruje ubrzanje od " + ubrzanje
				+ " je potrebna pista minimalne duzine od: " + duzina);
	}
}