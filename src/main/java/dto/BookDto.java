package dto;

public class BookDto {
	
	String id;
	String title;
	String publisher;
	String isbn;
	String author;
	String date;
	
	public BookDto(String id,String title, String publisher, String isbn, String author, String date ) {
		super();
		this.id = id;
		this.title = title;
		this.publisher = publisher;
		this.isbn = isbn;
		this.author = author;
		this.date = date;
	}

	public String getid() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String gettitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getpublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getisbn() {
		return isbn;
	}
	public void setisbn(String isbn) {
		this.isbn = isbn;
	}
	public String getauthor() {
		return author ;
	}
	public void setauthor(String author) {
		this.author = author;
	}
	public String getdate() {
		return date ;
	}
	public void setdate(String date) {
		this.date = date;
	}
}