import Value.*;

import java.util.*;
public class Nominal
{
	Set<ValueDiscreteQuality> expressions;
	public ValueQuantity support()
	{
		return this.expressions.size();
	}
}
