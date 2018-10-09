package array;

public class Array {
	public static void main (String[] args) {
		int[] a;
		a = new int [3];
		a[0]=3;
		a[1]=2;
		a[2]=1;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		//to divide it in the parts you want use split
		String b = "943-556610";
		String[] part = b.split("-");
		System.out.println("this is the 1st part: " +part[0]);
		System.out.println("this is the 2nd part: " +part[1]);
		
		//to divide a string's characters one by one use toCharAway
		String c = "hello";
		char[] ch= c.toCharArray();
		for (int i=0;i<5;i++) {
		System.out.println(ch[i]);
		}
	}
}
