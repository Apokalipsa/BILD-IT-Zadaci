package ZadaciAvgust22;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class JavaSourseCode {
	public static void main(String[] args) throws Exception {
		
		if (args.length != 2) {         // provjeravamo da li je proslijedjeno  regularno ime file kao argumenat
			System.out.println("Usage: java source File or target File !");               // ako nije ispisujemo poruku upozorenja
			System.exit(0);            // program prekida sa radom
		}

		File sourceFile = new File(args[0]);       // kreiramo file objekat
		if (!sourceFile.exists()) {               // provjeravamo da li taj file postoji
			System.out.println("Source file " + args[0] + " does not exist");              // ukoliko ne postoji ispisujemo poruku upozorenja
			System.exit(0);                     // program prekida sa radom
		}

		File targetFile = new File(args[1]);             // kreiramo novi file objekat
		if (targetFile.exists()) {                      // provjeravamo da li on postoji
			System.out.println("Targer file " + args[1] + " already exists");              // ukoliko ne postoji vracamo poruku upozorenja
			System.exit(0);                           // program prekida sa radom
		}

		Scanner input = new Scanner(sourceFile);                       // trazimo iscitavanje podataka iz filea
		PrintWriter output = new PrintWriter(targetFile);             // upisujemo te podatke u novo kreirani file

		while (input.hasNext()) {                                   //  petlja radi do god ima sadrazaja u fileu 
			String s1 = input.nextLine();                          // kreiramo string koji ce da primi podatke iz filea
			String s2 = s1.replaceAll("\n\t{", " {");             //kreiramo i drugi string koji te podatke prima pa pozivamo javinu metodu za uklanjane
			output.println(s2);                                  // vracamo izmjenjenje podatke 
		}
	}
}