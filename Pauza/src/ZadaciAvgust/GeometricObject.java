package ZadaciAvgust;

public class GeometricObject {
	private String color = "white";             // data fields za geometrijske objekte koje ce se koristiti u zadacima
	private java.util.Date datacreated;
	private boolean filled;

	public GeometricObject() {                     //  prazan konstruktor tj default
		datacreated = new java.util.Date();       //  metoda iz jave za  datum

	}

	public GeometricObject(String color, boolean filled) {    // konstruktor sa parametrima
		this.color = color;
		this.filled = filled;
	}

	public boolean isFilled() {                            // metoda koja provjerava punjenje 
		return filled;
	}

	public void setFilled(boolean filled) {               // seter metoda ili mutator koja omogucava pristup podacima
		this.filled = filled;
	}

	public String getColor() {                           // geter ili acesor metod za data fieldse
		return color;
	}

	public java.util.Date getDate() {
		return datacreated;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {                                       // metoda koja vraca poruku ispisa trazenog  rezultata
		return "created on " + datacreated + "\ncolor: " + color
				+ " and filled: " + filled;

	}
}
