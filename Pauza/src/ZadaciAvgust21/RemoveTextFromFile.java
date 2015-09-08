package ZadaciAvgust21;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class RemoveTextFromFile {

	public static void main(String[] args) {

		System.out.println("Creating and writing file...");

		try {
 
			File original = new File(args[1]);                                    // kreiramo file
			if (!original.exists()) {
			System.out.println(args[1] + " does not exist.");
			System.exit(1); 
			}                                                     
			System.out.println("path of file: " + original.getAbsolutePath()); // pomocu javine metode dobijamo mjeto gdje se file nalazi

			System.out.println("\nReading from file john.txt...\n");
			Scanner inFile = new Scanner(original);
                                                                             // iscitavamo podatke iz filea
			while (inFile.hasNextLine()) {
				System.out.println(inFile.nextLine());
			}
			inFile.close();

			inFile = new Scanner(original);

			File output = new File("output.txt");                       // kreiramo novi file koji ce se vratiti kada se postojeci zamijeni
			PrintWriter newOut = new PrintWriter(output);
                                             
			                                                                
			System.out.println("\nModifying file...\n");
			String newText = "";                                      // kreiramo string koji je prazan i pomocu kojeg cemo zamijeniti
			                                                         // postojece ime u fileu
			while (inFile.hasNextLine()) {
				newText += inFile.nextLine().replace(args[0], "") + "\n";
			}

			newOut.print(newText);

			newOut.close();
			inFile.close();

			System.out.println("\nOutputting new file...");          // ispisujemo novi sadrzaj file sa izmjenama
			inFile = new Scanner(output);
			while (inFile.hasNextLine())
				System.out.println(inFile.nextLine());

			inFile.close();

		} catch (Exception e) {                                   // ukoliko dodje do greske catch blok je hvata i ispisuje poruku
			System.out.println("No file specified.");
			System.exit(1);
		}

	}
}
