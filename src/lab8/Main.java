package lab8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Book{
	private int bookId;
	private String bookNam;
	private String autherName;
	private int Rupees;
	public Book(int bookId, String bookNam, String autherName ,int Rupees) {
		super();
		this.bookId = bookId;
		this.bookNam = bookNam;
		this.autherName = autherName;
		this.Rupees=Rupees;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBookId() {
		return bookId;
	}
	public String getBookNam() {
		return bookNam;
	}
	public String getAutherName() {
		return autherName;
	}
	public int getRupees() {
		return Rupees;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookNam=" + bookNam + ", autherName=" + autherName + ", Rupees=" + Rupees
				+ "]";
	}
	
	
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	 Book bk=new Book();
	 
	 ArrayList<Book> bk=new ArrayList<Book>();
	 
	 bk.add(new Book(1,"The World: A Family History","British historian Simon Sebag Montefiore",300));
	 bk.add(new Book(2,"Spare","J. R. Moehringer",500));
	 bk.add(new Book(3,"Victory City","Salman Rushdie",200));
	 bk.add(new Book(4,"India’s vaccine Growth story","Sajjan singh Dev",600));
	 
//	 for(Book book:bk) {
//		 System.out.println("BookId : "+book.getBookId());
//		 System.out.println("BookName : "+book.getBookNam());
//		 System.out.println("AutherName : "+book.getAutherName());
//		 System.out.println();
//	 }
	 Collections.sort(bk, Comparator.comparingInt(Book::getRupees));
	 bk.forEach(System.out::println);

	}

}
