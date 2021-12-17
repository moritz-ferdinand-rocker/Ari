import Value.*;

import java.util.*;
public class NominalOrdinal extends Nominal
{
	List<ValueDiscrete> expressions;
	public void arrange()
	{
	}
	public ValueContinuous relativeCumulativeFrequency(final ValueDiscrete discrete)
	{
		return this.absoluteCumulativeFrequency(discrete) / size();
	}
	public ValueDiscrete absoluteCumulativeFrequency(final ValueDiscrete discrete)
	{
		return this.expressions.stream().filter(o -> o < discrete).sum();
	}
}
