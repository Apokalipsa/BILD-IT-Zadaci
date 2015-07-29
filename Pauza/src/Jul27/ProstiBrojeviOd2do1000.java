package Jul27;

public class ProstiBrojeviOd2do1000 {

	public static void main(String[] args) {
		int brojac = 0;
		for (int i = 2; i <= 1000; i++) {
			if (isPrime(i)) {                // uslov ako je broj prost onda se printa
				System.out.print(i + " "); 
				if (brojac % 8 == 0) {        //  uslov kada je brojac dostigao 8 iteracija prelazi u novi red
					System.out.println();
				}
				brojac++;                 // za svaku iteraciju kroz petlju povecati brojac
			}
		}

	}

	public static boolean isPrime(int number) {  //  metoda koja provjerava je li broj prost
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
