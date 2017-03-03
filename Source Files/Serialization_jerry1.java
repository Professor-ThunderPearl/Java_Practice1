package abcd;

import java.io.Serializable;

// A Class whose object are been serialized, that class must 
 // implements the Serializabele interface
public class Serialization_jerry1 implements Serializable {
	private int salary;
	
	Serialization_jerry1(int Salary)
	{
		salary = Salary;
	}
	
	public int getSalary(int salary)
	{
		return salary;
	}
}
