package Jul27;

import java.util.Scanner;

public class SubstringStringa {
	public static boolean subString( String one,String two){                           // da li je string 2 substring stringa1
		if( one.contains(two)&&one.equals(two)){                                      // ukoliko 1 sadrzi 2 string i ukoliko su oni isti 
			System.out.println(" Your second string is a substring of the first " ); // vracamo true i printamo da j sunstring
			return true;
		}else{
			System.out.println(" Your second string is NOT a substring of the first " );
		}
		return false;
		
		
	}

	public static void main(String[] args) {
		// unos od korisnika za provjeru stringova
		Scanner input = new Scanner(System.in);  
		
		System.out.println(" Enter firs string?");
		String first = input.nextLine();
		
		System.out.println(" Enter second string?");
		String second = input.nextLine();
		
		System.out.println(subString(first, second)); // pozivanje na prethodno kreiranu metodu

	}

}
