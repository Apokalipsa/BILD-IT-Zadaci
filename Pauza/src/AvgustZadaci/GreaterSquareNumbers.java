package AvgustZadaci;

import java.math.BigInteger;

public class GreaterSquareNumbers {
	public static void main(String[] args) {
		
		BigInteger MaxLong = new BigInteger(Long.MAX_VALUE + ""); // kreiramo objektnu instancu javine klase i postavljamo je na najvecu javinu vrijednost
		long number = (long) Math.sqrt(Long.MAX_VALUE);          // tajpkastamo  max vrijendost i korijenujemo je
															
		BigInteger big = new BigInteger(number + "");          //kreiramo instancu kojoj proslijedjujemo dobijeni  korjenovani broj
														
		int counter = 0;                                     // kreiramo memoriski prostor za brojac kojem cemo dodijeliti vrijednost
		BigInteger numberSquer;
		                                                   // kreiramo memoriski prostor za broj koji stepenujemo
		System.out.println("The first 10 square numbers that are greater than Long.MAX_VALUE:\n");
		System.out.println();
		
		while (counter < 10) {                             // potrebno nam je 10 brojeva pa uslov u petlju postavljamo
		numberSquer = big.pow(2);                         // dodjeljujemo vrijednost i izjednacavamo taj broj sa max brojem u javi
		if (numberSquer.compareTo(MaxLong) > 0) {        //poredimo dobijenu vrijednost sa nasom max vrijednoscu
				
		System.out.println(big + " squared number = " + numberSquer);   // ukoliko je uslov ispunjen printamo taj broj
		counter++;                                                     // uvecavamo brojac za 1
			}
		big = big.add(BigInteger.ONE);                               // printamo 10 provjerenih brojeva koji se uvecavaju za 1 u svakoj iteraciji
											

		}
	}
}


