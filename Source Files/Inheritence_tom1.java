package abcd;

public class Inheritence_tom1 {
	public static void main(String[] args)
	{
		// Creating object of Inheritence_jerry1 
		Inheritence_jerry1 object_of_jerry1 = new Inheritence_jerry1();
		Inheritence_mobby1 object_of_mobby1 = new Inheritence_mobby1();
		
		Inheritence_cobby1 object_of_cobby1 = new Inheritence_cobby1();
		
		// Initializing member inherited variable 
		object_of_jerry1.num1 = 11;
		object_of_mobby1.num1 = 12;
		
		System.out.println(object_of_jerry1.num1);
		System.out.println(object_of_mobby1.num1);
		
		object_of_jerry1.action();
		
		System.out.println(object_of_cobby1.num1);
		
		
		
		
	}
}
