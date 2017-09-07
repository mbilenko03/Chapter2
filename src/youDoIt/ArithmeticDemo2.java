package youDoIt;

import java.util.Scanner;

public class ArithmeticDemo2
{

	public static void main(String[] args)
	{
		// Page 100
		
		double firstNumber, secondNumber, sum, difference, average;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a double: ");
		firstNumber = input.nextDouble();
		System.out.print("Please enter another double: ");
		secondNumber = input.nextDouble();
		
		sum = firstNumber + secondNumber;
		difference = firstNumber - secondNumber;
		average = sum / 2;
		
		System.out.printf(firstNumber + " + " + secondNumber + " is " + sum + "\n");
		System.out.printf(firstNumber + " - " + secondNumber + " is " + difference + "\n");
		System.out.printf("The average of " + firstNumber + " and " + secondNumber + " is " + average);

		input.close();
	}

}
