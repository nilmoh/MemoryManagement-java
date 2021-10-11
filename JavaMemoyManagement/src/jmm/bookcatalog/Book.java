package jmm.bookcatalog;

public class Book {
	private int id;
	private String title;
	private String author;
	private Price price;
	
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public Book(int id, String title, String author, Double price) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = new Price(price);
	}
	
	public String toString() {
		return title + " by " + author;
	}
	
	//TODO: check if price is immutaable
	public Price getPrice() {
		return this.price;
	}
	
	
	// Because there is a set price method then his class is NOT immutable
	public void setPrice(Double price) {
		this.price = new Price(price);
	}
	
}
