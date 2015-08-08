package Project;

public class Craps {
	
	/*(Game: craps) Craps is a popular dice game played in casinos. Write a program
	  to play a variation of the game, as follows:
	  Roll two dice. Each die has six faces representing values 1, 2, …, and 6, respectively.
	  Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you
	  lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value
	 (i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either
	  a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.
	  Your program acts as a single player.*/
	
	public static void main(String[] args) {
		
		
			int dice1 = (int)(Math.random()* 6) + 1;
			int dice2 = (int)(Math.random()* 6) + 1;
			
			int roll = dice1 + dice2;
			
			System.out.println();
			System.out.print("You rolled "+roll+". ");
			
			if(roll == 2 || roll == 3 || roll == 12){
				System.out.println("****You Lose !****");
				
			}else if(roll == 7 || roll == 11){
				System.out.println("You Win !");
			}else{
				System.out.println("Point is "+roll+"\n");
				
				dice1 = (int)(Math.random()* 6) + 1;
				dice2 = (int)(Math.random()* 6) + 1;
				
				int roll2 = dice1 + dice2;
				System.out.print("You rolled "+roll2+". ");
				
				while(roll2 != 7){
					if(roll == roll2){
						System.out.println("You Win !");
						break;
					}else{
						System.out.println("Point is "+roll+"\n");
					}
					dice1 = (int)(Math.random()* 6) + 1;
					dice2 = (int)(Math.random()* 6) + 1;
					
					roll2 = dice1 + dice2;
					
					System.out.print("You rolled "+roll2+". ");
				}
				if(roll2 == 7){
					System.out.println("****You Lose !****");
				}			
			}
		}
	}