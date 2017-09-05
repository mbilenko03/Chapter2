package gameZone;

import java.util.Scanner;

public class MadLibs
{

	public static void main(String[] args)
	{
		String color, wordEst, bodyPartPlural, animal, noun, pluralNoun;
		
		int a, b, c;
			
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a color: ");
		color = input.nextLine();
		
		System.out.println("Enter a word ending in est: ");
		wordEst = input.nextLine();
		
		System.out.println("Enter a plural body part: ");
		bodyPartPlural = input.nextLine();
		
		System.out.println("Enter an animal: ");
		animal = input.nextLine();
		
		System.out.println("Enter a noun: ");
		noun = input.nextLine();
		
		System.out.println("Enter a plural noun: ");
		pluralNoun = input.nextLine();
		
		System.out.println("Enter first number: ");
		a = input.nextInt();
		
		System.out.println("Enter second number: ");
		b = input.nextInt();
		
		input.close();
		
		c = a - b;
		
		System.out.println("The " + color + " Dragon is the " + wordEst + " Dragon of all. It has " 
				+ c + " " + bodyPartPlural + ", and a " + animal + " shaped like a " + noun + ". It loves to eat " 
				+ pluralNoun + ", although it will feast on nearly anything.");
	}

}
