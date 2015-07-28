package Zadaci2;

import java.io.IOException;

public class SavrseniBrojevi {

	public static void main(String[] args) {

		int brojac = 0;
		System.out.println("Savrseni brojevi u rasponu od 0 do 10 000: ");
		for (int i = 1; i < 10000; i++) {

			brojac = SavrseniBroj(i);

			if (brojac == i) {// ako je brojac jednak broju i printamo taj broj
								// jer je savrsen

				System.out.println(brojac);
			}
		}
	}

	public static int SavrseniBroj(int broj) {
		int suma = 0;
		for (int i = 1; i < broj; i++) {
			// provjeravamo da li je broj djeljiv sa brojevima od 1 pa sve do
			// trayenog broja kao i sam sa sobom

			if (broj % i == 0) { // ukoliko je broj djeljiv sabiramo ga

				suma += i;
			}
		}
		return suma;  // vracamo zbir nadjenih djelilaca
	}
}
