package collectionClassifier;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionClassifier {

	public static void main(String[] args) {
		Collection<?>[] collections = {
				new HashSet<String>(),
				new ArrayList<BigInteger>(),
				new HashMap<String,String>().values()
		};

		for(Collection<?> collection : collections ) {
			System.out.println(classify(collection));
		}
	}

	public static String classify(Set<?> a) {
		return "Set";
	}

	public static String classify(List<?> a) {
		return "List";
	}

	public static String classify(Collection<?> a) {
		return "Unknown Collection";
	}
}
