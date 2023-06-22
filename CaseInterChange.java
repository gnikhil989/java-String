package String;

public class CaseInterChange {

	public static void main(String[] args) {

		String s1 = "Hii Good Morning";
		System.out.println(caseInterChange(s1));

	}

	public static String caseInterChange(String s) {
//			step 1: convert to array
		char ch[] = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char) (ch[i] + 32);
			} else {
				if (ch[i] >= 'a' && ch[i] <= 'z') {
					ch[i] = (char) (ch[i] - 32);
				}
			}
		}
		String newSentence = new String(ch);
		return newSentence;
	}

}
