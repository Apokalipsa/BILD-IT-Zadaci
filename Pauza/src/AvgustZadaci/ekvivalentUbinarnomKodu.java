package AvgustZadaci;

import java.util.Scanner;
import java.util.Stack;

public class ekvivalentUbinarnomKodu {
	public static void main(String[] args) {     
		Scanner input = new Scanner(System.in);
		                       
		System.out.println("Ispis ekvivalenta Vaseg broja u binarnom kodu");     // trazimo unos od korisnika  
		System.out.println("Unesite svoj broj");                                // smjestamo unos u praznu promenljivu
		int broj= input.nextInt();
		
		convertBinary(broj);                                                  // pozivamo prethodno kreiranu metodu
	}
	public static void convertBinary(int num){
		Stack<Integer> stek = new Stack<Integer>();                        // pozivamo stek javinu klasu 
	 
	    while (num != 0)                               // uslov da broj nije 0 petlja nastavlja sa radom
	    {
	      int kod = num % 2;                          // kod ce imati obrnuti redoslijed
	      stek.push(kod);                            // stvaramo memoriski prostor za kod preko puch komande tj stavi na stek
	      num /= 2;
	    } 
	 
	    System.out.print("\nBinary representation is:");
	    while (!(stek.isEmpty() ))                         // pod uslovom da nam je stek prazan dodajemo mu vrijednost
	    {
	      System.out.print(stek.pop());                   // smijesteni kod u prethodno kreiranom mem.prostoru za  preko pop komande iscitavamo
	    }
	    
	  }
	}
	 
	  


