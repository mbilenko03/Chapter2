package gameZone;

import java.util.Scanner;

public class RandomGuessMatch
{
	private static Boolean isCorrect = false;
	
	public static void main(String[] args)
	{
		//generate random number
		int random = 1 + (int)(Math.random() * 5);
		
		while (!isCorrect) 
		{
			CheckUserNumber(random);
		}

	}
	
	public static void CheckUserNumber(int random) 
	{
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Guess a number between 1 and 5: ");
		int userNumber = inputDevice.nextInt();
		inputDevice.close();

		if (userNumber == random) 
		{
			isCorrect = true;
			System.out.println("You guessed the number correctly!");
			System.out.println(isCorrect);
		}
		else 
		{
			System.out.println("You are off by" + (random - userNumber));
			System.out.println(isCorrect);
		}
		
	}

}
