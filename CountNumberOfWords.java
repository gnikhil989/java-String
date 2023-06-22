package String;

public class CountNumberOfWords {

	public static void main(String[] args) {
		String s1 = "  Hii   good morning";
		System.out.println(countWords(s1));

	}

	public static int countWords(String s) {
		int count;
		if (s.charAt(0) == ' ') {
			count = 0;
		} else {
			count = 1;
		}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
				count++;

			}
		}
		return count;

	}
}
