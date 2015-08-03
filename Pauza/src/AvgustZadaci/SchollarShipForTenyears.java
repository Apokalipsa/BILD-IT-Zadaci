package AvgustZadaci;

import java.util.Scanner;

public class SchollarShipForTenyears {

	public static void main(String[] args) {
		// Stampam: "Do koje godine zelite da se racuna skolarina?".
				Scanner input = new Scanner(System.in);
				System.out.print("Enter age you want to be counted scholarship?");
				int godina = input.nextInt();

				
				double skolarina = 10000;                                        // Definisemo pocetnu vrednost skolarine.

				
				double povecanjezagod = 0.05;                                  // Postostak 5% po godini

				for (int i = 1; i <= godina; i++) {                          // pocinjemo da racunamo od 1 godine pa sve do godine koju korisnik zeli
					skolarina = (skolarina + (skolarina * povecanjezagod)); // formula za dobijanje iynosa skolarine
					
					System.out.println("For the year\t" + i + "\t "        // Stampamo: "Za svaku godinu, sklarina je"... narednih  10 godina
							+ "the tuition fees:\t" + skolarina + ".");
				}

			}

	}


