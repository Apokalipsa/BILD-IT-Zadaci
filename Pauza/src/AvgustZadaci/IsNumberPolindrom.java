package AvgustZadaci;

import java.util.Scanner;

public class IsNumberPolindrom {
	public static void main(String args[]){ 
		 Scanner input= new Scanner(System.in);             // trazimo unos od korisnika
	       System.out.print("Enter Number: ");
	      
	       int num =input.nextInt();
	       
	       int polinrdone = num;                         // kreiramo promenljivu za trazeni polindrom i i stavljamo da je jednaka unesenom broju
	       
	       int rev=0;                                   // kreiramo promenljivu za obrnut
	       int rmd; 
	       while(num > 0)                             // uslov za rad petlje da broj mora biti veci 0
	       { 
	         rmd = num % 10; 
	         rev = rev * 10 + rmd;                  // formula za dobijanje obrnutog broja
	         num = num / 10; 
	       } 
	       if(rev == polinrdone)                  // poredimo da li je dobijeni obrnut jednak unesenom broju
	         System.out.println(polinrdone+" is a Palindrome Number!"); 
	       else                                                                // u zavisnosti od broja stampamo razultat provjere
	         System.out.println(polinrdone+" is not a Palindrome Number!"); 
	     } 
	}

