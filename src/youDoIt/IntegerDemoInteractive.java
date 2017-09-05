package youDoIt;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerDemoInteractive
{

	public static void main(String[] args)
	{
		
		//Page 84
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Please enter your name: ");
		String name = input.nextLine();
		
		System.out.println("Please enter an integer: ");
		int anInt = input.nextInt();
		
		System.out.println("Please enter a byte: ");
		byte aByte = input.nextByte();
		
		System.out.println("Please enter a short: ");
		short aShort = input.nextShort();
		
		System.out.println("Please enter a long: ");
		long aLong = input.nextLong();
		
				
		System.out.println("The int is " + anInt);
		System.out.println("The byte is " + aByte);
		System.out.println("The short is " + aShort);
		System.out.println("The long is " + aLong);
		System.out.println("Thank you " + name);
		
		
		input.close();
	}

}
