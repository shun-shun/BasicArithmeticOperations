package objectOrientation5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextOutput {

	public static void main(String[] args) {

		final String DATA = "1110110100101001010001001111110101";
		final String CRLF = "\r\n";

		try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("textB.txt"))) {
			for (int i = 1 ; i < 100000 ; i++) {
				bufferedWriter.write(DATA);
				if (i%100 == 0) bufferedWriter.write(CRLF);;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
