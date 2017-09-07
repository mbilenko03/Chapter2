package excersises;

import java.util.Scanner;

public class Initials
{

	public static void main(String[] args)
	{
		//request initials
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Please enter your first name: ");
		char firstInitial = inputDevice.next().charAt(0);
		System.out.print("Please enter your middle name: ");
		char middleInitial = inputDevice.next().charAt(0);
		System.out.print("Please enter your last name: ");
		char lastInitial = inputDevice.next().charAt(0);
		inputDevice.close();
		
		//display initials
		System.out.println(firstInitial + "." + middleInitial + "." + lastInitial + ".");

	}

}
