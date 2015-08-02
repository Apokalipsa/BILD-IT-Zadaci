package AvgustZadaci;

import java.util.Scanner;

public class ZbirSvihBrojevaUjednomBroju {         

	                                

	public int getNumberSum(long n) {             // metoda koja ce vratiti zbir brojeva koji su clanovi nekog broja
		
		int num = (int) (n);                    // tajpkastamo long u int kako bi mogli sabirati brojeve
        int sum = 0;    

        while (num > 0) {                    // sve dok je broj veci od 0 petlja vrti brojeve 

            sum += num % 10;                //formula za dobijanje poslednjeg broja koji se dalje sabira
            num = num / 10;                // sledeci manji broj za jednu cifru tj desetica unesenog broja

        }
        return sum;                     // rezultat svih sabranih brojeva pojedinacno
    }


	public static void main(String a[]) {

		Scanner input = new Scanner(System.in);
                                                              // trazimo unos od korisnika
		System.out.println(" Enter your number: ");
		int number = input.nextInt();

		ZbirSvihBrojevaUjednomBroju zbir = new ZbirSvihBrojevaUjednomBroju();   // kreiramo objeknu instancu nase klase

		System.out.println("Sum of enterednumber "  + " [ " + number +" ] "  + " is: " + zbir.getNumberSum(number));  
		// pozivamo se na prethodno kreiranu metodu i ispisujemo rezultat u konzolu
	}
}
