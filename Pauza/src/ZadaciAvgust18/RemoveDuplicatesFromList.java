package ZadaciAvgust18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesFromList {
	
	public static void removeDuplicate(ArrayList<Integer> list) {
		
		ArrayList<Integer> result = new ArrayList<>();                 // kreiramo listu koja ce da vrati rezultat unikatnih brojeva
		
		HashSet<Integer> set = new HashSet<>();                      // pozivamo se na hashSet metodu u javi koja ce da doda izmjene u listu

		for (Integer elements : list) {                            // prolazimo petljom kroz sve elemente u listi

			if (!set.contains(elements)) {                       // ukoliko se elementi ne nalaze u set listi
				result.add(elements);                           // dodajemo te vrijednosti u rezultat listu
				set.add(elements);                             // iste vrijednosti dodajemo u set listu
			}
			
		}
		System.out.println(result);                        // vracamo listu rezultat koja printa samo unikatne brojeve
	}

	public static void main(String[] args) {
	
			Scanner input = new Scanner(System.in);
			System.out.println("Enter 10 integers:");                     // trazimo unos od korisnika da popuni listu

			ArrayList<Integer> list = new ArrayList<>();                // kreiramo listu integera

			for (int i = 0; i < 10; i++) {                    // prolazimo petljom kroz listu
											                         
				list.add( input.nextInt());                          // dodajemo unesene vrijednosti u listu
													   
			}
			 removeDuplicate(list);                               // pozivamo prethodno kreiranu metodu                    
		}
	}