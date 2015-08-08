package AvgustZadaci;

import java.util.Scanner;

public class PonavljanjeCetiriUzastopnaBroja {
	public static boolean isConsecutiveFour(int[] values){       // metoda koja provjerava da li ima 4 ista uzastopna broja
		   
			    for (int i = 0; i < values.length ; i++) {     // petljom prolazimo kroz duzinu niza
			      boolean isEqual = true;                     // kreiramo boolean promenljivu i postavljamo je da bude true
			      for (int j = i; j < i ; j++) {             // petljom prolazimo kroz sve brojeve koji su unijeti kroz unijetu duzinu
			        if (values[j] != values[j + 1]) {       // poredimo  ukoliko unijeti brojevi nisu jednaki vracamo boolean false i prekidamo program
			          isEqual = false;
			          break;
			        }
			      }
			     
			      if (isEqual) return true;              // dakle ukoliko su isti brojevi vracamo true 
			    }
			    
			    return false;                          // u suprotnom varacamo alse nema istih brojeva
			  }
			

public static void main (String[] args) {
    Scanner input = new java.util.Scanner(System.in);
                                                           // trazimo unos od korisnika koliko ce smjestiti brojeva u niz
    System.out.print("Unesite duzinu vaseg niza: ");
    int size = input.nextInt();                          // smjestamo taj broj u odgovarajuci memoriski prostor
    
    int[] values = new int[size];
    
    System.out.print("Unesite elemente u niz: ");     // trazimo zatim da korisni unese i sve elemente svoh niza
    for (int i = 0; i < values.length; i++)          // petljom prolazimo kroz unijetu duzinu niza
      values[i] = input.nextInt();                  // smjestamo elemente u odgovarajuci prostor
    
    if (isConsecutiveFour(values))                 // pozivamo se na metodu koja provjerava iste brojeve
      System.out.println("Vas unos ima seriju od 4 ponovljena broja!");    // ukoliko ima brojeva stampamo pozitivan odgovor
    else
    	System.out.println("Vas unos nema seriju od 4 ponovljena broja!"); // ukoliko nema istih brojeva stampamo negativan odgovor
  }
}
