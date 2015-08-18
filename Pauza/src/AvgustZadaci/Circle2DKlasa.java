package AvgustZadaci;

public class Circle2DKlasa {
	private double x;
	private double y;        // kreiramo memoriski prostor za data fields
	private double radius;

	
	public double getX() {     // geter za koordinatu x
		return x;
	}

	public double getY() {     // geter za koordinatu y
		return y;
	}

	public double getRadius() {  // geter za precnik
		return radius;
	}

	
	Circle2DKlasa() {   // kreiramo prazan konstruktor
		x = 0;
		y = 0;
		radius = 1;
	}

	
	Circle2DKlasa(double x, double y, double radius) {  // kreiramo konstruktor sa potrebnim data field
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	
	public double getArea() {               // kreiramo metodu za povrsinu kruga
		return Math.pow(radius, 2) * Math.PI;
	}

	
	public double getPerimeter() {     // kreiramo metodu za obim kruga
		return 2 * (radius * Math.PI);
	}

	
	public boolean contains(double x, double y) {  // provjeravamo da li se tacke nalaze u krugu

		double suma = Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2);
		double dis = Math.sqrt(suma);

		if (Math.sqrt(radius) >= dis) { // po formuli ako je uslov ispunjen, vraca true
										
			
			return true;
		} else {                    // u suprotnom  vraca false
			
			return false;
		}
	}

	
	public boolean contains(Circle2DKlasa circle) {  // provjeravamo da li se krug nalazi u krugu postojeceg

		double suma = Math.pow(circle.x - this.x, 2)
				+ Math.pow(circle.y - this.y, 2);
		double dis = Math.sqrt(suma);
		double rad1 = Math.abs(Math.sqrt(radius) - Math.sqrt(circle.radius));

		if (rad1 >= dis) { 
			
			return true;
		} else { 
			
			return false;
		}
	}

	
	public boolean overlaps(Circle2DKlasa circle) {   // provjeravamo da li se krugovi sijeku

		double suma = Math.pow(circle.x - this.x, 2)
				+ Math.pow(circle.y - this.y, 2);
		double dis = Math.sqrt(suma);
		double rad1 = Math.abs(Math.sqrt(radius) - Math.sqrt(circle.radius));
		double rad2 = Math.abs(Math.sqrt(radius) + Math.sqrt(circle.radius));

		if (rad1 < dis && dis < rad2) { 
										
			
			return true;
		} else { 
			
			return false;
		}
	}

	public static void main(String[] args) {

		Circle2DKlasa c1 = new Circle2DKlasa(2, 2, 5.5);  // kreiramo  instancu nase klase
		
		System.out.println("\nThe area of the circle c1 is " + c1.getArea() // pozivamo se na metode da bi dobili povrsinu i obim kruga
				+ ", and the perimeter is " + c1.getPerimeter());
		
		System.out.println("Circle c1 contains point (3, 3): "   // pozivamo se na metodu koja provjerava da li krug u sebi sadzi tacku
				+ c1.contains(3, 3));
		
		System.out.println("Circle c1 contains new Circle2D: "   // pozivamo se na metodu koja provjerava da li krug sadrzi drugi krug
				+ c1.contains(new Circle2DKlasa(4, 5, 10.5)));
		
		System.out.println("Circle c1 overlaps new Circle2D: "   // pozivamo se na metodu za provjeru da li se krugovi sijeku
				+ c1.overlaps(new Circle2DKlasa(3, 5, 2.3)));
	}

}
