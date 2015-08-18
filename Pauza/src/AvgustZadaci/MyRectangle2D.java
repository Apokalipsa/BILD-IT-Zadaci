package AvgustZadaci;

import java.util.Scanner;

public class MyRectangle2D {
	
	private double x;
	private double y;             // kreiramo memoriski prostor za data fields
	private double width;
	private double height;

	
	public MyRectangle2D() {    // kreiramo prazan konstruktor
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.height = 1;
	}


	public MyRectangle2D(double x, double y, double width, double height) { // kreiramo konstruktor kojem prosledjujemo podatke
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	
	public double getX() {                 // geter za koordinatu x
		return x;
	}
 
	public void setX(double x) {           // seter za koordinatu x
		this.x = x;
	}

	public double getY() {                 // geter za koordinatu y
		return y; 
	}

	public void setY(double y) {           // seter za koordinatu y
		this.y = y; 
	}

	public double getWidth() {             // geter za sirinu
		return width;
	}

	public void setWidth(double width) {   // seter za sirinu
		this.width = width;
	}

	public double getHeight() {             // geter za visisnu
		return height;
	}

	public void setHeight(double height) {   // seter za visinu
		this.height = height;
	}

	                             
	public double getArea() {                       // racunamo povrsinu e pravougaonika
		double area = width * height;
		return area;
	}

	
	public double getPerimeter() {                   // racunamo obim pravougaonika
		double perimeter = 2 * (width + height);
		return perimeter;
	}

	
	public boolean contains(double x, double y) {    // provjeravamo da li pravougaonik sadrzi tacku
		
		if (x < (this.x + (this.width)) && x > (this.x - (this.width))
				&& y < (this.y + (this.height)) && y > (this.y - (this.height))) {
			return true;
		} else {
			return false;
		}
	}

	
	public boolean contains(MyRectangle2D r) {       // provjeravamo da li se pravougaonik "r",  nalazi unutar postojeceg pravougaonika
		
		if (contains(r.getX(), r.getY())) {         // provjeravamo postojanje sa javinom klasom koristeci geter metode
			return true;
		} else {
			return false;
		}
	}

	public boolean overlaps(MyRectangle2D r) {        // provjeravamo da li se pravougaonici preklapaju
		if ((this.x < r.getX() + r.getWidth())
				&& (this.x + this.width > r.getX())       // ukoliko je uslov po formuli preklaanja ispunjen metod vraca true
				&& (this.y < r.getY() + r.getHeight())
				&& (this.y + this.height > r.getY())) {
			return true;
		} else {
			return false;
		}
	}

	public static MyRectangle2D getRectangle(double[][] points) {
		double maxX = points[0][0];
		double minX = points[0][0];        // postavjamo min i max brojeve koordinata u pocetne pozicije naseg niza
		double maxY = points[0][1];
		double minY = points[0][1];
		for (int i = 1; i < points.length; i++) { // petljom prolazimo kroz sve tacke u nizy tj brojeve
			if (points[i][0] > maxX) {
				maxX = points[i][0];              // kada je uslov ispunjen max x dodjeljujemo vrijednost iz niza
			}
			if (points[i][0] < minX) {
				minX = points[i][0];              // kada je uslov ispunjen min x dodjeljujemo vrijednost iz niza
			}
			if (points[i][1] > maxY) {
				maxY = points[i][1];             // kada je uslov ispunjen max y dodjeljujemo vrijednost iz niza
			}
			if (points[i][1] < minY) {
				minY = points[i][1];             // kada je uslov ispunjen min y dodjeljujemo vrijednost iz niza
			}
		}
		return new MyRectangle2D((maxX + minX) / 2, (maxY + minY) / 2, maxX  - minX, maxY - minY);      // vracamo novi niz sa pronadjenim vrijednostima
				

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter five points: ");             // trazimo unos koordinata od korisnika
		double[][] points = new double[5][2];                 // kreiramo novi 2D niz
		for (int i = 0; i < points.length; i++) {            // petljom prolazimo kroz sve redove niza
			for (int j = 0; j < points[i].length; j++) {    //  takodje prolazimo kroz sve kolone niza
				                              
				points[i][j] = input.nextDouble();         // punimo 2D niz korisnickim unosom
			}
		}
		
		MyRectangle2D object1 = new MyRectangle2D();        // kreiramo objektnu instancu nase klase
		object1 = getRectangle(points);                    // pozivamo prethodno kreiranu metodu 
									
		
		System.out.println("The bounding rectangle's center (" + object1.getX() // pozivamo metode za ispis centra duzine i sirine pravougaonika
				+ ", " + object1 .getY() + "), width " + object1 .getWidth() + ", height "
				+ object1 .getHeight());
	}

}


