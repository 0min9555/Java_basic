package ch15.sec02;

public class Book {
	private String bookNo;
	private String bookName;
	private String bookAuthor;
	private int bookPrice;
	private String bookDate;
	private String bookPublisher;
	
	public Book(String bookNo, String bookName, String bookAuthor, int bookPrice, String bookDate,
			String bookPublisher) {
		super();
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookDate = bookDate;
		this.bookPublisher = bookPublisher;
	}

	@Override
	public String toString() {
		return bookNo + "\t" + bookName + "\t\t" +
				bookAuthor + "\t\t" + bookPrice + "\t" + 
				bookDate + "\t\t" + bookPublisher;
	}
	

}
