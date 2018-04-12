package objectOrientation5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextInput {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		final String CRLF = "\r\n";

		try(BufferedReader bufferedReader = new BufferedReader(new FileReader("src/objectOrientation5/textB.txt"))){
			String string = bufferedReader.readLine();
			while(string != null) {
				builder.append(string+CRLF);
				string = bufferedReader.readLine();
			}

		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		System.out.println(builder.toString());
	}
}
