package AvgustZadaci;

import java.util.Scanner;

public class UniCodeKaraktera {
	public static void main(String[] args) {
		
	Scanner input = new Scanner( System.in);             // trazimo unos od korisnika
	
	System.out.println("  Unesite jedan karakter: ");      
	char unos= input.nextLine().charAt(0);              // smjestamo unos u odgovarajuci memoriski prostor
	                            
	System.out.println ("Karakter unesenog broja " +  unos + " je---> " + toUnicode(unos)  );  // ispis u konzoli sa pozivom metode za vracanje broja
	                           

    
}
	public static  int toUnicode(char ch) {
		int broj=(int)ch;                     // tajpkastamo karakter ( unos) u broj tj int
		return broj;                         // vracamo taj konvertovani broj
	}

}	