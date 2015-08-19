package AvgustZadaci;

public class MyString2Klasa {
	// data fields
	String s;

	public MyString2Klasa()     {                  // default  konstruktor
		
	}
	
	public MyString2Klasa(String s) {             // kreiramo konstruktor sa stringom kao parametar
		this.s = s;
	}

	public int compare(String s) {                // metoda poredjenje stringova
		int result = 0;
		if (this.s.length() < s.length()) {
			result = -1;
		} else if (s.length() < this.s.length()) {
			result = 1;
		} else {
			for (int i = 0; i < this.s.length(); i++) {
				if (this.s.charAt(i) < s.charAt(i)) {
					result = -1;
				}
				if (this.s.charAt(i) > s.charAt(i)) {
					result = 1;
				}
			}
		}
		return result;
	}

	public MyString2Klasa substring(int start) {             // metoda koja vraca pocetni karakter substringa
		String result = " ";
		for (int i = start, j = 0; i < s.length(); i++, j++) {
			result += this.s.charAt(i);
		}
		return new MyString2Klasa(result);
	}

	
	public MyString2Klasa toUpperCase() {                     // metoda koja vraca velika slova objektu
		String upperCase = "";
		for (int i = 0; i < this.s.length(); i++) {
			upperCase += this.s.toUpperCase().charAt(i);
		}
		return new MyString2Klasa(upperCase);
	}

	
	public char[] toChars() {                                   // metoda koja vraca string kao niz karaktera
		char[] chars = new char[this.s.length()];
		for (int i = 0; i < chars.length; i++) {
			chars[i] = this.s.charAt(i);
		}
		return chars;
	}

	
	public static MyString2Klasa valueOf(boolean b) {          // metoda  koja vraca  vrijednost  objekta
		if (b == true) {
			return new MyString2Klasa("true");
		} else {
			return new MyString2Klasa("false");
		}
	}

	public String toString() {
		return this.s;
	}
	public static void main(String[] args) {
		
		MyString2Klasa object1 = new MyString2Klasa("Java Je Cool");   // kreiramo dva objekta nase klase
		MyString2Klasa object2 = new MyString2Klasa("Java Je Teska");
		
		System.out.println(" Check String Methods:");
		System.out.println("***********************");
		System.out.println(" Substring Methods : " + object1.substring(3));
		System.out.println(" ToUpperCase Methods  : " + object2.toUpperCase());
        System.out.println(" ValueOf Methods  : " + MyString2Klasa.valueOf(true));           // pozivamo se na sve metode koje smo kreirali
		System.out.println(" Compare strings " + object1.compare("Naucit Cu Javu"));
		System.out.println(" Compare Methods : " + object1.compare(" Java Je Cool "));
		

	}

}
