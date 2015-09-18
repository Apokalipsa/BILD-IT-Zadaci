package ZadaciAvgust24;

import java.util.ArrayList;
import java.util.Collections;

public class ShufflesArrayListNumbers {

	public static void shuffle(ArrayList<Integer> NumberList) {      // kreiramo listu integera
		
		Collections.shuffle(NumberList);                            // pozivamo javinu metodu za mjesanje brojeva 
		                                    
		System.out.println("Shuffle integer list: " + NumberList); // ispisujemo rezultat
		
	}
	public static void main(String[] args) {
			
		ArrayList<Integer> list2 = new ArrayList<Integer>();          // kreiramo listu integer
			list2.add(3);                      
			list2.add(8);
			list2.add(92);
			list2.add(4);                                           // popunimo listu 
			list2.add(2);
			list2.add(17);
			list2.add(9);

			System.out.println("\n input list2 = " + list2);    // ispisemo ne obradjenu listu
			
			shuffle(list2);                                     // pozovemo prethodno kreiranu metodu i proslijedimo joj listu na obradu

		}

	

		
	}
	



