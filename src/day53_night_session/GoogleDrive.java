package day53_night_session;

public class GoogleDrive extends CloudStorage {
	private boolean hasGmail;
	public static String region;

	public GoogleDrive(int capacity, double price, String username, String password, boolean hasGmail) {
		super(capacity, price, username, password);
		this.hasGmail = hasGmail;
	}
	// not overriding any more, because original method has different signature. 
	 // it's overloading, same method name different parameter list
	public void printInfo(int i) { 
		System.out.println("Info about cloud storage..");
	}
	
	public static void changeRegion(String region){
		System.out.println("GoogleDrive class!");
		GoogleDrive.region = region;
	}

	@Override
	public String toString() {
		return "GoogleDrive [capacity=" + getCapacity()
		+ ", price=" + getPrice() 
		+ ", username=" + getUsername()
		+ ", password=" + getPassword() 
		+ ", hasGmail=" + hasGmail + "]";
	}

}
