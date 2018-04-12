package objectOrientation8;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class TextIO5 {

	public static void main(String[] args) {
		try(FileInputStream fileInputStream = new FileInputStream("textA.txt")){
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
			Map<String, String> map = new LinkedHashMap<>();
			String line;

			while((line = bufferedReader.readLine()) != null) {
				String[] valueAndKey = line.split(" ");
				map.put(valueAndKey[0], valueAndKey[1]);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
