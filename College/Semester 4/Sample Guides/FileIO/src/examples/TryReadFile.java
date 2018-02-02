package examples;

import java.io.*;

public class TryReadFile {
	public static void main(String[] args) throws IOException

	{
		String s;

		File myDir = new File("files");
		File myFile = new File(myDir, "people.txt");
		BufferedReader in = new BufferedReader(new FileReader(myFile));

		while ((s = in.readLine()) != null) {
			System.out.println(s);
		}

		in.close();
	}

}
