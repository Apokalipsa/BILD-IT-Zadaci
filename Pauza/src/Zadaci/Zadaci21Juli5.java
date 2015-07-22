package Zadaci;

import java.util.Scanner;

public class Zadaci21Juli5 {
	public static void bacanjeNovcica(int bacanje) {
		int glava = 0;
		int pismo = 0;
		int brojac = 1;
		while (brojac <= bacanje) { // uslov sve dok je brojac manji od broja bacanja za nastavak programa
			int ishod = (int) (Math.random()*2);

			if (ishod == 0) {
				glava++;
			} else {
				pismo++;
			}
			brojac++;
		}

		System.out.println("Od ukupno" + bacanje
				+ " bacanja, novcic je pao na glavu " + glava + " a na pismo "
				+ pismo + " puta ");

	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Koliko puta zelite baciti novcic? ");
		int baci= input.nextInt();
		bacanjeNovcica(baci); // pozivanje metode koja simulira bacanje i prpsledjivanje joj argumenta sa konzole
	}
}
