
public class ComputeWeeklyHoursForEachEmploye {
	public static void main(String[] args) {
		
		       
		
		        int[][] sati = {               // Kreiramo dvodimenziolanli niz za sate zaposlenih
		
		                {2, 4, 3, 4, 5, 8, 8},
		
		                {7, 3, 4, 3, 3, 4, 4},
		
		                {3, 3, 4, 3, 3, 2, 2},
		
		                {9, 3, 4, 7, 3, 4, 1},
		
		                {3, 5, 4, 3, 6, 3, 8},
		
		                {3, 4, 4, 6, 3, 4, 4},
		
		                {3, 7, 4, 8, 3, 8, 4},
		
		                {6, 3, 5, 9, 2, 7, 9}};
		
		         
		
		        for (int i = 0; i < sati.length; i++) {  // prolazimo petljom kroz sve brojeve
		
		            int sum = totalHours(sati, i);        // pozivamo prethodn kreiranu metodu te joj prosledjujemo argumente
		
		            System.out.println("Employee " + i + ": has total " + sum + " hours");  //ispis u konzoli
		
		        }
		
		    }
		
		 
		
		    public static int totalHours(int[][] time, int rowIndex) {   // metoda koja ce vratiti zbir brojeva u svakoj koloni
		
		        int suma = 0;
		
		        int i = 0;
		
		        for (int column = 0; column < time[i].length; column++) { // prolazimo kroz sve unojete brojeve i svaki sabiramo 
		
		          suma += time[rowIndex][column];
		
		        }
		
		    return suma;                                                   // vracamo konacan zbir brojeva 
		
		    }
		
		}
