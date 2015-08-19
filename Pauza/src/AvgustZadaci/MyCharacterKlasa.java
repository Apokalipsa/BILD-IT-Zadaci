package AvgustZadaci;

public class MyCharacterKlasa {
	public static void main(String[] args) {
		
		MyCharacterKlasa caracter = new MyCharacterKlasa('R'); // kreiramo  instancu  klase 
		
				// nad objektom pozivamo metode iz klase i ispisujemo rezultate
				System.out.println("Chacking characters:");
				System.out.println("---------------------");
				System.out.println("GetChar ? " + caracter.getChar());
				System.out.println("IsLetter ? " + MyCharacterKlasa.isLetter('R'));
				System.out.println("IsLowerCase ? " + MyCharacterKlasa.isLowerCase('O'));
				System.out.println("IsUpperCase ?" + MyCharacterKlasa.isUpperCase('a'));
				System.out.println("Equals ? " + caracter.equals(new MyCharacterKlasa('R')));
				System.out.println("IsDigit ? " + MyCharacterKlasa.isDigit('s'));
				
			}
		
	private static char caracter;

	 public MyCharacterKlasa(){                        //  kreiramo default konstruktor
	
	 }
	
	public MyCharacterKlasa(char caracter) {           // kreiramo konstruktor koji prima karakter
		MyCharacterKlasa.setCaracter(caracter);
	}

	public static boolean isDigit(char caracter) {      // metoda koja provjerava da li je karakter  broj  
		return caracter >= '0' && caracter<= '9';
	}

	public static boolean isLetter(char caracter) {      // metoda koja provjerava da li je karakter  slovo
		return (caracter>= 'a' && caracter <= 'z') || (caracter >= 'A' && caracter <= 'Z');
	}

	public static boolean isLowerCase(char caracter) {  // metoda koja provjerava  mala slova

		return (caracter >= 'a' && caracter <= 'z');
	}
	
	public static boolean isUpperCase(char caracter) {    // metoda koja provjerava  velika slova
		return (caracter >= 'A' && caracter <= 'Z');
	}

	public char getChar() {                               // ger metoda za karakter
		return getCaracter();
	}

	public boolean equals(MyCharacterKlasa caracter) {    // metoda koja provjerava jednakost karaktera
		return MyCharacterKlasa.getCaracter() ==caracter.getChar();
	}

	public static char getCaracter() {
		return caracter;
	}

	public static void setCaracter(char caracter) {
		MyCharacterKlasa.caracter = caracter;
	}
	}