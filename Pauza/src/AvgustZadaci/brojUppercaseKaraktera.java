package AvgustZadaci;

import java.util.Scanner;

public class brojUppercaseKaraktera {

	public static void main(String[] args) {
		// Pronalazak velikih slova u stringu
		Scanner input = new Scanner(System.in);
                                                             // trazimo unos stringa od korisnika
        System.out.println("Unesite recenicu : ");
        
         String unos=input.nextLine();
         
         int brojac=0;                                   // promenljiva za brojanje velikih slova
         
         String rezultat="";                           // promenljiva za smjestanje pronadjenig velikih slova kasnije
         
        char[] findupper=unos.toCharArray();          // kreiramo niz za sve karaktere i pomocu javine metode smjestamo sve iz unosa
        
        for(int i=0;i<findupper.length;i++) {
        	
            if(findupper[i]>=65 && findupper[i]<=91){     //vrijednosti izmedju 65 i 91 tj od A do Z
            	brojac++;                          
            
               rezultat+=findupper[i];                  //  smjestanje samo velikih slova 
               
                
            }
        }
        System.out.println("Velika slova uVasoj recenici su: "+rezultat + " njihov broj je: " + brojac);  // ispis u konzolu
    }

	}


