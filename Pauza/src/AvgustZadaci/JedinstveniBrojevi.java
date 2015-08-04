package AvgustZadaci;

import java.util.Scanner;

public class JedinstveniBrojevi {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int counter = 0;                         // kreiramo promenljvu brojac kojom cemo brojiti duplikate
		int[] numbers = new int[10];            // kreiramo niz koji ce imati 10 vrijednosti

		for (int i = 0; i < 10; i++) {        //  za svih 10 brojeva kroz  ptelju tj za 10 iteracija
			System.out.println("Unesite Vase brojeve: \n" + "[" + (i + 1) // trazimo unos od korisnika 
					+ "]: ");
			numbers[i] = input.nextInt();    // popunjavamo taj niz  unosom od korisnika
		}

		System.out.println("Unijli ste brojeve: ");
		for (int i = 0; i < 10; i++) {               // prikazujemo unos svih korisnickih brojeva sa duplikatima ako ih ima
			System.out.print(numbers[i] + " ");
		}

		System.out.println("Uneseni brojevi bez duplikata su: "); // trazimo niz bez duplikata
		counter = numbers[0];                                    // postavljamo brojac na prvu tj nultu poziciju niza
		System.out.print(counter + " ");                        // brojac upisuje brojeve sa po jednim razmakom
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (numbers[i] == numbers[j] && j != i) {    // poredimo brojeve i kada je uslov ispunjen nadjeni broj dodajemo brojacu
					numbers[j] = counter;
				}
			} // sada kada brojac sadrzi duplikate poredmo ih sa ostalim brojevima i ako nije isti prinatmo te brojeve
			if (numbers[i] != counter) {  
				System.out.print(numbers[i] + " "); // ispisujemo rezultat u konzoli
			}
		}

	}

}
