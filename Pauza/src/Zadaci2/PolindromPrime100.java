package Zadaci2;

public class PolindromPrime100 {
	public static void main(String[] args) {
		 
        int count=1;                    // deklarisemo varijable brojaca da broji od broja 1
        int number=2;                   // pocinjemo od broja dva da vrsimo provjeru brojeva
        String result="";
 
        while(count<=100){                                   // sve dok je brojac manji od 100 petlja ce raditi
            if(Prime(number) && Palindromic(number)){        // uslov koji provjerava da li je broj polindrom
 
                if(count%10==0){                           // uslov za ispis 10 brojeva po liniji  
                    result += " "+number+"\n";  
                }else{
                    result += " "+number;
                }
                count++;        
            }
            number++;
 
        }
 
        System.out.print(result);                        //ispis svih 100 polindrom prostih brojeva 10 po liniji
 
    } // End of main method.
 
   
    public static boolean Prime(int num){              // metoda koja provjerava da li je broj prost
 
        
        int brojac = 0;
            for(int i=2; i<=num/2;i++){              // uslov za ispitivanje prostog broja
 
                if(num%i==0){
                    return false;                  // ukoliko nije prost vraca false
                }   
            }   
        return true;                            // ukoliko je prost vraca true
 
  
 
    } 
 
  
    public static boolean Palindromic(int broj){         // metoda koja vraca polindrom brojeve
 
                                                      // Deklarisemo 2 varijable za smjestanje provjerenih brojeva
        int rezultat = 0;
        int brojac = broj;
 
            // The number reversing.
            while(broj!=0){                      //  uslov sve dok broj nije 0 trazimo polindrom dalje
 
                int poslednjiBroj= broj % 10;
                rezultat = rezultat +poslednjiBroj *10;
                broj /=10;

            }
 
            if(brojac==rezultat){         // kada je broj jednak dobijenom obrnutom broju vraca true jer je polindrom
                return true; 
            }
        return false;                // u suprotnom vraca false
    }  
} 