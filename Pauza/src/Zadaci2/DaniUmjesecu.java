package Zadaci2;

import java.util.Scanner;
import java.util.Calendar;

public class DaniUmjesecu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Unesite mjesec za koji zelite kalendar ?");  //  trazimo unos od korisnika potrebnih podataka
		int mjesec = input.nextInt();
		System.out.println(" Unesite godinu za koji zelite kalendar ?");
		int godina = input.nextInt();
// pravimo instancu objekta kalendar
		Calendar kalendar = Calendar.getInstance();
		int dani = kalendar.getActualMaximum(Calendar.DAY_OF_MONTH); // pozivamo metodu iz jave koja vraca dan u mjesecu
		System.out.println(+mjesec + " Mjesec " + godina + " godine ima "
				+ dani + " dan.");
	}
}