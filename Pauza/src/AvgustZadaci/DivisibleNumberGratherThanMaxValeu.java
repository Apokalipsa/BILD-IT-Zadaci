package AvgustZadaci;

import java.math.BigInteger;

public class DivisibleNumberGratherThanMaxValeu {
	public static void main(String[] args) {

		BigInteger numberMax = new BigInteger(Long.MAX_VALUE + ""); // kreiramo objektnu instancu javine klase BigInteger dodajemo joj max valeu
																	

		BigInteger divisibleByFive = new BigInteger("5");           //ponovo kreiramo objekat BigInteger i dodijelimo mu parametar 5
		BigInteger divisibleBySix = new BigInteger("6");           //ponovo kreiramo objekat BigInteger i dodijelimo mu parametar 6

		int counter = 0;                                          // kreiramo memoriski prostor za brojac

		System.out.println("The first 10 numbers greather then max valeu  divsor by 5 and 6 are :");
				

		while (counter < 10) {                                        // zelimo 10 brojeva pa je to uslov za rad petlje

		BigInteger five = numberMax.remainder(divisibleByFive);  // dijelimo sa 5
															
		BigInteger six = numberMax.remainder(divisibleBySix );  // dijelimo sa 6
															
		BigInteger nula = BigInteger.ZERO;                     // kreiranmo objekat koji ce vratiti nulu
												
		if (five.equals(nula) || six.equals(nula)) {
		counter++;                                          // za svaku iteraciju kroz petlju brojac se povecava za 1
		System.out.println(counter + ". " + numberMax);    // printamo brojeve
																
			}
		numberMax =numberMax.add(BigInteger.ONE);        // pozivamo se na metodu u javi koja vraca vrijednost  max broja uvecanu za 1
													
		}

	}
}
