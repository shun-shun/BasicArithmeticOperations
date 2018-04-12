package basicArithmeticOperations;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class BasicArithmeticOperationsVer3 {
	public static void main(String[] args) {

		String input = "(10+20)*(30-40)+50/2";
		System.out.println(parseExpression(input));
	}

	static final Map<Character, Integer> rpnRank = new HashMap<Character, Integer>() {
		{
			put('(', 2); //※数値が高いほど、優先順位が高いとする
			put('+', 1);
			put('-', 1);
			put(')', 0);
		}
	};

	/**<h1>数式をパースして計算する</h1>
	 * <p>逆ポーランド法で計算する。使える演算子は四則演算と括弧のみ。
	 * <br>スペースを含まない "(10+20)*30-(40+50)/2" のような式。空白文字は全て除去される。</p>
	 * @param expression ： 数式の文字列
	 * @return<b>int</b> ： 計算値
	 */
	public static final int parseExpression(final String expression) {
		final Deque<Character> stack = new ArrayDeque<Character>();
		final Deque<Integer> val = new ArrayDeque<Integer>();

		String input = expression.replaceAll("\\s+", ""); //空白文字を取り除く
		input = "(" + input + ")"; //末尾に")"を付けることで、最後にスタックを吐き出させる

		String tmp = "";
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if ('0' <= c && c <= '9') {
				tmp += c; //数字１文字ずつのため
			} else {
				if (!tmp.equals("")) {
					val.push(Integer.parseInt(tmp));
					tmp = "";
				}

				while (!stack.isEmpty() && rpnRank.get(stack.peek()) >= rpnRank.get(c) && stack.peek() != '(') {
					char e = stack.pop();
					int a = val.pop();
					int b = val.pop();
					if (e == '*') {
						val.push(b * a);
					} else if (e == '/') {
						val.push(b / a); //div/0 に注意
					} else if (e == '+') {
						val.push(b + a);
					} else if (e == '-') {
						val.push(b - a);
					}
				}
				if (c == ')') {
					stack.pop(); //'('
				} else {
					stack.push(c);
				}
			}
		}

		return val.pop();
	}
}
