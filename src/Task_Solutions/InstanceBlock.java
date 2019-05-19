package Task_Solutions;

public class InstanceBlock {
	
	public InstanceBlock() {
		System.out.println("This is Constructor");
	}
	
	static int a;
			int b;
			
			{
				a=20;
				b=30;
			}
			{
				System.out.println("This is instance block");
			}
			
			static {
				System.out.println("This is static block");
			}
			
			public static void main(String[] args) {
				
				  InstanceBlock obj= new InstanceBlock();
				  System.out.println(a);
				  InstanceBlock obj2= new InstanceBlock();
				  
				  
			}
	

}
