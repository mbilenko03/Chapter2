package excersises;

import java.util.Scanner;

public class QuartsToGallonsInteractive
{

	public static void main(String[] args)
	{
		//conversion
		final int quartsInGallon = 4;

		//request user input
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Please enter how many quarts you have: ");
		int numberOfQuarts = inputDevice.nextInt();
		inputDevice.close();
			
		//calculate conversions
		int numberOfGallons = numberOfQuarts/quartsInGallon;
		
		int remainingQuarts = numberOfQuarts%quartsInGallon;
		
		//output
		System.out.println("A job that needs " + numberOfQuarts + " quarts requires " + numberOfGallons 
				+ " gallons plus " + remainingQuarts + " quarts." );
	}

}
