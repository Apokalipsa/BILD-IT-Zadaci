package Zadaci2;

import java.util.Scanner;

public class ReversNumber {
	public static void reverse(int number) {                 // metoda koja ce vratiti broj unazad lada primi argument od korisnika

		int rezultat = 0;                                  //  promjenljiva koja ce primiti obrnut broj

		while (number > 0) {                             //  sve dok je broj veci od 0 trazimo obrnut broj
			rezultat = 10 * rezultat +number % 10;      // poslednji broj od obrnutog
			number /= 10;                              //   dobijamo zadnji broj od unesenog tj prvi broj obrnutog
			

		}

		System.out.println(" Uneseni broj" + number+ " u obrnutom redoslijedu je: " + rezultat); // ispis u konzoli
				

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);                // Trazimo unos od korisnika
		
		System.out.println(" Unesite jedan cijeli broj: ");
		int broj = input.nextInt();                          // ssmjestamo unos kao argumenat za daljnju obradu
		
		reverse(broj);                                      // pozivamo se na prethodno kreiranu metodu te joj proslijedjujemo argument
	}
}
