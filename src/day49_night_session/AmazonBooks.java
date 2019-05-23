package day49_night_session;

import day49_nigth_session_2.EBook;

public class AmazonBooks {
	public static void main(String[] args) {
		PaperBook book1 = new PaperBook();
		book1.author = "Mark Twain";
		book1.setTitle("The Adventures of Tom Sawyer");
		book1.chapterCount = 33;
		book1.isHardcover = true;
		book1.price = 19.99;
		book1.pageCount = 274;
		
		System.out.println(book1);
		
//		book1 is a instance of Book class?
		// because Book is a super class for PaperBook
		//Thus, book1 is an instance of Book too.
		//instanceof this is the keyword that indicates 
		//if instance related to the class.
		//System.out.println(book1 instanceof Book);
		EBook ebook1= new EBook();
		ebook1.author = "Walter Savitch";
		//WHY ONLY author property is available?
		ebook1.setTitle("Java 8");
		System.out.println(ebook1);
		
		
		System.out.println("*****************");
		AudioBook audiobook1 = new AudioBook("Leo Tolstoy", 9.99, 120, "War and Peace");
		System.out.println(audiobook1);
	}
}
