package basicArithmeticOperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BasicArithmeticOperationsVer2 {
	public static void main(String[] args) {
		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
			String inputString = bufferedReader.readLine();
			String input[] = inputString.split(" ");
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
//		1 + ( 2 + 3 ) + ( 2 + ( 3 + 4 ) - 40 )
//		String[] input = {"1","+","(","2","+","3",")","+","(","2","+","(","3","+","4",")","-","40",")"};
	}

	/**
	 * 引数で"("から")"までの配列を取得する。"("")"は含まれない。
	 * 配列の先頭は"("でなければならない。
	 * 引数		( 2 + 3 ) + 2
	 * 戻り値 	2 + 3
	 * @param targetArray
	 * @return	"("から")"までの配列。"("")"は含まれない。
	 */
	public static String[] getArrayBracketsEnd(String[] targetArray) {
		int i = Arrays.asList(targetArray).lastIndexOf(")");
		if(i != -1) {
			String[] resultArray = new String[i-1];
			System.arraycopy(targetArray, 1, resultArray, 0, i-1);
			return resultArray;
		}
		throw new NumberFormatException("括弧の数が正しくありません");
	}


//	public static int calc(String[] formula) {
//		int result = 0;
//		int previousTerm = 0;
//		for(int i = 0; i < formula.length ; i++) {
//			String[] priorityArray = new String[formula.length - i];
//			System.arraycopy(formula, i, priorityArray, 0, formula.length);
//			switch (formula[i]) {
//			case "+":
//				result = previousTerm + calc(priorityArray);
//				break;
//			case "-":
//				result = previousTerm - calc(priorityArray);
//				break;
//			case "(":
//				result =+ calc(getArrayBracketsEnd(priorityArray));
//				break;
//			default:
//				if(formula.length <= 1) {
//					result = Integer.parseInt(formula[i]);
//				}
//				previousTerm = Integer.parseInt(formula[i]);
//				break;
//			}
//		}
//		return result;
//	}

//	public static int calc(String[] formula) {
//		int result = 0;
//
//		Stack<Integer> stackNumber = new Stack<>();
//		Stack<String> stackOperator = new Stack<>();
//		for(int i = 0 ; i < formula.length ; i++) {
//			if(formula[i].equals("+") || formula[i].equals("-")) {
//				stackOperator.push(formula[i]);
//			} else if (formula[i].equals("(")) {
//				calc(priorityArray,i,);
//			} else {
//				stackNumber.push(Integer.parseInt(formula[i]));
//				if(stackOperator.size() >= 2) {
//					switch (stackOperator.pop()) {
//					case "+":
//						stackNumber.push(stackNumber.pop() + stackNumber.pop());
//						break;
//					case "-":
//						stackNumber.push(stackNumber.pop() - stackNumber.pop());
//						break;
//					default:
//						break;
//					}
//				}
//			}
//		}
//	}
}
