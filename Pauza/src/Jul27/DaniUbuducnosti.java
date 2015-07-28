package Jul27;

import java.util.Scanner;

public class DaniUbuducnosti {
	public static void main(String[] args) {
		// trazimo od korisnika da unese dnasnji dan i broj u buducnosti da bi
		// izracunao koji ce tada biti dan
		Scanner s = new Scanner(System.in);
		int today, elapsedDays; // pravimo prostor u memoriji za upis od
								// korisnika
		int daysToAdd, dayToFind;

		System.out.print("Enter today's day:");
		today = s.nextInt(); // upisujemo danasji dan

		System.out.print("Enter the number of days elapsed since today:");
		elapsedDays = s.nextInt(); // upisujemo broj za dan u buducnosti

		daysToAdd = elapsedDays % 7; // dani koje cemo racunati dobijamo kada
										// unos za buduci broj dana podijelimo
										// bez ostatka sa 7 dana u sedmici
		dayToFind = today + daysToAdd; // dan u buducnosti dobijamo kada
										// danasnji dan saberemo sa brojem dana
										// koji smo dobili dijeljenjem

		if (today == 0) { // dane brojimo od 0 d0 6 tj svih 7 dana stavljamo u
							// uslov
			System.out.print("Today is Sunday");
		} else if (today == 1) {
			System.out.print("Today is Monday");
		} else if (today == 2) {
			System.out.print("Today is Tuesday");
		} else if (today == 3) {
			System.out.print("Today is Wednesday");
		} else if (today == 4) {
			System.out.print("To day is Thursday");
		} else if (today == 5) {
			System.out.print("Today is Friday");
		} else if (today == 6) {
			System.out.print("Today is Saturday");
		}

		if (dayToFind == 0) { // dan u buducnosti stavljamo u uslov isto od 0 do
								// 6
			System.out.print(" and the future day will be Sunday.");
		} else if (dayToFind == 1) {
			System.out.print(" and the future daywill be Monday.");
		} else if (dayToFind == 2) {
			System.out.print(" and the future day will be Tuesday.");
		} else if (dayToFind == 3) {
			System.out.print(" and the future day will be Wednesday.");
		} else if (dayToFind == 4) {
			System.out.print(" and the future daywill be Thursday.");
		} else if (dayToFind == 5) {
			System.out.print(" and the future day will be Friday.");
		} else if (dayToFind == 6) {
			System.out.print(" and the future day will be Saturday.");
		}
	}

}
