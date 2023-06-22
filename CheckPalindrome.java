package String;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "malayalam";
		boolean b = ispanlindrome(s1);
		System.out.println(b);
	}

	public static boolean ispanlindrome(String st){
		int l = st.length() - 1;
		
		for (int i = 0; i < st.length() / 2; i++) {
			if (st.charAt(i) != st.charAt(l-i)) {	
				return false;
			} 
		}return true;
	}
}
