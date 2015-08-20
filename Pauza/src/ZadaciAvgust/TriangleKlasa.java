package ZadaciAvgust;

import java.util.Scanner;

public class TriangleKlasa extends GeometricObject {   // pozivamo se na data fieldse iz geometricObject klase 
	double side1;
	double side2;                   // kreiramo data fields za trokut
	double side3;

	  TriangleKlasa(){            // kreiramo prazan konstruktor nase klase tj default 
		  
	  }
	  TriangleKlasa (double side1, double side2, double side3,String color,boolean filled){   // kreiramo konstruktor sa parametrima
		  this.side1=side1;
		  this.side2=side2;
		  this.side3=side3;
	  setColor(color);
	  setFilled(filled);
	  }
	public double getSide1() {
		return side1;
	}


	public double getSide2() {                               // kreiramo geter metode za sva tri data fieldsa
		return side2;
	}


	public double getSide3() {
		return side3;
	}

	 public double getPerimetar() {                        // kreiramo metodu koja vraca obim
		return side1 + side2 + side3;
	}
	 public  double getArea() {                           // kreiramo metodu za vracanje povrsine po formuli za povrsinu
			double p=getPerimetar()/2;
			double a = Math.sqrt(p*(p-side1)*(p-side2) * (p-side3));
			return a;
	 }
	 public String toString(){                           // kreiramo metodu koja vrca poruku u konzoli za ispis dobijenog rezultata
		 return" Triangle side1= " + side1 + " side2= " +side2+ " side3= " + side3;
	 }
	}  

class TestTriangle   { 
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		TriangleKlasa trio = new TriangleKlasa();   // kreiramo objekat klase
		
		System.out.println("enter 3 sides of your trieangle");     // trazimo unos od korisnika za 3 stranice
		trio.side1 = input.nextInt();
		trio.side2 = input.nextInt();                              // smjestamo unos 
		trio.side3 = input.nextInt();

		System.out.println("enter color of your triangle");        // trazimo unos boje od korisnika
		trio.setColor(input.nextLine());                          // preko setera pristupamo i smjestamo unos

		System.out
				.println("enter true or false sing to describe is your triangle filed or not?");    // trazimo punjenje
		trio.setFilled(input.nextBoolean());                     // preko setera smjestamo unos

		System.out.println(trio.toString() + " has area of: " + trio.getArea()          // preko metode toString vrsimo ispis u konzolu
				+ " his perimeter is: " + trio.getPerimetar() + " he also has "
				+ trio.getColor() + " color" + " and he is created "
				+ trio.getDate());

	}

}



	

