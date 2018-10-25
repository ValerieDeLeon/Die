package die;
import java.util.Scanner;

public class DieDriver 
{
	public static void main (String[] args)
	{
		final int TOTAL_ROLLS = 1000;
		Scanner keyboard = new Scanner(System.in);
		int roll = 0;
		
		System.out.print("Enter the number of sides on your die: ");
		int sides = keyboard.nextInt();
		keyboard.close();
		
		Die myDie = new Die(sides);
		
		for (int i = 1; i <= TOTAL_ROLLS; i++) 
		{
			roll = myDie.roll();
			System.out.println("Your die has rolled a " + roll + ".");
		}
	}
}
