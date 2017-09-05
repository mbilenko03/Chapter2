package youDoIt;

public class IntegerDemo 
{

	public static void main(String[] args) 
	{
		//Page 66
		
		int anInt= 1234;
		byte aByte = 12;
		short aShort = 12345;
		long aLong = 12345678901L;
		
		long anotherInt = anInt * 10000000L;
		
		System.out.println("The int is " + anInt);
		System.out.println("The byte is " + aByte);
		System.out.println("The short is " + aShort);
		System.out.println("The long is " + aLong);
		
		System.out.println("Another int is " + anotherInt);
	}

}
