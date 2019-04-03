package officehours;

public class April1 {
	public static void main(String[] args) {
		int counter = 0;
		String str = "python k java python blueberry";
//		System.out.println(str.indexOf("Java"));
//		System.out.println(str.indexOf("Java") == str.lastIndexOf("Java"));
		for (int i = 0; i <= str.length()-4; i++) {
			System.out.println(str.substring(i, i+4));
			if(str.substring(i, i+4).equals("java")) {
				counter++;
			}
		}
//		System.out.println(str.length());
//		System.out.println(str.substring(6, 10));
//		System.out.println(counter);
	}
	
}
