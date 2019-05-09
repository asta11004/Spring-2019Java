package day40_2_evening_session;

import day41_2_evening_session.Student;

public class ForeignStudentTesterClass {
	public static void main(String[] args) {
		///not available before import
		Student idris = new Student();
		idris.major = "JAVA GURU";
		//default instance fields are not visible in the different package
		//idris.name 
//		not visible in the different package, unless inherit that class
//		even though we imported this class, instance fields will not be visible
//		idris.batchNumber
	}
}
