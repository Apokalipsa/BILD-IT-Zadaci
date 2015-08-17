package AvgustZadaci;

public class Time {
	private int hour;
	private int second; // kreiramo memoriski prostor za data filds koji cemo
						// kasnije obradjivati
	private int minute;

	Time() { // kreiramo prazan konstruktor

		long milisek = System.currentTimeMillis(); // formula trenutnog vremena
													// // preko javine klase

		long totalSec = milisek / 1000;

		this.second = (int) (totalSec % 60); // racunanje sekundi sekundi
												// tajpakstamo long u int

		long totalMin = totalSec / 60;

		this.minute = (int) (totalMin % 60); // racunanje minuta tajpakstamo
												// long u int

		long totalH = totalMin / 60;

		this.hour = (int) (totalH % 24); // racunanje sati

	}

	Time(long milisekunde) { // kreiramo konstruktor sa parametrom koji sdrzi //
								// milisekunde

		setTime(milisekunde); // pozivanje metode za racunanje proteklog vremena
								// te prosledjujemo parametar

	}

	Time(int hour, int minute, int second) { // konstrukrot za vrijeme koji
												// prima sate, minute, sekunde

		this.hour = hour;
		this.minute = minute;
		this.second = second;

	}

	public int getHour() { // geter mtoda za sat
		return hour;
	}

	public int getMinute() { // geter metoda za minute
		return minute;
	}

	public int getSecond() { // geter metoda za sekunde
		return second;
	}

	public void setTime(long elapseTime) { // metoda koja racuna vrijeme preko
											// setera

		long totalSec = elapseTime / 1000;

		this.second = (int) (totalSec % 60); // dobijanje sekundi

		long totalMin = totalSec / 60; // minuta

		this.minute = (int) (totalMin % 60); // dobijanje minuta

		long totalH = totalMin / 60; // sati

		this.hour = (int) (totalH % 24); // dobijanje sati

	}

	public static void main(String[] args) {
		Time objectOne = new Time();                    // kreiramo objekat Time

		Time objectTwo = new Time(555550000l);         //  kreiramo  drugi objekat 
												

		Time objectThree = new Time(11, 11, 11);      //  kreiramo treci objekat
													
		
		System.out.println("Time: " + objectOne.getHour() + ":"
				+ objectOne.getMinute() + ":" + objectOne.getSecond());

		System.out.println("Time: " + objectTwo.getHour() + ":"
				+ objectTwo.getMinute() + ":" + objectTwo.getSecond());

		System.out.println("Time: " + objectThree.getHour() + ":"
				+ objectThree.getMinute() + ":" + objectThree.getSecond());

	}

}
