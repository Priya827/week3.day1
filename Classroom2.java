package week3.day1;

public class Classroom2 {

	public static void main(String[] args) {
	
		String s = "Education";
		char[] vow = {'a','e','i','o','u'};
		int output=0;
		String n = s.toLowerCase();
		char[] c = n.toCharArray(); 
				for(int i=0;i<vow.length;i++) {
					for(int j=0;j<c.length;j++) {
		System.out.println("j"+j+"i"+i);
			if(vow[i]==c[j]) {
			System.out.println(vow[i]+" "+c[j]);
			System.out.println(output);
				output++;
				System.out.println(output);

			}
		}
		}
		System.out.println(output);
	}

}
