package AvgustZadaci;

import java.util.Scanner;

public class NaopakString {
	public static void main(String[] args) {
		// napisati program koji ce vratiti string naopako
		Scanner input = new Scanner(System.in);
	
		System.out.println(" Unesite string");             	       // trazimo unos stringa od korisnika
	        String unos = input.nextLine();                       // smjestamo taj unos u jedan prazan string
	        
	        int brojSlova = unos.length();                       // kreiramo promenljivu u koju cemo smjestiti broj slova u unosenom stringu
	        char[] tempCharArray = new char[brojSlova ];  
	        char[] charArray = new char[brojSlova ];            // niz za karaktere u koju dodajemo broj karaktera iz unosa
	        
	        for (int i = 0; i < brojSlova ; i++) {            // stavljamo originalni string u kreiran niz za karaktere
	            tempCharArray[i] = 
	               unos.charAt(i);
	        } 
	        
	        for (int j = 0; j < brojSlova ; j++) {           // ovom petljom dobijamo obrnut redosled slova u stringu
	            charArray[j] =
	                tempCharArray[brojSlova  - 1 - j];
	        }
	        
	        String obrnutString = new String(charArray);    // kazemo da je obrnut string jednak nizu karaktera 
	            
	        System.out.println(obrnutString);              // printamo taj niz
	    }
}