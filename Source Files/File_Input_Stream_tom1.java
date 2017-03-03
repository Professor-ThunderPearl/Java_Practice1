package abcd;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_Input_Stream_tom1 {
	public static void main(String[] args) throws IOException
	{
		// This class is use to read the stream of raw bytes
//		FileInputStream fin = new FileInputStream("C:\\eclipse practice\\abc.txt");
//		int i = 0;
//		
//		while((i = fin.read())!=-1)
//		{
//			System.out.print(i);
//		}
		
		FileReader fr = new FileReader("C:\\eclipse practice\\abc.txt");		
		BufferedReader br = new BufferedReader(fr);
		String line;
		//while((line = br.readLine())!=null)
	//	{
			System.out.println(br.readLine());
		//}
	}
	
}
