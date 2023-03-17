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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	
}