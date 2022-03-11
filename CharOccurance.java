package week3.day1;

public class CharOccurance {

	public static void main(String[] args)
	{
		String str = "Welcome to chennai";
		int count = 0;
		char[] c = str.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i] == 'c') {
				count++;
			}
		}
		System.out.println("Count:"+count);
		
	}
}



