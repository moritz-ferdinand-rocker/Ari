package Distribute;
public class Bernoulli extends Distribute
{
	double mass(final int count , final double probability)
	{
		return probability * count + (1 - probability) * (1 - count);
	}
}
