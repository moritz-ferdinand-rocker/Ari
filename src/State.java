import java.util.*;
public class State
{
	Set<Tag>  tags;
	List<Job> jobs;
	State()
	{
		this.tags = new HashSet<>();
		this.jobs = new LinkedList<>();
	}
}
