package fileList;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class fileWriter {

	public void write(File file1, String str, HashMap<File, String> Storage) throws IOException {
		
		//Checking if the file size is more than 1Gb
		if (file1.length() > (1024 * 1024 * 1024))
		{
			System.out.println("File size should be less than 1gb");
			return;
		}
		
		FileWriter wrtFile = new FileWriter(file1);

		//Adding data into the file
		wrtFile.write(str);

		wrtFile.close();

		//Storing the file along with its data
		Storage.put(file1, str);
	
		System.out.println("\nFile created succesfully\n");

	}

}
