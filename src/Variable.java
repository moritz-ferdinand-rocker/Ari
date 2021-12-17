import Value.*;

import java.util.*;

import static java.lang.Math.*;
public class Variable
{
	String                name;
	Nominal               scale;
	List<ValueContinuous> values;
	public ValueContinuous relativeFrequency(ValueDiscreteQuality quality)
	{
		return new ValueContinuous(absoluteFrequency(quality).value() /
		                           size().value());
	}
	public ValueDiscrete absoluteFrequency(Value value)
	{
		return new ValueDiscrete(values.stream()
		                               .filter(o -> o == value)
		                               .count());
	}
	public ValueDiscrete size()
	{
		return new ValueDiscrete(values.size());
	}
	Value mode()
	{
		return
	}
	ValueContinuous empiricalVariance()
	{
		return new ValueContinuous(values.stream()
		                                 .mapToDouble(o -> sqrt(o.value() -
		                                                        arithmeticMean().value()))
		                                 .sum() / size().value());
	}
	ValueContinuous arithmeticMean()
	{
		return values.stream().mapToDouble().sum() / (double) this.size();
	}
}
