package ZadaciAvgust18;

import java.util.ArrayList;
import java.util.Scanner;

public class Kombinacija2Liste {
	                              // metoda koja spaja 2 liste
	public static ArrayList<Integer> union(ArrayList<Integer> list1,	ArrayList<Integer> list2) { 
		
		for( Integer elements:list2){                      // for each petljom prolazimo kroz sve elemente 2 liste
			list1.add(elements);                          // dodajemo te elemente prvoj listi
		}
		return list1;                                   // vracamo prvu listu koja sada sadrzi sve elemente obe liste

		
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 integers for the first list:");

		ArrayList<Integer> list1 = new ArrayList<>();                  // kreiramo listu integera

		for (int i = 0; i < 5; i++) {                                 // posto nam je poznat unos brojeva ulistu
										      
			list1.add(input.nextInt());                             // dodajemo unesene vrijednosti u listu
		}

		System.out.println("Enter 5 integers for the second list:");

		ArrayList<Integer> list2 = new ArrayList<>();                 // kreiramo listu integera

		for (int i = 0; i < 5; i++) {                               // posto nam je poznat unos brojeva ulistu
										
			list2.add(input.nextInt());                           // dodajemo unesene vrijednosti u listu
		}
		 System.out.println("The combined list is: " +union(list1,list2));  // pozivamo se na prethodno kreiranu metodu za spajanje listi
	}

}
