package Value;
public class ValueDiscrete implements Value
{
	long value;
	public ValueDiscrete(final long value)
	{
		this.value = value;
	}
	public long value()
	{
		return this.value;
	}
}
