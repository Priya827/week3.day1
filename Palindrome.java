package week3.day1;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[]args)
	{
		String s = "madam";
		char[] ch;
		String rev = "";
		ch = s.toCharArray();
		Arrays.toString(ch);
		for(int i=ch.length-1; i>=0; i--)
		{
			rev = rev + String.valueOf(ch[i]);
		}
		System.out.println(rev);
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("panlindrome successful");
		}
	}
}

