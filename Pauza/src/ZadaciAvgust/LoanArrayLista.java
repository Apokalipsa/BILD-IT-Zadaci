package ZadaciAvgust;

import java.sql.Date;
import java.util.ArrayList;

public class LoanArrayLista {
	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<Object>();                 // kreiramo listu objekata
		
		Loan object1 = new Loan(5.5);                                   //  kreiramo objekat kreirane klase Loan i proslijedimo mu argument                                   
		Circle object = new Circle(2);                                 //  kreiramo objekat kreirane klase circle i proslijedimo mu argument
		Date date = new Date(4);                                      //  kreiramo objekat za datum i proslijedimo mu argument                  
		String message = "Java je cool";  
		
		list.add(object1);                                         // prosledjujemo  objekate u kreiranu listu
		list.add(date);
		list.add(message);
		list.add(object);
		
		for (int i=0; i<list.size(); i++) {                      // prolazimo kroz sve elemente u listi
			list.get(i);
			
			System.out.println(list.get(i).toString() + "\n"); // prinatmo ih svaki u sledeci red
		}
	}	
	
}      
class Circle {                                        // kreiramo klasu circle sa poluprecnikom kao data field
	
	public double radius=1;
	
	
	Circle() {                                       //  kreiramo prazan konstruktor
		
	}
	
	Circle(double newRadius) {                     // kreiramo konstruktor sa parametrom poluprecnik
		radius = newRadius;
	}
	
	public double getRadius() {                  // kreiramo get metodu za  dobijanje polupecnika
		return radius;                          
	}
	public void setRadius(double newRadius) {   //  kreramo set metodu za poluprecnik kako bi mijenjali isti
		if (radius>=0) {                       // pod uslovom da je radius veci od 0
			radius = newRadius;
		}
    }
	
	public String toString(){                // kreiramo metodu koja ce vratiti poruku kao rezultat
		return getRadius() + " ";
	}
}

class Loan {                              /* kreiramo novu klasu loan postavimo getere i setere za data field*/
	                                     /* kreiramo konstruktore i to string metod za printanje rezultata*/
	public double loan;
	
	
	Loan() {
	}
	
	Loan(double loan) {
	  this.loan = loan;
    }
	
	public double getLoan() {
	   return loan;
	}
	public void setLoan(double loan) {
		this.loan = loan;
	}
	
	public String toString(){
		return getLoan() + " ";
	}
}
