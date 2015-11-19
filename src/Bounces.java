
import java.util.Random;

public class Bounces 
{

	private int iDices, iBounces, iThrow, iValue = 0;
	
	public Bounces()
	{
		iBounces = 1;
	}
	public Bounces (int bounces)
	{
		iBounces = bounces;
		
	}
	public int Randomize(int bounces)
	{
		Random rand = new Random();
		
		for (int i = 1; i<= bounces; i++)
		{
			iValue = iValue = rand.nextInt(6) + 1;
				}
		return iValue = iValue / bounces;
	}
	public int Throw (int dices)

	{
		return iThrow = this.Randomize(dices = iBounces);
		
	}
public int Throw (int dices, int bounces)
{
	return iThrow = this.Randomize(dices = bounces);
	
}
	
	}
