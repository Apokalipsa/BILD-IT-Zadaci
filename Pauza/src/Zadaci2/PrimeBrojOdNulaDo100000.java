package Zadaci2;

public class PrimeBrojOdNulaDo100000{
	public static void main(String[] args) {
		int brojac = 0;
		for (int i = 0; i <= 100000; i++) {
			if (isPrime(i)) {                // uslov ako je broj prost onda se printa
				System.out.print(i + " "); 
				if (brojac % 30== 0) {        //  uslov kada je brojac dostigao 30 iteracija prelazi u novi red
					System.out.println();
				}
				brojac++;                 // za svaku iteraciju kroz petlju povecati brojac i ispisati rezultat
			}
		}

	}

	public static boolean isPrime(int number) {   //  metoda koja provjerava je li broj prost
		for (int i = 2; i < number; i++) {       //  prost je djeljiv sa 1 i sam sa sobom zato petlja krece od broja 2
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}



