package excersises;

import java.util.Scanner;

public class NauticalMilesInteractive
{

	public static void main(String[] args)
	{
		//conversion
		final double kilometersInNauticalMiles = 1.852;
		final double milesInNauticalMiles = 1.150779;

		//request
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Please enter how many nautical miles: ");
		double nauticalMiles = inputDevice.nextDouble();
		inputDevice.close();
		
		//convert
		double kilometers = nauticalMiles * kilometersInNauticalMiles;
		double miles = nauticalMiles * milesInNauticalMiles;
		
		//output
		System.out.println("In " + nauticalMiles + " there are " + kilometers + " kilometers and " + miles + " miles.");
	}

}
