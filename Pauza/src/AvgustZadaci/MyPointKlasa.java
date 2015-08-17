package AvgustZadaci;

import java.util.Scanner;

public class MyPointKlasa {
	
	private double x = 0;                   // pravimo memoriski prostor za data filds koje cemo obradjivati
	private double y = 0;

	
	public double getX() {                 // kreiramo geter za dobijanje x tacke
		return x;
	}

	public double getY() {                 // kreiramo geter za dobijanje y tacke
		return y;
	}

	
	MyPointKlasa() {                        // kreiramo prazan konstruktor nase klase
		x = 0;
		y = 0;
	}

	
	MyPointKlasa(double x, double y) {       // kreiramo konstruktor koji prima tacku x i y
		this.x = x;
		this.y = y;
	}

	
	public double distance(MyPointKlasa p1) {           // metoda koja racuna distancu medju koordinatama
		
		double x = Math.pow(p1.x - this.x, 2);        // formula za dobijanje tacke x pomocu javine klase pow
		double y = Math.pow(p1.y - this.y, 2);       // formula za dobijanje tacke y pomocu javine klase pow
		
		double suma = x + y;                        // sabiramo tacke od cijeg cemo zbira traziti kvadratni korijen
		return Math.sqrt(suma);                    // koristeci se javinom math klasom vracamo rezultat za dostancu tacaka 
							
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Unesite dvije koordinate: ");         // trazimo unos od korisnika

		double x = input.nextDouble();
		double y = input.nextDouble();                          // smjestamo unos od korisnika

		MyPointKlasa object1 = new MyPointKlasa();             // kreiramo prazan objekat
												

		MyPointKlasa object2 = new MyPointKlasa(x, y);        // kreiramo objekat koji prima unijete tacke
															

		System.out.print("Distanca medju koordinatama je: "
				+ object1.distance(object2));                 // pozivamo se na prethodno kreiranu metodu kojoj proslijedjujemo  objekat kao argument

		
	}

}
