package AvgustZadaci;

import java.util.GregorianCalendar;

public class MyDateKlasa {
	 private int year;
	 private int month;         // kreiramo memoriski prostor za data fields 
	 private int day;
	
	  MyDateKlasa() {                                        // kreiramo prazan konstruktor
		  
	  GregorianCalendar cal = new GregorianCalendar();     // kreiramo intstancu objekta GC
	  year = cal.get(GregorianCalendar.YEAR);             // dodjeljujemo parametrima danasnje vrijeme tj nasim data fieldsima
	  month = cal.get(GregorianCalendar.MONTH);           
	  day = cal.get(GregorianCalendar.DAY_OF_MONTH);      
	 }
	 
	  MyDateKlasa(long elapsedTime) {                                        // kreiramo kontruktor koji ce vratiti proteklo vrijeme
		  
	  GregorianCalendar Od = new GregorianCalendar(1970, 1, 1);  
	  GregorianCalendar calendar = new GregorianCalendar();                // kreiramo instancu objekta GC
	  calendar .setTimeInMillis(Od.getTimeInMillis() + elapsedTime);      // poziv metode i sabiranje unesenog vremena
                                                                        
	  year =  calendar .get(GregorianCalendar.YEAR);                    // dodjeljujemo vrijednosti parametrima tj nasim data fieldsima
	  month = calendar .get(GregorianCalendar.MONTH);                   
	  day =  calendar .get(GregorianCalendar.DAY_OF_MONTH);            
	 }
	
	 MyDateKlasa(int year, int month, int day) {   // kreiramo konstruktor koji prima odredjene podatke
	  this.year = year;
	  this.month = month;
	  this.day = day;
	 }
	
	 public int getYear() {    // geter za dobijanje godine
	  return year;
	 }
	 public int getMonth() {  // geter za dobijanje mjeseca
	  return month;
	 }
	 public int getDay() {   // geter za dobijanje dana
	  return day;
	 }
	 
	 public void setDate(long elapsedTime) {              // metoda za racunanje vremena
	  GregorianCalendar cal = new GregorianCalendar();   // kreiramo objekat javine klase za gregorian calendar
	  cal.setTimeInMillis(elapsedTime);                 //  metode za pretvaranje broja u milisekundama

	  year = cal.get(GregorianCalendar.YEAR);            // pozivanje metode i dobijanje godine za uneseni broj u milisek.
	  month = cal.get(GregorianCalendar.MONTH);         // pozivanje metode i dobijanje mjeseca za uneseni broj u milisek.
	  day = cal.get(GregorianCalendar.DAY_OF_MONTH);   // pozivanje metode i dobijanje dana za uneseni broj u milisek.
	 }
	 public static void main(String[] args) {
		 
		 MyDateKlasa trenutnoVrijeme= new MyDateKlasa();        // kreiramo objektnu instancu nase klase
		 
			System.out.println("Danasnji datum: "+ trenutnoVrijeme.getYear() + "/" + trenutnoVrijeme.getMonth() + "/" + trenutnoVrijeme.getDay());
			
			MyDateKlasa date= new MyDateKlasa(34355555133101L);  // kreiramo objektnu instancu nase klase
			
			System.out.println("Datum: " + date.getYear() + "/" + date.getMonth() + "/" + date.getDay());
			
			MyDateKlasa datePast = new MyDateKlasa();            // kreiramo objektnu instancu nase klase
			datePast.setDate(561555550000L);
			
			System.out.println("Datum u proslosti: " + datePast.getYear() + "/" + datePast.getMonth() + "/" + datePast.getDay());
			
			MyDateKlasa futurDate = new MyDateKlasa(2015, 11, 11);  // kreiramo objektnu instancu nase klase
			
			System.out.println("Datum u buducnosti: " + futurDate.getYear() + "/" + futurDate.getMonth() + "/" + futurDate.getDay());
			
		}
	
	}



