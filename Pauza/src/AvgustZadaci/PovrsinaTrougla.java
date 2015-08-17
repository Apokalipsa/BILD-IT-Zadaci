package AvgustZadaci;

import java.util.Scanner;

public class PovrsinaTrougla {
	public static double getTriangleArea(double[][] points) {

		double a; 
		double b;                            //potrebne su nam 3 stranice trokuta
		double c;
		                                                            
		a = Math.sqrt(Math.pow((points[1][0] - points[0][0]), 2)          // formula za dobojanje duzine prve stranice
				+ Math.pow((points[1][1] - points[0][1]), 2));
		
		b = Math.sqrt(Math.pow((points[2][0] - points[1][0]), 2)
				+ Math.pow((points[2][1] - points[1][1]), 2));          // formula za dobojanje duzine druge stranice
		
		c = Math.sqrt(Math.pow((points[2][0] - points[0][0]), 2)
				+ Math.pow((points[2][1] - points[0][1]), 2));        // formula za dobojanje duzine trece stranice

		
		double s = (a + b + c) / 2;
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));    // formula za povrsinu trougla
		return area;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite koordinate za 3 taèke:");
		System.out.println("x1 , y1, x2, y2, x3, y3: ");
		
		double[][] tacke = new double[3][2];                           // pravimo 2D niz 3*2
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {                            // petljom prolazimo kroz niz i punimo ga kordinatama od korisnika
				tacke[i][j] = input.nextDouble();
			}
		}

		System.out.printf("Površina trougla: %.1f ", getTriangleArea(tacke));    // pozivanje na trethodn kreiranu metodu za racunanje povrsine

	}

}
