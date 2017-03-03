package abcd;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// This program is for understanding the concept of serialization
public class Serialization_tom1{
	public static void main(String[] args) throws IOException
	{
		Serialization_jerry1 object_jerry = new Serialization_jerry1(200000);
		
		FileOutputStream fout = new FileOutputStream("C:\\eclipse practice\\serializable_file.txt");
		
		ObjectOutputStream Oout = new ObjectOutputStream(fout);
		
		Oout.writeObject(object_jerry);
		Oout.flush();
		
		System.out.println("Success in Serialization");
	}
}
