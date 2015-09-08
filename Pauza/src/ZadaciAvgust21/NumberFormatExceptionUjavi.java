package ZadaciAvgust21;

public class NumberFormatExceptionUjavi {
	
	public static boolean isBinary(String binary) {                      // metoda koja provjerava da li je string binaran
		
		for (int i = 0; i < binary.length(); i++) {                    // prolazimo kroz sve elemente citavom duzinom stringa
			if (binary.charAt(i) != '1' && binary.charAt(i) != '0') { // ukoliko string ne sadrzi o ili 1 metoda vraca false
				return false;
			}
		}
		return true;            // ukoliko je uslov ispunjen te je svaki karakter jednak brojevima 0 ili 1 vraca true 
	}
	public static int bin2Dec(String binary) {
		// pozivamo se na metodu za provjeru binarnog unosa
		if (!isBinary(binary)) {  throw new NumberFormatException(binary + " is not a binary!");    
		// ukoliko unos nije binaran program nastavlja sa radom jer baca exception i ispisuje poruku 	
		} else {
			int powNumber = 0;
			int numberDecimal = 0;
			for (int i = binary.length() - 1; i >= 0; i--) {   // prolazimo kroz sve elemente od zadnjeg ka prvom
				if (binary.charAt(i) == '1') {                // ukolio je broj binaran
					numberDecimal += Math.pow(2, powNumber); // pretvaramo taj broj u decimalni pomocu javine klase math.pow
				}
				powNumber++;                               // kroz svaku iteraciju petlje uvecavamo index stringa
			}
			return numberDecimal;                        // vracamo nadjeni decimalni broj
		}
	}
	public static void main(String[] args) {
		
		try {
			System.out.println("Entered String is decimal number "      // prosledjujemo  metodu koja pretvara binar u decimalan broj
					+ bin2Dec("111101") + ".\n");

			System.out.println(bin2Dec("2435"));     // prosledjujemo  metodu koja pretvara binar u decimalan broj i dodajemo joj vrijednost
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());     // ukoliko unos nije binaran ispisace se poruka upozorenja
		}
	}
}

