package fileList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class FileReader{

	public synchronized void Read(File file1, HashMap<File, String> Storage,File data) throws FileNotFoundException {
		
		
	//Printing a single files 	
		if(file1==null)
		{
			System.out.println("No such file available to delete");
			return;
		}
		
		Scanner fileReader = new Scanner(file1);
		
		System.out.println("{"+file1+":"+Storage.get(data)+"}");
		System.out.println();
		
		fileReader.close();
	
	}
	
	//Printing a single files
	public synchronized void displayEntireFiles(HashMap<File, String> Storage)
	{
		if(Storage.isEmpty())
		{
			System.out.println("\nYour file directory is empty\n");
		}
		else
		{
		System.out.println(Storage);
		}
	}
	
	

}
