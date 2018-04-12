package objectOrientation6;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TextIO3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		try (FileInputStream fileInputStream = new FileInputStream("textA.txt");){

			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
			String line;
			while((line = bufferedReader.readLine()) != null) {
				list.add(line);
			}
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		for(int i = 0 ; i < 2 ; i++) {
			for(String line : list) {
				System.out.println(line);
			}
			if(i >= 1) break;
			Collections.reverse(list);
		}
		System.out.println(Collections.binarySearch(list, "あいうえお"));
	}

}
