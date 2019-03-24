package day16;

public class StartWith {

	//str.indexOf("bc")==0   ====>>> str.startWith("bc") 
	public static void main(String[] args) {

		String str = "Busra";
		
		System.out.println(  str.startsWith("B")     );
		System.out.println(  str.startsWith("ABC")     );
		
		boolean b = str.startsWith("Bu"); 
		
		if(b) {
			System.out.println("Successful");
		}else {
			System.out.println("NOT A Bu");
		}
		
		
		
		

		
		
	}

}
