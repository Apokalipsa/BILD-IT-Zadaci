package AvgustZadaci;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SortiranjeRedova2Dniza {

	public static double[][] sortRows(double[][] m) {     // metoda koja sortira redove u matrici 

		for (int i = 0; i < m.length; i++) {            // prolazimo petljom kroz sve unesene elemente u matrici
			Arrays.sort(m[i]);                         // pozivamo se na javinu klasu koja sortira nizove
		}
		return m;                                    //  vracanje sortiranog niza
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] array = new double[3][3];                                   // kreiramo memoriski prostor za 2D niz
		
		System.out.println(" Unesite " + array.length
				+ " elementa da popunite redove, te unesite " + array.length   // trazimo unos od korisnika
				+ " elementa da popunite kolone matrice ");
		
		for (int row = 0; row < array.length; row++) {
			for (int column = 0; column < array[row].length; column++) {       // popunjavamo matricu elementima od korisnika
				array[row][column] = input.nextDouble();
				System.out.print(array[row][column] + " ");
			}
			System.out.println();
		}
		System.out.println("The row-sorted array is");                         // pozivamo se na prethodni kreiranu metodu koja ce sortirati niz
		double[][] arr = sortRows(array);

		for (int row = 0; row < arr.length; row++) {
			for (int column = 0; column < arr[row].length; column++) {        // printamo sortiran niz pomocu petlje
				System.out.println(arr[row][column] + " ");
			}
			System.out.println();
		}
	}

}
