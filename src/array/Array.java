package array;

public class Array {
	public static void main (String[] args) {
		//define the value
		int[] a;
		//say how many arrays you want
		a = new int [3];
		//give each of them the value we want
		a[0]=3;
		a[1]=2;
		a[2]=1;
		//show them
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		//to divide it in the parts you want use split
		//define the value we want, writing something we can recognize as divider of the sentence (in my case "-")
		String b = "943-556610";
		//say the program what divides the sentences and give the different values to a new string i've create
		String[] part = b.split("-");
		//we can print it in the screen all by once or separately using the name of the string we assigned followed by [0] for the 1st part, [1] for the 2nd and more...
		System.out.println("this is the 1st part: " +part[0]);
		System.out.println("this is the 2nd part: " +part[1]);
		
		//to divide a string's characters one by one use toCharAway
		//define the String
		String c = "hello";
		//say u want to divide all the characters one by one and save them by the name of "ch"
		char[] ch= c.toCharArray();
		//we print this the same way that the others
		//i've made a for variable telling the program to repeat the process of showing the next character for 5 times 
		for (int i=0;i<5;i++) {
		System.out.println(ch[i]);
		}
	}
}
