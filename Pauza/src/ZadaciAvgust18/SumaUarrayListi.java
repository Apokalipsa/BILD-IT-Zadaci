package ZadaciAvgust18;

import java.util.ArrayList;
import java.util.Scanner;

public class SumaUarrayListi {
	
	public static double sum(ArrayList<Double> list) {               // metoda koja vraca zbir svih elemenata u listi Double
       double sum=0;                                                // kreiramo memoriski prostor za zbir
       for (int i = 0; i < list.size(); i++) {                     // prolazimo petljom kroz sve elemente u listi
			sum += list.get(i);                                   // svaki elemenat kroz svaku iteraciju se dodaje sumi
		if (list.size() < 1) {                                   //  ukoliko nema nista u listi metoda vraca 0
			return 0;
		} 
		}
	return sum;                                                // ispisujemo sumu elemenata u listi
       }
	

	

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 integers:");                                        // trazimo unos od korisnika da popuni listu

		ArrayList<Double> list = new ArrayList<>();                                   // kreiramo listu integera

		for (int i = 0; i < 5; i++) {                                               // posto nam je poznat unos brojeva ulistu
										                                           // petljom oznacavamo 5 brojeva
			list.add( input.nextDouble());                                        // dodajemo unesene vrijednosti u listu
												   
		}
		System.out.println(" Sum of all elements from  the list is:" + sum(list));  // pozivamo prethodno kreiranu metodu                    
	}
}
