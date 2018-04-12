package effectiveJava;

import java.util.Set;

public class Text {
	public enum Style {
		BOLD,
		ITALIC,
		UNDERLINE,
		STRIKETHROUGH
	}

	public static final int STYLE_BOLD = 1 << 0; // 1
	public static final int STYLE_ITALIC = 1 << 1; // 2
	public static final int STYLE_UNDERLINE = 1 << 2; // 4
	public static final int STYLE_STRIKETHROUGH = 1 << 3; // 8

	public void applyStyles(int styles) {
		System.out.println(styles);

	}
	public void applyStyles(Set<Style> styles) {
		System.out.println(styles);
	}
}
