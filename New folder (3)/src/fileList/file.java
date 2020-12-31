package fileList;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class file {

	static HashMap<File, String> Storage = new HashMap<File, String>();

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		File file1 = null, DeleteFile = null;

		String str1 = "";

		String name = "";

		int value = 1;
		

		do {
			System.out.println("1.Create and write a file\n2.display a single file\n3.display the list of files\n3.delete a file\n4.to exit\n");

			try {
				value = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Enter valid Number input program terminated");
				break;
			}

			switch (value) {

			case 1: {
				
				
				System.out.println("Enter the file Name : ");

				String fileName = "";

				fileName = sc.next(); // get file name from user

				file1 = new File(fileName); // declaring the file

				file1.createNewFile(); // creating a file

				if (Storage.containsKey(file1)) {
					System.out.println("\n File is already present. Create a file with some other name\n");
					break;
				}

				System.out.println("Enter the data which your want to store in the file: ");

				sc.nextLine();

				str1 = sc.nextLine();

				fileWriter obj = new fileWriter();

				obj.write(file1, str1, Storage);

				break;
			}

			case 2: {
                //file reader
				FileReader obj1 = new FileReader();

				System.out.println("Enter the file name");
				
				String name1 = sc.next();
				 
				File fileNameToBeDisplayed = new File(name1);
				
				obj1.Read(file1, Storage,fileNameToBeDisplayed);
				break;

			}
			
			case 3:
			{
				FileReader obj2 = new FileReader();
				
				obj2.displayEntireFiles(Storage);
			    
				break;
			}
			

			case 4: {
				
				//file deletion 
				System.out.println("Enter the file name which you want to delete");

				try {
					name = sc.next();
					DeleteFile = new File(name);
				} catch (Exception e) {
					System.out.println(e);
				}

				fileDelete obj2 = new fileDelete();

				obj2.deletefile(DeleteFile, Storage);

				break;
			}

			case 5: {
				value = 5;
				System.out.println("\nAll operations completed succesfully and terminating..");
				break;
			}

			default: {
				System.out.println("Enter a valid option");
			}
			}

		} while (value != 5);

		sc.close();
	}

}
