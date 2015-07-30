package Zadaci2;

import java.util.Scanner;

public class ZajednickiDjeliociBrojeva {
	public static void main(String[] args)  throws Exception{             // ukoliko korisnik unese negativne brojeve program ce ga opomenuti
		try{
		Scanner input = new Scanner(System.in);                          // uzimamo podatke od korisnika sa tastature
		System.out.println(" Unesite prvi cijeli pozitivan broj");
		int prvi = input.nextInt();
		
		System.out.println(" Unesite drugi cijeli pozitivan broj");
		int drugi = input.nextInt();
		
		 najveciDjelilac(prvi, drugi);                                 // pozivamo prethodno kreiranu metodu
		
		} catch(Exception e){
			System.out.println(" Doslo je do greske! Unesite pozitivne brojeve?");
			
		}finally{

			
}
		

	}

	public static void  najveciDjelilac(int prvi, int drugi) {  // metoda koja vraca najveci djelioc
		int najveciDjelioc = 0;
		int najmanjiDjelioc=0;
		int result=0;
		for (int i = 2; i <= prvi && i <= drugi; i++) {         // prolazimo petljom kroz sve brojeve izmedju unesenih

			if (prvi % i == 0 && drugi % i == 0) {             // ukoliko je pri svakoj iteraciji broj djeljiv sa unesenim  brojevima bez ostatka
				najveciDjelioc = i;
			}
		}                                                     // kazemo da je to najveci i vracamo taj broj

		
		for (int i = 2; i <= prvi && i <= drugi; i++) {

			if (prvi % i == 0 && drugi % i == 0) {
				  najmanjiDjelioc = i;

			}

		}
		if(najmanjiDjelioc  == najveciDjelioc && najmanjiDjelioc !=1 || najveciDjelioc!=1){         // kada su uslovi jednaki i ispunjeni ispisujemo rezultat
			System.out.println("Najmanji i najveci zajednicki djelioci su:" + najmanjiDjelioc);
		}else{
			
			System.out.println("Najmanji zajednicki sadrzalac je: " + najmanjiDjelioc );    //  uslovi ako brojevi nisu ednaki za ispis
			System.out.println("Najveci zajednicki sadrzalac je: " + najveciDjelioc );
		}
		
		

	}
}
