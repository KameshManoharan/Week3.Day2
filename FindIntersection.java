package Week3.Day2;

public class FindIntersection {
	public static void main(String[] args) {
		int[] a = {3,2,11,4,6,7};
		int[] b = {1,2,8,4,9,7};
		
		System.out.print("Values in Array1: ");
		for (int i=0;i<a.length;i++) System.out.print(a[i] +" ");
		System.out.println();
		System.out.print("Values in Array2: ");
		for (int i=0;i<a.length;i++) System.out.print(b[i] +" ");
		System.out.println();
		
		System.out.print("Matching values in Array1 & Array2: ");
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<b.length;j++) {
				if(a[i]==b[j]) System.out.print(a[i] +" ");
			}
		}
	}
}
