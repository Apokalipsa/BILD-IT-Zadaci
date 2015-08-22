package ZadaciAvgust20;

import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Scanner;

import ZadaciAvgust.TriangleKlasa;
import AvgustZadaci.MyPointKlasa;

public class KonveksniPoligon {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of points: ");         // trazimo unos tacaka od korisnika

		int points= input.nextInt();                      // smjestamo unos 

		double[][] array = new double[points][2];       // kreiramo 2d niz kojem proslijedjujemo broj redova od korisnika

		System.out.print("Enter coordinates: ");     // trazimo unos koordinata od korisnika
		for(int i = 0; i < points; i++){             // prolazimo petljom kroz niz u rangu unesene duzine redova
			array[i][0] = input.nextDouble();       // smjestamo koordinate na pozicije u niz
			array[i][1] = input.nextDouble();
		}
		int area=0;                               // kreiramo memoriski prostor za varijablu suma
		for (int i = 0; i < array.length - 1; i++) {  // sada prolazimo kroz citav 2d niz
			 area+=(int) ((array[i][0] * array[i + 1][1])-(array[i][1] * array[i + 1][0])); // sabiramo elemente niza po formuli
			/*area = ((x1y2 + x2y3 + x3y4 + ... + xny1) - (y1x2 + y2x3 + y3x4 + ... + ynx1) / 2 .*/
		}
		
		
		System.out.println("The area is : " + (area / 2));  // vracamo povrsinu  i ispisujemo je u konzoli
	}

}
