package Zadaci;

import java.util.Scanner;

public class Zadaci21Jul2 {
	public static void BrojPitanja() {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite koliko hocete pitanja:");
		int pitanja = input.nextInt();
		int tacno = 0;
		int netacno = 0;
		int brojacTacnih = 0;
		int brojacNetacnih = 0;
		for (int i = 0; i < pitanja; i++) { // prolazimo kroz sva postavljena pitanja
			int broj1 = 5;
			int broj2 = 2;
			System.out.println(" Koliko je: " + broj1 + " - " + broj2 + " ? ");
			int korisnikovRez = input.nextInt(); 
			if (korisnikovRez == (broj1 + broj2)) { // postavljamo uslov pod kojim racunamo tacne i netacne odgovore
				brojacTacnih++;
			} else {
				brojacNetacnih++;
			}

		}
		System.out.println("Tacno ste odgovorili: " + brojacTacnih
				+ " a netacno: " + brojacNetacnih);

	}

	public static void main(String[] args) {

		BrojPitanja(); // pozivanje prethodno kreirane metode

	}

}
