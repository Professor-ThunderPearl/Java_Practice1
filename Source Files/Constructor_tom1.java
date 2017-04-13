package abcd;

public class Constructor_tom1 {
	
	Constructor_tom1()
	{
		System.out.println("I am the constructor, Guyssssss");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Constructor will get invoked as soon as we create the object of constructor class....");
	
		Constructor_tom1 obj1 = new Constructor_tom1();
		
		System.out.println("Constructor has already invoked and finished....");
	}
}
