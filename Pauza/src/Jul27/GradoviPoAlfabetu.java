package Jul27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class GradoviPoAlfabetu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);          // trazimo unos podataka od korisnika (gradove)
		ArrayList<String> cities = new ArrayList<>();    // smjestit cemo te podatke zajedno u listu
		
		System.out.println(" Unesite ime prvog grada?");
		cities.add(input.nextLine());                     // dodajemo prvi
		
		System.out.println(" Unesite ime drugog grada?");
		cities.add(input.nextLine());                     // dodajemo drugi
		
		System.out.println(" Unesite ime treceg grada?");
		cities.add(input.nextLine());                     // dodajemo treci
		
		Collections.sort(cities);                         // pozivamo metodu sortiranja koja se nalazi u java biblioteci
		
		System.out.print(" Po alfabetnom redu vasi gradovi su: " + cities);  // ispis u konzoli obradjenih

	}

}
