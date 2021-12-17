package Value;
public class ValueContinuous implements Value
{
	private final Double value;
	ValueContinuous(final Double value)
	{
		this.value = value;
	}
	Double value()
	{
		return this.value;
	}
}
