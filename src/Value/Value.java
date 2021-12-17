package Value;
public abstract class Value<T>
{
	private final T value;
	public Value(final T value)
	{
		this.value = value;
	}
	public T value()
	{
		return this.value;
	}
}
