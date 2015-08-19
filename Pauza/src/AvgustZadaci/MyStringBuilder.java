package AvgustZadaci;

public class MyStringBuilder {

	public String string;

	public MyStringBuilder() { // kreiran default konstruktor

	}

	MyStringBuilder(String s) { // kreiran konstruktor sa parametrom
		this.string = s;
	}

	public MyStringBuilder append(MyStringBuilder s) {  // metoda koja spaja stingove
														

		String result = this.string + s.string;

		return new MyStringBuilder(result);
	}

	public MyStringBuilder append(int i) {             // metoda koja dodaje broj

		String result = this.string + i;

		return new MyStringBuilder(result);
	}

	public int length() {                                  // duzina stringa

		return this.string.length();
	}

	public char charAt(int index) {                        // metoda za pronalazak indexa i karaktera koji se na njemu nalazi
									        

		return this.string.charAt(index);
	}

	public MyStringBuilder toLowerCase() {                  // metoda koja vraca mala slova stringa
										

		String result = " ";

		for (int i = 0; i < this.string.length(); i++) {
			result += Character.toUpperCase(this.string.charAt(i));
		}
		return new MyStringBuilder(result);
	}

	public MyStringBuilder substring(int start, int end) {       // pocetni karaket substringa i krajnji karakter
															

		String result = "";

		for (int i = start; i <= end; i++) {
			result += this.string.charAt(i);
		}
		return new MyStringBuilder(result);
	}

	public String toString() {                                     // ispis

		return this.string;

	}

	public static void main(String[] args) {
		
		MyStringBuilder object1 = new MyStringBuilder(" Java Je Cool ");  // kreiramo objekat nase klase
		MyStringBuilder object2 = new MyStringBuilder("19.08.'15.");      //  kreiramo jos jedan objekat klase
		
		
		System.out.println(" Check Builder String Methods :");
		System.out.println("*****************************");
		System.out.println(" Append (MyStringBuilder1 string) is: " + object1.append(object2));  // testiramo sve prethodno kreirane metode
		System.out.println(" Append(int i) is: " + object2.append(2015));
		System.out.println(" ToLowerCase()is: " + object1.toLowerCase());
		System.out.println(" Length() is: " + object1.length());
		System.out.println(" CharAt(int index) is: " + object1.charAt(5));
		System.out.println(" Substring(int begin, int end) is: "+ object1.substring(1, 4));
				
	}
}
