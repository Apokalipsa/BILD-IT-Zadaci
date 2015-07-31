package Zadaci2;

import java.util.Scanner;

public class CijenaPakovanjaRize {

	public static void main(String[] args) {
		// Trazimo unos podataka od korisnika o cijeni i tezini pakovanja rize
		Scanner input = new Scanner(System.in);                                  
		
		System.out.println(" Unesite tezinu prvog pakovanja: ") ;
		double tezinaPrvog = input.nextDouble();                                    // smjestamo unos u odgovarajuci memoriski prostor
		
		System.out.println(" Unesite cijenu prvog pakovanja: ");
		double cijenaPrvog = input.nextDouble();
		
		System.out.println(" Unesite tezinu drugog pakovanja: ") ;
		double tezinaDrugog = input.nextDouble();                                    // smjestamo unos u odgovarajuci memoriski prostor
		
		System.out.println(" Unesite cijenu drugog pakovanja: ");
		double cijenaDrugog = input.nextDouble();
		
		if( (tezinaPrvog / cijenaPrvog) > (tezinaDrugog / cijenaDrugog )){         // formula  i uslov za prvo pakovanje i  ispis
			System.out.println("Prvo pakovanje ima bolju cijenu!");
			
		}else if((tezinaDrugog / cijenaDrugog ) > (tezinaPrvog / cijenaPrvog)){  //  formula i uslov za drugo pakovanje i ispis
		System.out.println("Drugo pakovanje ima bolju cijenu!");
		
		} else{
			System.out.println(" Oba pakovanja imaju istu cijenu.");            // ako su pakovanja jednaka ispis u konzolu
		
		
		
	}

}
}
