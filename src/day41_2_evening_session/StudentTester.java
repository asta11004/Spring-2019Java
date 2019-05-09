package day41_2_evening_session;

public class StudentTester {
	public static void main(String[] args) {
		Student emine = new Student();
		emine.setSSN(123456789);
		//field is not visible because it's private instance 
		//emine.ssn
		emine.batchNumber = 11;
		emine.name = "Emine";
	}
}
