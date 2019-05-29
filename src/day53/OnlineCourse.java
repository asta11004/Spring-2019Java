package day53;
public class OnlineCourse extends Course {

	int capacity = 300; 
	
	public void showCapacity() {
		
		System.out.println( "Online Course " +  this.capacity );
		System.out.println( "Course " +  super.capacity);
		
	}
	
}
