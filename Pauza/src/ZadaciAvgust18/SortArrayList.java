package ZadaciAvgust18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayList {
	
	public static void sort(ArrayList<Integer> list) {           // metoda koja vraca sortiran liste integera
		Collections.sort(list);                                 // pozivamo se na javinu klasu za rad sa listama
		for( Integer elements:list){                           // for each petljom prolazimo kroz sve elemente u listi
			
			System.out.print( "[" + elements + "]");         // printamo sve sortirane elemente
		} 
		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 integers:");
		
		ArrayList<Integer> list = new ArrayList<>();       // kreiramo listu integera
		
		for (int i = 0; i < 5; i++) {                     // posto nam je poznat unos brojeva ulistu petljom oznacavamo 5 brojeva
			list.add(input.nextInt());                   // dodajemo unesene vrijednosti u listu
		}
		sort(list);                                     // pozivamo se na  prethodno kreiranu metodu za sortiranje
	}
}
