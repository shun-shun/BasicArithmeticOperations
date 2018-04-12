package characterCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class CharacterCode {

	public static void main(String[] args) {
		String charCode;
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try {
			charCode = bufferedReader.readLine();
			System.out.println(String.valueOf(charCode.getBytes(StandardCharsets.UTF_8)));
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

}
