package Zadaci2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IznosRacunaSaNapojnicom {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);                                  // Uzimamo unos od korisnika
		
		System.out.println(" Unesite iznos Vaseg racuna: ") ;
		double racun = input.nextDouble();                                    // smjestamo unos u odgovarajuci memoriski prostor
		
		System.out.println(" Unesite iznos  napojnice u procentima: ");
		double procenatZaNapojnicu = input.nextDouble();
		
		double napojnica = racun *(procenatZaNapojnicu  / 100);          // formula za iznos napojnice
		double ukupanRacun = racun + napojnica;                         //  formula za iznos ukupnog racuna
		                  
		System.out.println(" Vas ukupan racun iznosi " + ukupanRacun+ " a napojnica za taj racun iznosi " + napojnica); // ispis u konzoli
		  

				
	}

}
