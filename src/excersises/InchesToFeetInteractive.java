package excersises;

import java.util.Scanner;

public class InchesToFeetInteractive
{

	public static void main(String[] args)
	{
		//conversion
		final int inchesInFeet = 12;

		//request user input
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("How many inches: ");
		int numberOfInches = inputDevice.nextInt();
		inputDevice.close();
			
		//calculate conversions
		int numberOfFeet = numberOfInches/inchesInFeet;
		
		int remainingInches = numberOfInches%inchesInFeet;
		
		//output
		System.out.println("There are " + numberOfFeet + " feet and " + remainingInches + " inches in " + numberOfInches + " inches.");
	}

}
