package ZadaciAvgust;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ShuffleArrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();                  // kreiramo listu Integer

		Scanner input = new Scanner(System.in);
		System.out.print("Enter integers (input ends with 0): ");   // trazimo unos od korisnika da popuni listu
		int value;                                                 // stvaramo memoriski prostor za taj unos

		do {
			value = input.nextInt();                            // ucitavamo vrijednosti iz unosa

			if (value != 0)                                    // pod uslovom da unos nije 0
				list.add(value);                              // punimo listu
		} while (value != 0);
		for (int i = 0; i < value; i++) {
			value = input.nextInt();
			list.add(value);
		}

		shuffle(list);                                   // pozivamo se na prethodno kreiranu metodu za mijesanje brojeva

	}

	public static void shuffle(ArrayList<Integer> list) {                     // metoda koja mijesa brojeve 

		Collections.shuffle(list);                                           // pozivamo se na javinu metodu iz collectiona

		System.out.println("After shufflets entered numbers are: " + list); // ispis  konzoli

	}
}
