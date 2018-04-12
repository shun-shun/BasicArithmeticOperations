package effectiveJava;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Face {

	enum enumFace {
		ONE,
		TWO,
		THREE,
		FOUR,
		FIVE,
		SIX
	}
	public static void main(String[] args) {
		Collection<enumFace> faces = Arrays.asList(enumFace.values());
		for(Iterator<enumFace> i = faces.iterator(); i.hasNext();) {
			for(Iterator<enumFace> j = faces.iterator(); j.hasNext();) {
				System.out.println(i.next() + ":" + j.next());
			}
		}
	}

}
