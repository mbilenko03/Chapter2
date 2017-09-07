package excersises;

import java.util.Scanner;

public class Eggs
{

	public static void main(String[] args)
	{
		//Conversion Rates
		final double dozenEggPrice = 3.25;
		final double individualEggPrice = 0.45;
		final int eggsInDozen = 12;
		
		//Request User Input
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Number of eggs: ");
		int eggs = inputDevice.nextInt();
		inputDevice.close();
		
		//Calculate dozen and loose eggs
		int numberOfDozens = eggs/eggsInDozen;
		int looseEggs = eggs%eggsInDozen;
		
		//Price of eggs
		double priceOfDozens = numberOfDozens * dozenEggPrice;
		double priceOfLooseEggs = looseEggs * individualEggPrice;
		double totalPrice = priceOfDozens + priceOfLooseEggs;
		
		//Output
		System.out.println("You ordered " + eggs + " eggs. That's " + numberOfDozens + " dozen at $" + dozenEggPrice 
				+ " per dozen and " + looseEggs + " loose eggs at " + (individualEggPrice * 100) 
				+ " cents each for a total of $" + totalPrice + ".");
		
	}

}
