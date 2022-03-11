package week3.day1;

public class Classroom1 {

	public static void main(String[] args) {
		String str = "TestLeaf is located in Teynampet and above taccobell.";
		String str1 = str.toLowerCase();
		String[] sub = str1.split("\\s");
		for(int i=0;i<sub.length;i++) {
			if(sub[i].startsWith("t"))
				System.out.println(sub[i]);
		}
	}
}

