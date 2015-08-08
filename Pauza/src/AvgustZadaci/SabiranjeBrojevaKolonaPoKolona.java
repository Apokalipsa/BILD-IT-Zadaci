package AvgustZadaci;

import java.util.Scanner;

public class SabiranjeBrojevaKolonaPoKolona {
	public static void main(String[] args) {
		double[][] matrix = new double[3][4];   // kreiramo matricu sa 3 reda i 4 kolone

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite " + matrix.length + " redov i "  // trazimo od korisnika da unese elemente za te redove  i kolone
				+ matrix[0].length + " kolone:");
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {     // unosimo brojeve u matricu
				matrix[row][column] = input.nextDouble();
			}
		}
		// pozivamo prethodno kreiranu metodu te joj prosledjujemo duzinu matrice kao argument i broj 3 kao 4 kolone koje matrica ima
		System.out.println("Zbrir svih brojeva u svakoj koloni posebno iznosi " + sumColumn(matrix, 3)); 
		
	} 
	
	public static double sumColumn(double[][] matrix, int columnIndex) {  // metoda koja ce vratiti zbir brojeva u svakoj koloni posebno
		double total = 0;
		for (int column = 0; column <= columnIndex; column++) {  // prolazimo petljom kroz kolone svaku posebno
			total = 0;
			for (int row = 0; row < matrix.length; row++) {     // ovompetljom svaku iteraciju kroz duzinu niza sabiramo
				total += matrix[row][column];
			}
			System.out.println("Zbir u koloni " + column + " je " + total); // ispis u konzolu 
		}
		return total;        // vracanje zbira svih brojeva u kolonama svakoj posebn
	}
}