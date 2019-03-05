package exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {

	public String readFileToString(String filePath) throws IOException {

		File file = new File(filePath);

		BufferedReader br = new BufferedReader(new FileReader(file));

		String allText = "";
		String line;
		
		while ((line = br.readLine()) != null) {
			allText += line + "\n";
		}
		
		br.close();
		
		return allText;
	}
}

