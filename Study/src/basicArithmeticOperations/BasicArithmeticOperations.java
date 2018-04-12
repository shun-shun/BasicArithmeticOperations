package basicArithmeticOperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicArithmeticOperations {

	public static void main(String[] args) {
		try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
			String inputString = bufferedReader.readLine();
			String input[] = inputString.split(" ");
			int suti = 0;
			int ans = Integer.parseInt(input[0]);
			for(int i = 1 ; i < input.length ; i+=2) {
				suti = Integer.parseInt(input[i+1]);
				if(suti < -100000 || suti > 100000) {
					System.out.println("整数は-100000から100000の間で指定してください。");
					return;
				}
				switch (input[i]) {
				case "+":
					ans += suti;
					break;
				case "-":
					ans -= suti;
					break;
				default:
					System.out.println("式が不正です。");
					return;
				}
			}
			System.out.println(inputString + " = " + ans);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
