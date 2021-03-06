package die;

public class Die
{
	private int rollVal;
	public int numSides;
	
	public Die () 
	{
		numSides = 6;
	}
	
	public Die(int sides)
	{
		numSides = sides;
		roll();
	}
	
	public int roll()
	{
		rollVal = (int) (Math.random() * numSides) + 1;
		return rollVal;
	}
}
