package Week3.Day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String text = "I am a software tester", txt="";
		String[] text1 = text.split(" ");
		
		for ( int i=0;i<text1.length;i++) {
			if(i%2==1) 
				txt = txt + new StringBuilder(text1[i]).reverse().toString() + " ";
			else 
				txt = txt + text1[i] + " ";
		}
		System.out.println(txt);
	}

}
