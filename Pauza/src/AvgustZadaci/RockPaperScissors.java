package AvgustZadaci;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner input = new Scanner(System. in );
		Random rnd = new Random();
		int unos;
		int B = 1;
		System.out.println("***Welcome***");

		System.out.println("Pick 0, 1, or 2:");
		System.out.println("ROCK [0], PAPER[1], or SCISSOR [2]");
		while (B != 0) {
			// 1 = rock
			// 2 = paper
			// 3 = scissors
			
			int Rock = 0, Paper = 1, Scissor = 2;

			unos = input.nextInt();
			int randomNumber = rnd.nextInt(3 - 1 + 1) + 1;
			if (randomNumber == Rock) {
				if (unos == Rock) {
					System.out.println("Rock Vs. Rock: TIE");
				} else if (unos == Paper) {
					System.out.println("Paper Vs. Rock: YOU WIN");
				} else if (unos == Scissor) {
					System.out.println("Scissor Vs. Rock: YOU LOSE");
				}
			} else if (randomNumber == Paper) {
				if (unos == Rock) {

	System.out.println("Rock Vs. Paper: YOU LOSE");
} else if (unos == Paper) {
	System.out.println("Paper Vs. Paper: TIE");
} else if (unos == Scissor) {
	System.out.println("Scissor Vs. Paper: YOU WIN");
}

} else if (randomNumber == Scissor) {
if (unos == Rock) {
	System.out.println("Rock Vs. Scissor: YOU WIN");
} else if (unos == Paper) {
	System.out.println("Paper Vs. Scissor: YOU LOSE");
} else if (unos == Scissor) {
	System.out.println("Scissor Vs. Scissor: TIE");
}
}

int Y=3, N=5;
System.out.println("Do you want to play again? Y(3)/N(5)");
unos = input.nextInt();
if(unos==Y){
B=1;	
System.out.println("ROCK [0], PAPER[1], or SCISSOR [2]");
}
else if(unos==N)
{
	System.out.println("GOODBYE");

}
	
}

}
}




