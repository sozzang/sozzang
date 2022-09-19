import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Number {

	public static void main(String[] args) {
		File file = new File("d:\\filetest\\number.txt");
		BufferedReader br = null;
		FileWriter fw = null;
		List<Integer> list = new ArrayList<>();

		try {
			br = new BufferedReader(new FileReader(file));
			String line;
			while ((line = br.readLine()) != null) {
				list.add(Integer.valueOf(line));
				Collections.sort(list); // List는sort할 때 Collections
			}

			fw = new FileWriter(new File("d:\\filetest\\number2.txt"));

			for (int i = 0; i < list.size(); i++) {
				fw.write(String.valueOf(list.get(i)) + "\n");
			}
			fw.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}