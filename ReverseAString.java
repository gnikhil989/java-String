package String;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "morning";
		String rev = "";
		for (int i = 0; i < s1.length(); i++) {
			rev = s1.charAt(i) + rev;
		}
		System.out.println(rev);

	}

}
