package AvgustZadaci;

public class MyStringKlasa {
	public static void main(String[] args)  throws Exception{
		// kreiramo dva niza karaktera
		
			char[] ch1 = { 'J', 'a', 'v', 'a', 'J', 'e', 'C', 'o', 'o', 'l' };
			char[] ch2 = { '5', '4', '3', '2', '1', '0', '9', '8', '7', '6' };
			// kao i dvije instance MyString1 klase koje cemo testirati
			MyStringKlasa object1 = new MyStringKlasa(ch1);
			MyStringKlasa object2 = new MyStringKlasa(ch2);
			// nad kreiranim objektima pozivamo metode iz MyString1 klase i
			// ispisujemo rezultate
			
			System.out.println(" Cheking Strings:");
			System.out.println("*******************");
			System.out.println(" CharAt Method on object1.charAt(4) is:"
					+ object1.charAt(4));
			System.out.println(" Length Method on object1.length() is: "
					+ object1.length());
			System.out
					.println(" Substring Method on object1.substring(1, 3) is: "
							+ object1.substring(1, 3));
			System.out
					.println(" ToLowerCase Method on object1.toLowerCase() is: "
							+ object1.toLowerCase());
			System.out
					.println(" Check does two String are equals with Method Equals object1.equals(object2) is "
							+ object1.equals(object2));
			System.out
					.println(" Check valeu Method with Value of object1.valueOf(12345) is "
							+ MyStringKlasa.valueOf(12345));
		
	

		}

	

	public char[] chars;

	public MyStringKlasa(){                               // default konstruktor
		
	}
	public MyStringKlasa(char[] chars) {               // kreiramo konstruktor sa parametrom  niza karaktera
		this.chars = new char[chars.length];
		for (int i = 0; i < chars.length; i++) {     // prolazimo petljom kroz sve karaktere u nizu
			this.chars[i] = chars[i];
		}
	}

	public char charAt(int index) {            // pronalazak indexa na kojem se karakter nalazi

		return this.chars[index];
	}

	public int length() {                    // duzina niza
		return this.chars.length;
	}

	public MyStringKlasa substring(int start, int end) {  //pocetni karaket substringa i krajnji
		char[] result = new char[end - start];
		for (int i = start; i < end; i++) {
			result[i - start] = this.chars[i];

		}
		return new MyStringKlasa(result);
	}

	public MyStringKlasa toLowerCase() {                    // pronalazak malih slova u stringu
		char[] lowerCase = new char[this.chars.length];
		for (int i = 0; i < this.chars.length; i++) {
			lowerCase[i] = Character.toLowerCase(this.chars[i]);
		}
		return new MyStringKlasa(lowerCase);
	}

	public boolean equals(MyStringKlasa string) {            // metod koji provjerava jednakost dva stringa
		if (string.length() != this.chars.length) {
			return false;
		} else {
			for (int i = 0; i < string.length(); i++) {
				if (string.charAt(i) != this.chars[i]) {
					return false;
				}
			}
			return true;
		}
	}

	public static MyStringKlasa valueOf(int i) {   // metoda koja spaja vrijednosti stringova
		int length = 0;
		int numb = i;
		while (numb > 0) {
			numb /= 10;
			length++;
		}
		char[] valeu = new char[length];
		for (int j = valeu.length - 1; j >= 0; j--) {
			valeu[j] = (char) ('0' + (i % 10));
			i /= 10;
		}
		return new MyStringKlasa(valeu);
	}

	@Override
	public String toString() {                        //ispis svih vrijednosti stringa
		String result = " ";
		for (int i = 0; i < this.chars.length; i++) {
			result += this.chars[i];
		}
		return result;
	}
}
