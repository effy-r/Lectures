class Book {

	private String author, tittle;
	private int pages;

	public Book(String author, String tittle, int pages) {
		this.author = author;
		this.tittle = tittle;
		this.pages = pages;

	}

	Book(String tittle) {
		this.tittle = tittle;
		this.author = "J. K Rolling ";
		this.pages = 300;
	}

	Book() {
		this("Cursed child");
		display();
	}

	public void display() {
		System.out.println("New book by  " + author + ", which contains "
				+ pages + " pages and is called " + tittle);
	}

	/*
	 * public String getAuthor() { return author; }
	 * 
	 * public String setTittle() { return this.author = author; }
	 * 
	 * public String getTittle() { return tittle;
	 * 
	 * }
	 * 
	 * public int getPages() { return pages; }
	 */

}

public class Task_Constructor {

	
	public static void main(String[] args) {
		

		Book book1 = new Book("Rolling", "Harry Potter", 500);
		book1.display();
		Book book2 = new Book();
	}

}
