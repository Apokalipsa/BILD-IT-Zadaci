package AvgustZadaci;

public class MjeseciOdRandomBroja {

	public static void main(String[] args) {
	// Prikazujemo ime mjeseca kada se dobije radnom broj od 1 do 12
		
		String[] mjeseci = {"Januar", "Februar", "Mart", "April", "Maj", "Jun", "Jul", "Avgust", "Septembar", "Oktobar", "Novembar", "Decembar"};
		
			int randomBroj = (int)(Math.random() * 12);  // formula za dobijanje radnom broja
			
			
			System.out.println(mjeseci[randomBroj]);    // ispis  rezulutata u konzolu

	
	}

}
