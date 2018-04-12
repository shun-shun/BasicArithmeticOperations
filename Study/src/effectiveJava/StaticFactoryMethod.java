package effectiveJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import effectiveJava.Text.Style;

public class StaticFactoryMethod {

	public static void main(String[] args) {
		boolean flg = false;
		System.out.println(Boolean.valueOf(flg));

		//ビルダーパターンの確認
		NutritionFacts facts = new NutritionFacts.Bulider(240, 8).carbohydrate(8).calories(2).fat(0).bulid();
		NutritionFacts facts2 = new NutritionFacts.Bulider(240, 8).carbohydrate(8).calories(2).bulid();
		NutritionFacts facts3 = null;

		//singletonの確認
		Elvis elvis = Elvis.getInstance();
		Elvis elvis2 = Elvis.getInstance();
		System.out.println(elvis.equals(elvis2));

		EnumSingleton enumSingleton = EnumSingleton.getInstance();
		System.out.println(enumSingleton.getField());
		EnumSingleton enumSingleton2 = EnumSingleton.getInstance();
		System.out.println(enumSingleton.equals(enumSingleton2));

		Stack stack = new Stack();
		for (int i = 0; i < 10000; i++) {
			stack.push("hogehoge");
		}
		for (int i = 0; i < 10000; i++) {
			System.out.println(stack.pop());
		}
		Runtime.getRuntime().gc();
		System.runFinalization();
		System.out.println(enumSingleton instanceof EnumSingleton);

		System.out.println(facts == facts2);
		System.out.println(facts.equals(facts2));
		System.out.println(facts.equals(facts3));
		System.out.println(facts.hashCode());
		System.out.println(facts.hashCode() == facts2.hashCode());

		int a = 1;
		int b = 2;
		System.out.println(Integer.compare(a, b));

		Integer[] intArray = { 1, 2, 35, 3, 53, 67756, 2, 23, 6, 7, 788, 8 };
		Arrays.sort(intArray, Collections.reverseOrder());
		System.out.println(Arrays.asList(intArray));

		List<Integer> list = Arrays.asList(intArray);
		Collections.sort(list);
		System.out.println(list);
		Collections.unmodifiableList(list);
		//		e- は、1/10の67べき乗という意味
		System.out.println(1.23e-67);

		//自動ボクシング
		int intnumber = 10;
		Integer numInteger = new Integer(intnumber);

		//		自動アンボクシングのためヌルぽの可能があり、非推奨。
		Integer intergerNumber = 100;
		int numberInt = intergerNumber;

		double contant = PhysicalConstants.AVOGADROS_NUMBER;
		System.out.println(contant);

		String name = "hogehoge";
		Class stringClazz = name.getClass();
		System.out.println(stringClazz);

		Integer price = new Integer(108);
		Class intClazz = price.getClass();
		System.out.println(intClazz);

		Class<String> stringClazz2 = String.class;
		Class<Integer> intClazz2 = Integer.class;

		Favorites favorites = new Favorites();
		favorites.putFavorite(String.class, "Java");
		favorites.putFavorite(Integer.class, new Integer(1));
		String favorite = favorites.getFavorite(String.class);

		double earthWeight = 1.0;
		double mass = earthWeight / Planet.EARTH.surfaceGravity();
		for (Planet p : Planet.values())
			System.out.printf("Your weight on %s is %f%n",
					p, p.surfaceWeight(mass));
		System.out.println(Ensemble.DECTET.numberOfMusicians());
		System.out.println(Ensemble.SOLO.numberOfMusicians());

		System.out.println(10 << 10);

		Text text = new Text();
		text.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));
		text.applyStyles(1|2);
		text.applyStyles(1&2);
		getAllConstants(BasicOperation.class);



		Set<Integer> treeSet = new TreeSet<>();
		List<Integer> arrayList = new ArrayList<>();

		for (int i = -3; i < 3; i++) {
			treeSet.add(i);
			arrayList.add(i);
		}
		System.out.println(treeSet + "" + arrayList);

		for (int i = 0; i < 3; i++) {
			treeSet.remove(i);
			arrayList.remove((Integer)i);
		}
		System.out.println(treeSet + "" + arrayList);


		String hoge1 = "hoge";
		System.out.println(hoge1.contentEquals("hoge"));
		System.out.println(hoge1.contentEquals(new StringBuffer("hoge")));


//		引数がなくてもエラーにならないため、気付きづらい
//		System.out.println(badMin());
//		引数がないとエラーになるため、以下のメソッドの方が適切
//		System.out.println(min());
		System.out.println(min(8,3,5,7,4,4,1,233,5,67,5,2,123,54,1,0));
		Collection<Card.Suit> suits = Arrays.asList(Card.Suit.values());
		Collection<Card.Rank> ranks = Arrays.asList(Card.Rank.values());

//		List<Card> deck = new ArrayList<>();
//		for(Iterator<Card.Suit> i = suits.iterator(); i.hasNext();) {
//			for(Iterator<Card.Rank> r = ranks.iterator(); r.hasNext();) {
//				deck.add(new Card(i.next(), r.next()));
//			}
//		}

		Integer aInteger = 1;
		Integer bInteger = 1;
		System.out.println(aInteger == bInteger);

		String aString = "hoge";
		String bString = "hoge";
		System.out.println(aString == bString);

		Integer integerA = new Integer(1);
		Integer integerB = integerA;
		System.out.println(integerA == integerB);
	}


	private static <T extends Enum<T> & Operation> void getAllConstants(Class<T> opSet) {
		for (Operation op : opSet.getEnumConstants()) {
			System.out.printf("Operation: %s%n", op);
		}
	}

	private static int min(int firstArg, int...remainingArgs) {
		int min = firstArg;
		for(int arg : remainingArgs) {
			if (arg < min) min = arg;
		}
		return min;
	}

	private static int badMin(int...args) {
		if(args.length == 0) {
			throw new IllegalArgumentException();
		}
		int min = args[0];
		for(int i = 1 ; i < args.length ; i++) {
			if (args[i] < min) {
				min = args[i];
			}
		}
		return min;
	}
}
