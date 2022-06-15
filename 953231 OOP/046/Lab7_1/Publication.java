package Lab7_1;

public class Publication {
    private String publisher;
    private int pages;
    private double price;
    private String title;

	public String getPublisher() {
		return this.publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPages() {
		return this.pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


    public Publication(String publisher, int pages, double price, String title){
        this.publisher = publisher;
        this.pages = pages;
        this.price = price;
        this.title = title;
    }

    public void print() {
        System.out.printf("Publisher: %s\nTitle: %s\nPages: %d\nPrice: %.2f\n", publisher, title, pages, price);
    }
}
