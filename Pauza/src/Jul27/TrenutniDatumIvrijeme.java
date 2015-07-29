package Jul27;


import java.sql.Date;
import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TrenutniDatumIvrijeme {
	
	public static void main(String[] args) {
		 
		long milisekunde = System.currentTimeMillis();                                   //pozivamo se na javinu klasu za konvertovanje 
		Date datum = new Date(milisekunde); 
		                                                                                //pozivamo se na javinu klasu za datum
		SimpleDateFormat curentDate = new SimpleDateFormat("dd. MMM, yyyy HH:mm:ss");  // pozivamo javinu klasu za formata  vremena
		System.out.println("Sada je: " + curentDate.format(datum));                   // ispis u konzoli trazenog vremena
		
		             

}
}
