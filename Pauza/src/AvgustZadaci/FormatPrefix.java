package AvgustZadaci;

import java.util.Scanner;

public class FormatPrefix {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number: ");
                                                 // trazimo unos od korisnika te smijestamo taj unos u odgovarajuci memoriski prostor
		int number = input.nextInt();

		System.out.print("Enter the width: ");

		int width = input.nextInt();
		System.out.println(format(number, width));  // pozivamo prethodno kreiranu metodu kojoj prosledjujemo taj unos kao argumenat
	}

	public static String format(int number, int width) {              // metoda kojom cemo formatirati string
		
				String result = "";
				String argument= Integer.toString(number);          // pozivamo se na posebnu java metodu u javinoj klasi Integer te konvertujemo string
		        String x="0";
				for (int i=0; i<(argument.length()-width); i++) { // kroz petlju pravimo prostor formata od 0 pa sve do razlike medju duzinom i konvertovanim stringom
																																	
					result =result + x;  // na prethodno kreiran prazan prostor dodakemo  odgovarajuci znak tj 0 toliko koliko petlja zahtijeva
				}
				result=result + argument; // sada je nas rezultat jednak sa nulama i on  sadrzi prethodno konvertovan kod od Stringa u int
				return result; 
			}
}
