package Week3.Day2;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesUsingCollection {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1",result = "";
		System.out.println("Original Text:");
		System.out.println(text);
		String[] text1 =  text.split(" ");
		
		LinkedHashSet<String> txt = new LinkedHashSet<String>(Arrays.asList(text1));
		
		for (String txt1:txt) {
			result=result+txt1+" ";
		}
		System.out.println();
		System.out.println("Text after removing duplicate words:");
		System.out.println(result);
	}
}
