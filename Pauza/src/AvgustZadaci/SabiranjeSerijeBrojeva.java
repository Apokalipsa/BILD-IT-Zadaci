package AvgustZadaci;

public class SabiranjeSerijeBrojeva {
	public static void main(String[] args) {
		// sabiranje brojeva serije od 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13// ..... + 95/97 + 97/99.
		
		double zbir = 0;                             //  kreiramo promjenljivu koja ce smjestiti trazeni rezultat
		
		for (int i = 1; i <= 100; i += 2) {        // kroz petlju prolazimo od broja 1 do 100 i to svaki drugi
			zbir = zbir + (double) i / (i + 2);   // svaki drugi broj iz petlje dodajemo u zbir te je dijelimo po zadatoj seriji
		}
		
		System.out.print(zbir);                 // ispis u konzolu
	}

}
