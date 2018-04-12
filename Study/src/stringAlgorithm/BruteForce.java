package stringAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BruteForce {

	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String searchWord = bufferedReader.readLine();
			String words = bufferedReader.readLine();
			long start = System.currentTimeMillis();
			bruteForceAlgorithm(searchWord,words);
			long end = System.currentTimeMillis();
			System.out.println("elapsed time: " + ((end - start) / 1000.0) + "[sec]");
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	/**
	 * 力任せ検索
	 * テキストの先頭から1文字ずつ、検索文字列と比較する。
	 * 計算量 O(nm)n=テキストの文字数、m=検索文字列の文字数
	 *
	 * @param searchWord 検索文字列
	 * @param words テキスト
	 */
	public static void bruteForceAlgorithm(String searchWord, String words) {
		int firstIndex = 0;
		int lastIndex = 0;
		for (firstIndex = 0 ; firstIndex < words.length() ; firstIndex++) {
			for(lastIndex = 0; lastIndex < searchWord.length() ; lastIndex++ ) {
				if(words.length() <= firstIndex+lastIndex) return;
				if(words.charAt(firstIndex+lastIndex) != searchWord.charAt(lastIndex)) break;
				if(lastIndex == searchWord.length()-1) {
					//該当した文字列を開始インデックスと終了インデックスで表示。
					//System.out.println("firstPoint:"+firstIndex+"   endPoint:"+Integer.sum(firstIndex, lastIndex));
				}
			}
		}
	}

}
