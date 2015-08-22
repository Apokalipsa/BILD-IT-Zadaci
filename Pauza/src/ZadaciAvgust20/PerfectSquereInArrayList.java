package ZadaciAvgust20;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectSquereInArrayList {
	public final static boolean isPerfectSquare(long n) {               // metoda koja provjerava savrsen squere
		if (n < 0)                                                     // ukoliko je neki broj manji od 0 vraca false
			return false;

		long number = (long) (Math.sqrt(n) + n);                     // kreiramo varijablu koja uzima korijen iz unesenog broja sabran sa tim brojem
		return number * number == n;                                // vracamo taj vrijednost varijable 
	}

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<>();            // kreiramo listu brojeva

		Scanner input = new Scanner(System.in);
	                           
		System.out.println("Please enter an integer m: ");    // trazimo unos od korisnika
		System.out.println("-----------------------------");
		int m = input.nextInt();
		int k = m;                                          

		for (int i = 2; i < m; i++) {
			while (m % i == 0) {
				list.add(i);
				m /= i;
			}
		}
		int[] valeu= new int[25];                   // kreiramo niz u koji ce se unijeti brojevi
		for (Integer array1 : list) {
			valeu[array1]++;                      // prolaskom kroz petlju sve elemente iz liste u kreirani niz
		}

		int n = 1;
		for (int i = 0; i < 25; i++) {
			if (valeu[i] % 2 != 0)
				n = n * i;
			if(isPerfectSquare(n)){
		}
		

	}System.out.println("The smallest number n for m * n to be perfect square is "+ n);   // ispis u konzoli
	System.out.println("----------------------");				
	System.out.println("m * n is: " + (k * n));

}
}
