package ZadaciAvgust20;

import java.awt.im.spi.InputMethod;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
	
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		                           
			try {	                                            // kreiramo try blok 
				int[] niz = new int[100];                      // kreiramo niz od 100 vrijednosti                  
			for (int i = 0; i < 100; i++) {                   // petljom prolazimo kroz niz
				niz[i] = (int) (Math.random() * 100);        // javinom metodom punimo niz randim brojevima
				
				System.out.println(" Unesite broj indexa za provjeru? ");     // trazimo unos broja indexa za provjeru od korisnika
				int index = input.nextInt();
				System.out.println("Element na indexu" + index + " je: "+ niz[index]);  // provjeravamo broj na trazenom indexu
						
			}
		} catch (IndexOutOfBoundsException e) {          // ovim blokom hvatamo gresku i ispisujemo poruku korisniku
			System.out.println(" Out of Bounds!");
		}

	}

}
