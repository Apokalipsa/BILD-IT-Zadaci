package AvgustZadaci;


import java.util.Arrays;
import java.util.Scanner;

public class SortiranjeDvodimenzionalnogNiza {
	 
			
			public static void sort2Darray(int m[][]) { // metoda za sortiranje redova i kolona u 2D nizu
				
				
				int[] sorirani;               // ostavljamo memoriski prostor za sortirani niz u redu
				                             // svaki 2D niz ima elemente u obliku 1 D niza
				
				for (int i = 0; i < m.length; i++) {         // polazimo od prvog broja u redu 
					for (int j = 0; j < m.length; j++) {
						if (m[i][0] < m[j][0]) {           // ukoliko je broj iz 2d niza manji od broja u koloni
							sorirani = m[i];              // nas sortirani postavljamo da je sada taj broj
							m[i] = m[j];                 //  dakle nadjeni broj zatim postavljamo na  pocetno mjesto u koloni
							m[j] = sorirani;            // pa kada je i taj broj odgovarajuci kazemo sada da je sorirani upravo jednak tombroju
						}
					}
				}

				
				for (int i = m[0].length - 1; i > 0 ; i--) {
					for (int j = 0; j < m.length; j++) {
						for (int k = 0; k < m.length; k++) {                  // isto ureadimo i sa brojevima u kolonama
							if (m[j][0] == m[k][0] && m[j][i] < m[k][i]) {
								sorirani= m[j];
								m[j] = m[k];
								m[k] = sorirani;
							}
						}
					}
				}
			}
			public static void main(String args[]){
				
				int[][] m = {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}; // unosimo brojeve u matricu tj clanove matrice
				
				sort2Darray(m);    // pozivamo se na prethodno kreiranu metodu koja ce sortirati unijti 2D niz
				
			

			
				for (int i = 0; i < m.length; i++) {         // pomocu petlje ispisujemo konacan rezultat u konzolu
					for (int j = 0; j < m[0].length; j++) {
						System.out.print(m[i][j] + " ");
					}

					System.out.println();
				}

			}

		}