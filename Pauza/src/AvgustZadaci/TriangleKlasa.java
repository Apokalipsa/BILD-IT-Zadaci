package AvgustZadaci;

public class TriangleKlasa {
	class MyPoint {

		private double x = 0;                        // data fields za trougao klasu
		private double y = 0;

	
		public double getX() {
			return x;
		}

		public double getY() {
			return y;
		}

		
		MyPoint() {
			x = 0;
			y = 0;
		}

	
		MyPoint(double x, double y) {
			this.x = x;
			this.y = y;
		}

		
		public double distance(MyPoint p1) {             // metoda koja vraca distancu medju tackama
			double x = Math.pow(p1.x - this.x, 2);
			double y = Math.pow(p1.y - this.y, 2);
			double suma = x + y;
			return Math.sqrt(suma); 
									
		}
	}

	private MyPoint p1;
	private MyPoint p2;                              // data fields za point klasu
	private MyPoint p3;

	
	public MyPoint getP1() {
		return p1;
	}

	public MyPoint getP2() {
		return p2;
	}

	public MyPoint getP3() {
		return p3;                               // geteri i seteri point klase
	}

	public void setP1(MyPoint p1) {
		this.p1 = p1;
	}

	public void setP2(MyPoint p2) {
		this.p2 = p2;
	}

	public void setP3(MyPoint p3) {
		this.p3 = p3;
	}

	
	TriangleKlasa() {               //  kreiramo prazan ili defolt konstruktor nase glavne klase 
		p1 = new MyPoint(0, 0);
		p2 = new MyPoint(1, 1);
		p3 = new MyPoint(2, 5);
	}

	
	TriangleKlasa(double x1, double y1, double x2, double y2, double x3, // kreiramo konstruktor sa podacima za obradu
			double y3) {
		p1 = new MyPoint(x1, y1);
		p2 = new MyPoint(x2, y2);
		p3 = new MyPoint(x3, y3);
	}

	
	TriangleKlasa(MyPoint p1, MyPoint p2, MyPoint p3) { // kreiramo konstruktor koji prima objekte nase druge point klase
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	
	public double getArea() {              // racunamo povrsinu trokuta

		double str1 = p1.distance(p2);   // pozivamo se na  metodu za izracunavanje distance
										
		double str2 = p2.distance(p3);
		double str3 = p3.distance(p1);

		double s = (str1 + str2 + str3) / 2;     // racunanje poluobima
												// racunanje povrsine trougla
		double povrsina = Math.sqrt(s * (s - str1) * (s - str2) * (s - str3));

		System.out.println("Povrsina je: " + povrsina);
		return povrsina; 
	}

	
	public double getPerimeter() {         // racunamo obim trougla

		double str1 = p1.distance(p2);    // pozivamo se na metodu koja vraca duzine 3 stranice trougla
										 
		double str2 = p2.distance(p3);
		double str3 = p3.distance(p1);

		double obim = str1 + str2 + str3; 

		System.out.println("Obim je: " + obim);
		return obim; 
	}

	
	public boolean contains(MyPoint p) { // provjeravamo da li se tacke nalaze u trouglu

		double str1, str2, str3;
		double s;
		double a1, a2, a3;

		
		str1 = p1.distance(p);               // nalazimo povrsinu trougla po unesenim tackama
		str2 = p1.distance(p2);
		str3 = p2.distance(p);
		s = (str1 + str2 + str3) / 2;
		a1 = Math.sqrt(s * (s - str1) * (s - str2) * (s - str3));  // nalazimo povrsinu prvog trougla
																	

		str1 = p2.distance(p);
		str2 = p2.distance(p3);
		str3 = p3.distance(p);
		s = (str1 + str2 + str3) / 2;
		a2 = Math.sqrt(s * (s - str1) * (s - str2) * (s - str3));    //  nalazimo povrsinu drugog trougla
																	

		str1 = p1.distance(p);
		str2 = p1.distance(p3);
		str3 = p3.distance(p);
		s = (str1 + str2 + str3) / 2;
		a3 = Math.sqrt(s * (s - str1) * (s - str2) * (s - str3));   //  nalazimo povrsinu treceg trougla
																	

		str1 = p1.distance(p2);
		str2 = p2.distance(p3);
		str3 = p3.distance(p1);
		s = (str1 + str2 + str3) / 2;
		double povrsina = Math.sqrt(s * (s - str1) * (s - str2) * (s - str3));  //  nalazimo povrsinu trazenog glavnog trougla
															
		if ((a1 + a2 + a3) <= povrsina) {
			return true;
		} else {
			return false;
		}
	}

	public boolean contains(TriangleKlasa t) {    // provjeravamo da li se sve tacke nalaze u odgovarajucem trouglu
		
		return (contains(t.getP1()) && contains(t.getP2()) && contains(t
				.getP3()));
	}

	
	public boolean overlaps(TriangleKlasa t) {          // provjeravamo da li se trouglovi sijeku
		return contains(t.getP1()) || contains(t.getP2())
				|| contains(t.getP3());
	}

	/*public static void main(String[] args) {
		
		//TriangleKlasa t1 = new TriangleKlasa(new MyPoint(2.5, 2), new MyPoint(  // kreiramo objektnu instancu nase klase 
				4.2, 3), new MyPoint(5, 3.5));
		
		MyPoint p = new MyPoint(3, 3);                                          //  kreiramo objektnu instancu i point klase
		
		System.out.println("The area of the triangle: " + t1.getArea());
		System.out.println("The perimeter of the triangle: "
				+ t1.getPerimeter());
		System.out.println("This triangle contains the new point (3,3): "
				+ t1.contains(p));                                                 // pozivamo se na prethodno kreirane metode za provjeru 
		System.out.println("This triangle contains another triangle: "
				+ t1.contains(new TriangleKlasa(new MyPoint(2.9, 2),
						new MyPoint(4.0, 1), new MyPoint(1, 3.4))));
		System.out.println("This triangle overlaps another triangle: "
				+ t1.overlaps(new TriangleKlasa(new MyPoint(2, 5.5),
						new MyPoint(4, -3), new MyPoint(2, 6.5))));*/
	}

