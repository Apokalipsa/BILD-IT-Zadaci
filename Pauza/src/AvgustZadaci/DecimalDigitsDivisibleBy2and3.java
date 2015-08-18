package AvgustZadaci;

import java.math.BigInteger;

public class DecimalDigitsDivisibleBy2and3 {
	
	public static void main(String[] args) {

		BigInteger bigDecimal = new BigInteger("10000000000000000000000000000000000000000000000000"); // kreiramo objekat i pproslijedjujemo 50 dimenzionalni broj
				
		int count = 0;                               // memoriski prostor za brojac koji ce da printa 10 brojeva
		System.out.println("The first ten numbers with 50 decimal digits  divisible by 2 or 3 are: ");
				
		while (count < 10) {                        // postavljamo u petlju uslov za brojac i rad petlje
			
		if (bigDecimal.remainder(new BigInteger("2")).equals(BigInteger.ZERO)
					|| bigDecimal.remainder(new BigInteger("3")).equals(BigInteger.ZERO)) { // ako je uslov ispunjen da ostatak dijeljenja jednak 0
							
		System.out.println(bigDecimal);                 // iprintamo te brojeve
		count++;                                       // za svaku iteraciju kroz petlju brojac uvecavamo za 1
			}
		bigDecimal = bigDecimal.add(BigInteger.ONE);  // najveci broj printamo uz dodavanje svakog narednog dok je u uslovu postavljeno
														
			
			
		} 
	}
}
