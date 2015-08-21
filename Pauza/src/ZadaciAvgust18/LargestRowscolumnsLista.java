package ZadaciAvgust18;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LargestRowscolumnsLista { 
	
	public static int getRandomInt(int min, int max) {                     // metoda koja randomly bira brojeve
		Random rand = new Random();                                       // pozivamo se na random javinu klasu
		return rand.nextInt(max - min + 1) + min;                        // biramo brojeve koji su od 0 do 1 u javi 
	}

	public static ArrayList<Integer> getRows(int[][]row) {            // metoda koja pronalazi max broj u redovima 2D niza
		int max = 0;                                                 // kreiramo memoriski prostor u koji cemo smjestiti max broj
		int sum = 0;       
		
		ArrayList<Integer> list = new ArrayList<>();               // kreiramo listu u koju cemo smjestiti brojeve
		
		for (int i = 0; i < row.length; i++) {                   // prolazimo petljom kroz svu matricu
			for (int j = 0; j < row[i].length; j++) {
				sum += row[i][j];                              // sabiramo sve brojeve u redovima
			}
			
			if (sum > max) {                                 //  ukoliko je zbir veci od naseg privremenog max  nas max postaje taj broj
				max = sum;
				// in case we found row with larger value we clear the list and
				// start add new index
				list.clear();                             // ukoliko postoji red sa vecim brojem od naseg max brisemo taj broj
				list.add(i);                             // dodajemo  novu vrijednost u listu 
			} else if (sum == max) {                    // ukoliko je zbir isti kao i nas max broj
				list.add(i);                           //  samo taj novi dodajemo u listu
			}
		}
		
		return list;                               // vracamo pronadjen max broj u redu 
	}

	
	public static ArrayList<Integer> getColumns(int[][] column) {    // metoda koja pronalazi mab broj u kolonama
	                                                            	// Ponovimo isti postupak kao i sa redovima 
		int max = 0;  
		int sum = 0;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < column.length; i++) {
			for (int j = 0; j < column[i].length; j++) {
				sum += column[j][i];
			}
			
			if (sum > max) {
				max = sum;
			
				list.clear();
				list.add(i);
			} else if (sum == max) {
				list.add(i);
			}

		}
		
		return list;
	}

	public static void main(String[] args) {
		
		final int[][] randArray;                                  // kreiramo 2D niz koji cem da popunimo od korisnickog unosa
		Scanner scanner = new Scanner(System.in);
		  
		System.out.print("How many rows? :");                   // trazimo unos od korisnika za broj redova
		int rows = scanner.nextInt();
		
		System.out.print("How many columns? :");               // trazimo unos od korisnika za broj kolona
		int cols = scanner.nextInt();
		
		randArray = new int[rows][cols];                      // smjestamo taj unos u kreirani 2D niz kao njegovu duzinu
		
		for (int i = 0; i < randArray.length; i++) {         // petljom prolazimo kroz matricu da formiramo kolone i redove
			for (int j = 0; j < randArray[0].length; j++) {
				randArray[i][j] = getRandomInt(0, 1);       // pozivamo metodu sa random brojevima da popunimo matricu
				System.out.print(randArray[i][j] + " ");   // printamo  popunjenu matricu 
			}
			
			System.out.println();
			
		}
		System.out.println("The largest row in this array is: " + getRows(randArray));         // pozivamo metodu koja vraca max broj u redovima
	
		System.out.println("Largest column in this array is:  " + getColumns(randArray));  // pozivamo metodu koja vraca max broj u kolonama
	}

}
