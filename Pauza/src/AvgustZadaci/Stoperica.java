package AvgustZadaci;

public class Stoperica {

	private long startTime;    // upisujemo privatne potrebne podatke
	private long endTime;

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {               // pozivamo getere i setere za prethodno kreirane podatke
		this.startTime = startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	public Stoperica() {
		this.startTime = System.currentTimeMillis();          // kreiramo konstruktor koji ce vratiti trenutno vrijeme
	}

	public void start() {
		this.startTime = System.currentTimeMillis();         // kreiramo metodu koja pocinje da mjesri vrijeme
	}

	      
	public void stop() {                                    // kreiramo metodu koja ce zaustaviti prethodnu metodu mjerenja vremena
		this.endTime = System.currentTimeMillis();
	}

	
	public long getElapsedTime() {                         // kreiramo metodu koja racuna svo vrijeme od starta do kraja
		return (this.endTime - this.startTime) / 1000;
	}

}
 class TestMjerenjaVremena {                       // kreiramo klasu za testiranje prethodne klase

	public static void main(String[] args) {
		
	     //	 Write a test program that measures the execution time
		// of sorting 100,000 numbers using selection sort.
		
	
		int[] numbers = new int[100000];              // kreiramo  niz od deset hiljada brojeva   
		int min;                                     // kreiramo memoriski prostor za min broj
		int temp;                                   // kreiramo memoriski prostor za privremeni broj koji cemo koristiti 
	
		for(int i=0; i<numbers.length; i++) {       // prolazimo petljom kroz kreirani niz 
			numbers[i] = (int)(Math.random()*10);  // popunjavamo niz random brojevima koristeci javinu klasu 
		}
		Stoperica measures = new Stoperica();     // pozivamo objektnu instancu klase stoperica
		
		measures.start();                       // pozivamo se na metodu koja pocinje mjeriti vrijeme
		
		
		for(int i=0; i<numbers.length-1; i++){        // prolazimo petljom kroz niz svih unesenih elemenata
			min = i;                                 // postavljamo svoj min broj na pocetnu poziciju niza
			for(int j=i+1; j<numbers.length; j++){  // sada polazimo od prvog clana niza sa petljom i trazimo dalje min broj
				if(numbers[j] < numbers[min])      // ukoliko je sledeci broj manji od naseg min predajemo mu poziciju i on postaje min
				min = j;                          
			}
			if(min != i){                          // ukoliko svaki naredni nije manji od naseg min broja
				temp = numbers[i];                // privremena pozicija uzima taj broj
				numbers[i] = numbers[min];       // sada je taj privremeni jednak nasem min broju u nizu
				numbers[min] =numbers[temp];    //  dakle nas min je jednak privremenom broju
			}
		}
		
		measures.stop();         // pozivamo se na metodu koja zaustavlja mjerenje vremena
		                        // ispisujemo rezultat na ekranu u konzoli                  
		System.out.println("Niz od " + numbers.length + " clanova je sortiran za: " + measures.getElapsedTime() + " sekundi.");
		
	}
}
