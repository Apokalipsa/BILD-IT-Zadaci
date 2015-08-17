package AvgustZadaci;

import java.util.Scanner;

public class PovrsinaTrokuta {
	public static double getArea(double[][] points) {    // metoda koja ce vratiti povrsinu trokuta
		double side1 = 0;
		double side2 = 0;                               // kreiramo memoriski prostor za stranice
		double side3 = 0;

		side1 =(Math.pow(Math.pow(points[1][0] - points[0][0], side1), 2) + Math.pow((points[1][1] - points[0][1]), 2));
        side2 = (Math.pow(Math.pow(points[2][0] - points[1][0], side2), 2) + Math.pow((points[2][1] - points[1][1]), 2)); // odredjujemo stranice
        side3 = (Math.pow(Math.pow(points[0][0] - points[2][0], side3), 2) + Math.pow((points[0][1] - points[2][1]), 2));

		double result = (side1 + side2 + side3) / 2;      // u odgovarajuci prostor sabiramo sve stranice i dijelimo sa 2

		double area = Math.sqrt(result * (result - side1) * (result - side2)
				* (result - side3)) ;                                            // formulom za povrsinu trokuta dobijamo povrsinu

		System.out.println("area of triangle is: " + area);
		return area;                                                           // vracamo povrsinu kao rezultat metode
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		double[][] point = new double[3][2];                              // inicijaliyiramo 2 D niz 3*2

		System.out.println("Enter  three points of a triangle:");        // trazimo od korisnika da unese potrebne podatke
		
		for (int i = 0; i < 3; i++) {                                   //  pomocu petlje smjestamo unos od korisnika
			for (int j = 0; j < 2; j++) {
				point[i][j] = in.nextDouble();                        // na odredjene pozicije u nizu
			}
		}
		System.out.println(getArea(point));                        // pozivamo prethodno kreiranu metodu za racunanje povrsine
                                                                  // prosledjujemo joj korisnicki unos kao argument
	}
}
