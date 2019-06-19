package officehour_619;

public class PersonTester {

	
	// a method that return a Person object 
	public Person getPerson() {
		System.out.println("PersonTester getPerson");
		return new Person(); 
	}  
	
	public long getNumber() {
		System.out.println("PersonTester  getNumber");
		return 100l ; 
		
	}

}

class DoctorTester extends PersonTester{
	
	
//	@Override
//	public Person getPerson() {
//		System.out.println("DoctorTester getPerson");
//		return  new Doctor(); 
//	}  
	@Override
	public long getNumber() {
		System.out.println("DoctorTester  getNumber");
		return 10 ; 
		
	}
	// overriding method can have sub class type 
	// of super class return type 
	// this is called covariant return type 
	@Override
	public  Doctor  getPerson() {
		System.out.println("DoctorTester getPerson");
		return new Doctor(); 
	}
	
}
