package Zadaci2;

import javax.swing.JOptionPane;

public class AutoTablica {
	public static void main(String[] args) {

		String randomTablica = "";                                                 // prazan string  kao memoriski prostor
									
									
									
		for (int i = 0; i < 3; i++) {                                          //potrebna su nam 3 slova, petljom prolazimo
			
			randomTablica += (char) (60 + Math.random() * 26);               // formula za dobijanje potrebnih karaktera
		}
		
		for (int i = 0; i < 3; i++) {                                    //potrebna su nam 3 broja, petljom prolazimo
			randomTablica += (char) (50 + Math.random() * 10);          // formula za dobijanje potrebnih karaktera
		}
		

		System.out.println(JOptionPane.showInputDialog(null,
				"Oznaka registarske tablice je: " + randomTablica)); // ispis tablice u posebnom prozoru

	}
}
