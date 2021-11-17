package Week3.Day2;

public class RemoveDuplicatesUsingFor {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		System.out.println("Original Text:");
		System.out.println(text);
		System.out.println();
		System.out.println("Text after removing duplicate words:");
		String[] text1 = text.split(" ");
		
		for (int i=0;i<text1.length;i++) {
			for (int j=i+1;j<text1.length;j++) {
				if (text1[i].equals(text1[j])) text1[j]=" ";
			}
			System.out.print(text1[i] +" ");
		}
	}
}
