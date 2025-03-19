package task01;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	public static void main(String[]argas) {
		Scanner sc=new Scanner(System.in);
		Random ra=new Random();
		boolean playagain=true;
		int score=0;
		while(playagain) {
			int r=ra.nextInt(100)+1;
			int attempt=0;
			int maxattempt=10;
			
			boolean guess=false;
			System.out.println("Enter a no. between 1 to 100");
			System.out.println("you have "+maxattempt+" attempts to guess the number");		
		while(!guess&&(attempt<maxattempt)){
			System.out.println("enter your guess number");
			int userguess=sc.nextInt();
			attempt++;
			if(userguess==r) {
				System.out.println("your guess is correct");
				guess=true;
				score+=1;
			}
			else if(userguess<r){
				System.out.println("Your guess number is too low");				
					}
			else {
				System.out.println("Your guess is too high");				
			}
		}
		if(!guess) {
			System.out.println("You used all your"+maxattempt);
		}
			System.out.println("The correct number is"+r);
			System.out.println("Your score is "+score);			
			System.out.println("Do you want to play again(yes/no)");
			playagain=sc.next().equalsIgnoreCase("yes");
		}
		System.out.println("Your final score is:"+score);
		sc.close();
		}
}
		
		




	