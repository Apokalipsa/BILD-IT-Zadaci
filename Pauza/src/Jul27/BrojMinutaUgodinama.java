package Jul27;

import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class BrojMinutaUgodinama {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Unesite  minute za testiranje: ");

		long minuta = input.nextInt(); // unos minuta
		
		int dan = (int) minuta / (60 * 24) % 365; // formula za dobijanje dana 

		int godine = (int) minuta / (60 * 24 * 365) % 60; // formula za dobijanje godina
		                                                                   
		System.out.println(" Unesene minute" + minuta
				+ " kada se konvertuju u godine iznose: " + godine + " godine i "    // ispis u konzolu
				+ dan + " dana.");

	}
}
