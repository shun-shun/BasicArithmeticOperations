package effectiveJava;

//ビルダーパターンの紹介
//14ページを参照
public class NutritionFacts {

	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;

	public static class Bulider {
		private final int servingSize;
		private final int servings;

		private int calories = 0;
		private int fat = 0;
		private int carbohydrate = 0;
		private int sodium = 0;

		public Bulider(int servingSize, int servings) {
			this.servings = servings;
			this.servingSize = servingSize;
		}

		public Bulider calories(int val) {
			calories = val;
			return this;
		}

		public Bulider fat(int val) {
			fat = val;
			return this;
		}

		public Bulider sodium(int val) {
			sodium = val;
			return this;
		}

		public Bulider carbohydrate(int val) {
			carbohydrate = val;
			return this;
		}

		public NutritionFacts bulid() {
			return new NutritionFacts(this);
		}

	}

	private NutritionFacts(Bulider bulider) {
		servingSize = bulider.servingSize;
		servings = bulider.servings;
		calories = bulider.calories;
		fat = bulider.fat;
		sodium = bulider.sodium;
		carbohydrate = bulider.carbohydrate;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof NutritionFacts)) {
			return false;
		}
		NutritionFacts facts = (NutritionFacts) o;
		return facts.calories == calories
				&& facts.carbohydrate == carbohydrate
				&& facts.fat == fat
				&& facts.servings == servings
				&& facts.servingSize == servingSize
				&& facts.sodium == sodium;
	}

	@Override
	public int hashCode() {
		int result = 22;
		result = 17 * result + servings;
		result = 17 * result + servingSize;
		result = 17 * result + fat;
		result = 17 * result + sodium;
		result = 17 * result + calories;
		return result;
	}

}
