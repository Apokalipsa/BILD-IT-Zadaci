package AvgustZadaci;

import java.util.Scanner;

public class PointsIntersection {
	public static double[] getIntersectingPoint(double[][] points) {   // metoda za dobijanje presjeka tacaka
		double tacka = 0;                          // kreiramo memoriski prostor 
		double[] intersection = new double[2];    // kreiramo jednodimenzionalni niz koji ima 2 clana

		// tacku dobijamo po formuli = (x1-x2)*(y3-y4) - (y1-y2)*(x3-x4);
		tacka = (((points[0][0] - points[1][0])) * ((points[2][1] - points[3][1])) - ((points[0][1] - points[1][1]) * (points[2][0] - points[3][0])));
		if (tacka == 0)
			return null;

		// x = ((x3-x4)*(x1*y2-y1*x2)-(x1-x2)*(x3*y4-y3*x4))/tacka;
		double x = ((points[2][0] - points[3][0])
				* (points[0][0] * points[1][1] - points[0][1] * points[1][0]) - (points[0][0] - points[1][0])
				* (points[2][0] * points[3][1] - points[2][1] * points[3][0]));
				

		// y = ((y3-y4)*(x1*y2-y1*x2)-(y1-y2)*(x3*y4-y3*x4))/tacka;
		double y = ((points[2][1] - points[3][1])
				* (points[0][0] * points[1][1] - points[0][1] * points[1][0]) - (points[0][1] - points[1][1])
				* (points[2][0] * points[3][1] - points[2][1] * points[3][0]));
				

		intersection[0] = x;     // kreiranom nizu dodajemo dobijene tacke x i y
		intersection[1] = y;

		return intersection;    // vracamo taj niz
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite koordinate za 4 taèke ");
		System.out.println("x1, y1, x2, y2, x3, y3, x4, y4: ");     // trazimo unos od korisnika
		double[][] nizTacaka = new double[4][2];                   // kreiramo 2D niz u koji cemo sjestiti kordinate od korisnika
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				nizTacaka[i][j] = input.nextDouble();             // punimo matricu unosom od korisnika
			}
		}

		if (getIntersectingPoint(nizTacaka) == null) {           // provjeravamo paralelnost tacaka pozivajuci se na metodu i prosledjujuci joj argument
			System.out.println("Linije su paralelne");
		} else {
			double[] presjek = getIntersectingPoint(nizTacaka); // novi niz izjednacavamo sa metodom kojoj prosijedimo 2D niz kao argument
			System.out.println("Koordinate taèke presjeka: ");
			System.out.printf("%.2f, %.2f", presjek[0], presjek[1]);  // ispis rezultata u konzolu
		}

	}

}
