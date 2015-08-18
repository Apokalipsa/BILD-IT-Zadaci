package AvgustZadaci;

import java.math.BigInteger;

public class LargerNumbers {
	public static void main(String[] args) {
		
		BigInteger big= new BigInteger(Long.MAX_VALUE + "");   // kreiramo objektnu instancu javine klase BigInteger
		int counter = 0;                                      // kreiramo memoriski prostor za brojac koji ce kasnije primiti vrijednost
		
		System.out.println("The first 5 prime numbers larger than Long.MAX_VALUE are: ");
				
		while (counter < 5) {                               // postavljamo uslov sve dok je brojac manji od 5 jer zelimo 5 brojeva
			if (big.isProbablePrime(counter)) {            // pozivamo se na provjeru prostog broja u javinoj klasi
				System.out.println(big);
				counter++;                               // za svaku iteraciju kroz petlju uvecavamo brojac za 1
			}
			big = big.add(BigInteger.ONE);             // provjereni brojeve printamo u konzoli
		}
	}
}
