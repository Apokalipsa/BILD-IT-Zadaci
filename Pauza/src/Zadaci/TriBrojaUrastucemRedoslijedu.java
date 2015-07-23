package Zadaci;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TriBrojaUrastucemRedoslijedu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter one  number: ");
		int num1 = input.nextInt();
		System.out.print("Enter second number: ");
		int num2 = input.nextInt();
		System.out.print("Enter threed number: ");
		int num3 = input.nextInt();
		printFactors(num1, num2, num3); // pozivamo metodu koju smo prethodno kreirali
	}

	public static void printFactors(int a, int b, int c) {
		int [] array={a,b,c};// kreiramo niz u koji cemo smjestiti trazene brojeve
		Arrays.sort(array); // pozivamo se na metodu sortiranja 
		System.out.println(Arrays.toString(array));  // ispisujemo sve elemente iz zadatog niza brojeva u rastucem redoslijedu
			
		
	}
}