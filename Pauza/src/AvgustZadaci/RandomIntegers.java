package AvgustZadaci;

import java.util.Random;

public class RandomIntegers {

	public static int[]randomIntegers (){                // metoda koja ce vratiti 100 random brojeva izmedju o i 9
		
		 Random r= new Random();                       // pravimo instancu objekta random javine klase
		int[] integers = new int[100];                // kreiramo niz od 100 brojeva
	    for (int i = 0; i < integers.length; i++) {  // petljom prolazimo kroz svaki broj u prethodno kreiranom nizu
	      integers[i] = r.nextInt(9);               // kazemo kreirani niz je jednak random brojevima do 9 znaci punimo niz
	    }

	    for (int i : integers) {                  // ponovo for each petljm prolazimo kroz sve brojeve u nizu
	      System.out.print(i + " ");             //  ispisujemo svaki od brojeva
	    }
		return integers;                       // ispisujemo rezultat u konzoli
}
	public static void main(String[] args) {
		randomIntegers ();                    // pozivamo se na prethodno kreiranu metodu 
	}
}