package ZadaciAvgust21;

import java.util.Scanner;

public class OutOfMemoryErrorUjavi {
	public static void main(String[] args) {
	
		try {                           // kreiramo try blok koji treba da izvrsi neku naredbu
			String word = "java";      // kreiramo string 
			while (true) {            // postavljamo uslov za rad loop-a
				word += word;        // string se sada nalazi u beskonacnom loop-u 
			}                       // dolazi do gubitka memoriskog rostora za datu rijec
		} catch (OutOfMemoryError e) {     // catch blokom hvatamo ovu gresku i prosledjumeo joj poruku te program nastavlja sa radom
			//System.out.println("\nUps, Out of Memory!");
			System.out.println(e.toString());
		}
	}
}	