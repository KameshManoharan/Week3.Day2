package Week3.Day2;

public class Palindrome {

	public static void main(String[] args) {
		String st = "Madam", strev = "";
		char ch;

		for (int i=0; i<st.length(); i++){
			ch = st.charAt(i);
			strev = ch+strev;
		}
		
		if (st.equalsIgnoreCase(strev)) System.out.print("Given String '" +st +"'" +" is a Palindrome");
		else System.out.print("Given String '" +st +"'" +" is not a Palindrome");
	}

}
