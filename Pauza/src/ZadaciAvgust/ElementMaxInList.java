package ZadaciAvgust;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ElementMaxInList {
	
	public static Integer max(ArrayList<Integer> list) {          // metoda koja pronalazi najveci broj u listi Integer
		if (list.isEmpty() || list.equals(0)) {                   // ako je lista prazna program vraca null ili ako je
			return null;
		} else {
			
			return (Collections.max(list));                      // pozivamo se na javinu metodu za rad sa listama

		}

	}
	
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			System.out.println(" Enter 5 numbers input ends with 0 ?! ");    // trazimo unos od korisnika
		
			ArrayList<Integer> list = new ArrayList<>();                    // kreiramo Integer listu
			for (int i = 0; i < 5; i++) {                                  // prodjemo kroz sve brojeve
				list.add(input.nextInt());                                // smjestamo te brojeve i pristupamo im preko add metoda
						
				}
				System.out.println(max(list) +" is maximum number in zour list of entered numbers: ");     // ispisujemo rezultat
			}

		

		}
	

