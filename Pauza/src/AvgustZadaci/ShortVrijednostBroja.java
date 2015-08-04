package AvgustZadaci;

import java.util.Scanner;

public class ShortVrijednostBroja {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		                                                                   // trazimo unos od  korisnika
		System.out.println("  Unesite jedan cijeli broj: "); 
																
		short unos = input.nextShort();                                 // smjestamo unos u odgovarajuci memoriski prostor
		
		String konvertor =Integer.toBinaryString(unos);               //konvertujemo unos u binarni kod preko javine clase Integer.toBinaryString
		System.out.println(format(Integer.valueOf(konvertor ), 16)); // pozivamo kreiranu metode te joj prosledjujemo konvertovani cod sa 16 mjesta
		 
		
		
	}
	public static String format(int number, int width) {      // metoda kojom cemo formatirati string
		String result = "";
		String argument= Integer.toString(number);          // pozivamo se na posebnu java metodu u javinoj klasi Integer te konvertujemo string
        String x="0";
		for (int i = 0; i < (width - argument.length()); i++) { // kroz petlju pravimo prostor formata od 0 pa sve do razlike medju duzinom i konvertovanim stringom
																															
			result =result + x;                                   // na prethodno kreiran prazan prostor dodakemo  odgovarajuci znak tj 0
		}
		result=result + argument; // sada je nas rezultat jednak sa nulama i on  sadrzi prethodno konvertovan kod od Stringa u int
		return result; 
	}

}

 
	   
	  
	