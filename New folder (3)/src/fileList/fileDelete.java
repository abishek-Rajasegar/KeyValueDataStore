package fileList;

import java.io.File;
import java.util.HashMap;

public class fileDelete {

	public void deletefile(File file1, HashMap<File, String> storage) {

		//delete the file if it is present else a "file not exists" message is displayed
		if (storage.containsKey(file1)) {

			storage.remove(file1);

			System.out.println("\ndeleted succesfully\n");
		}

		else {
			System.out.println("\nNo such file exists check the name of case of the file\n");
		}
	}
}
