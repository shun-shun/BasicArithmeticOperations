package bigDecimal;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class TestBigDecimal {

	public static void main(String[] args) {
		String value1 = "CodeIQ";
		String value2 = "CodeIQ";
		String value3 = new String("CodeIQ");
		String value4 = "codeIQ";

		//Stringクラスでは文字リテラルでオブジェクトを作成した場合、同一のオブジェクトを参照することになる・
		System.out.println(value1 == value2);
		System.out.println(value2 == value3);
		System.out.println(value1.equals(value3));
		System.out.println(value1 == value4);

		DecimalFormat decimalFormat = new DecimalFormat(",###.#");
		System.out.println(decimalFormat.format(new BigDecimal(0.0)));
	}

}
