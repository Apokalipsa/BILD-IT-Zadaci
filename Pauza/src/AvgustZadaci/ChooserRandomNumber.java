package AvgustZadaci;

public class ChooserRandomNumber {
	public static void getRandom(int... numbers) {                       // metoda za dobijanje random broja
		 
        int randomNumber = 1 + (int)(Math.random() * 54);              //trazenje random broja od 1 do 54
      
        for (int i = 0; i < numbers.length; i++) {     // prolazak petljom kroz sve unesene brojeve radi provjere koji su brojevi prikazani
           
            System.out.print(numbers[i] + " ");      //ispis svih brojevabrojeva
           
            while (numbers[i] == randomNumber) {    // ukoliko se poklope brojevi koji su unijeti sa radnom brojem trazimo sledeci koji nije isti
                randomNumber = 1 + (int)(Math.random() * 54);   
            }
            
        }
           
         System.out.println("\n Random broj je:" + randomNumber);     // ipsis dobijenog radnom broja
    }
	public static void main(String[] args) {
		
		getRandom(10, 20, 12, 40, 1, 0, 23, 53);    // poziv prethodno kreiranu metodu za random broj i prosledjujemo joj broejve kao argumente
}
}



