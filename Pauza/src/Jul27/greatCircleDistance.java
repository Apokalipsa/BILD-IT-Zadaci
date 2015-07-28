package Jul27;

import java.util.Scanner;

public class greatCircleDistance {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x1, y1, x2, y2;// mjesto za unos geografske duzine i sirine
		double distance;
		final double radius = 6371.01; // posto se ne mijenja stavljamo radius
										// kao finalnu varijablu

		System.out
				.print("Unesite podatke za tacku 1 (sirina and duzina) u stepenima:");
		x1 = input.nextDouble();
		y1 = input.nextDouble();

		System.out
				.print("Unesite podatke za tacku 1 (sirina and duzina) u stepenima:");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
// racunamo distancu zadatom formulom  d = radius * arccos (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)).
		distance = radius
				* Math.acos(Math.toRadians((Math.sin(Math.toRadians(x1))
						* Math.sin(Math.toRadians(x2)) + Math.cos(Math
						.toRadians(x1))
						* Math.cos(Math.toRadians(x2))
						* Math.cos(Math.toRadians(y2 - y1)))));

		System.out.print("Razmak izmedju ove dvije tacke je; " + distance
				+ " km.");
	}
}