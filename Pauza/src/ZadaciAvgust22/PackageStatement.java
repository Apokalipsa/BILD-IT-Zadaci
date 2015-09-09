package ZadaciAvgust22;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class PackageStatement {
	public static void addingName(File inputs, String packageName) {
		
		if (!inputs.isFile()) {                                                           // provjeravamo da li je uneseni parametar file
			System.out.println(" Warning !! Invalid parameter! Enter the valid file: "); // ukoliko je parametar pogresan isisujemo upozorenje
			 System.exit(0);                                //  program prekida sa radom

			try {                                         // otvaramo try blok
				Scanner input = new Scanner(inputs);     // iscitavamo podatke iz unesenog filea
				String nameOfPackage = "package " + packageName + ";\n"; // kreiramo string koji vraca ime filea
				while (input.hasNext()) {                               // postavljamo petlju da radi dok god ima sadrzaja u fileu
					nameOfPackage+= input.nextLine() + "\n";           // unosimo podatke iz filea
				}
				PrintWriter addInFile = new PrintWriter(new FileOutputStream(inputs));  // upisujemo u file pronadjeno ime
				addInFile.append(nameOfPackage);                                       // pozivamo se na javinu metodu da upisemo podatke
				addInFile.close();

			} catch (Exception ex) {
				System.out.println("File does not exist");    // hvatamo gresku u catch bloku i ispisujemo poruku upozorenja
			}
		} else  {                                           // ukoliko unos nije file nego directorij lista filea
			
			File[] file = inputs.listFiles();             // kreiramo niz koji ce primiti unesenu listu
			for (int i = 0; i < file.length; i++) {      // petljom prolazimo kroz citav niz
				addingName(file[i], inputs.getName());  // pozivamo se na kreiranu metodu za dodjelu imena fileu i prosledjujemo joj sv podatke iz
				                                       // directory liste, te za isti dodjeljujemo imena preko get metode
			}
		}
	}


	public static void main(String[] args) {
		
		if (args.length != 0) {                               // ukoliko string ima sadrzaj
			String name = args[0];                           // kreiramo string za ime argumenta
			File[] packages = new File(name).listFiles();   // kreiramo niz za pakete i prosledjujemi ime paketa
			for (int i = 0; i < packages.length; i++) {    // petljom prolazmo kroz listu paketa
				
				File[] file = packages[i].listFiles();             // kreiramo niz koji prima file iz paketa 
				for (int j = 0; j < file.length; j++) {           // prolazimo petljom kroz sve nadjene fileove unutar paketa
					addingName(file[j], packages[i].getName());  // dodjeljujemo im imena
				}
			}
			System.out.println("Package names added.");        // ispisujemo rezultat rada programa u konzoli
		}
	}

}
