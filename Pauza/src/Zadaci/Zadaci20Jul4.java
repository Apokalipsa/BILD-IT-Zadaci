package Zadaci;

public class Zadaci20Jul4 {
	public static void main(String[] args) {
		int brojac = 0;

		for (int i = 0; i <= 100; i++) {
			int brojevi = (int) (Math.random() * 10); // dobijamo brojeve od 0 do 9

			brojac++; // Uvecava vrijednost elementa sa indeksom nasumicnog
			// broja za 1

			System.out.println(" Od stotinu generisanih brojeva " + brojevi  + " se pojavio " + i + " puta.");
		}

	}
}
