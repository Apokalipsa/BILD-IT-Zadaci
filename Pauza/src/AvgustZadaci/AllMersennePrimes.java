package AvgustZadaci;

import java.math.BigInteger;



public class AllMersennePrimes {
	public static void main(String[] args) {
		
		BigInteger numb = new BigInteger("2");    //kreiramo objektnu instancu BigInteger javine klase sa parametrom 2 pocetnim brojem i svakim drugim sledecim
		
		BigInteger mersenn ;                    // kreiramo memoriski prostor za mersenn broj 
		for (int i = 0; i <= 100; i++) {
		mersenn = numb.pow(i);                 //dodjeljujemo mersenn varijabli vrijednosti po formuli 2^i
			BigInteger prime = mersenn.subtract(BigInteger.ONE);         //mersenne broj po formuli (2^i - 1)
			
			if (prime.isProbablePrime(1)) {                            // ukoliko je broj prost printamo rezultat
				System.out.println(i+"\n"+prime);
			}
		}
	}
}


	
	
			