//642115003 Kan Katpark

public class Book extends Publication {
    private String author ;

    public Book(String publisher , int pageNumber , double price , String title , String author) {
        super(publisher, pageNumber, price, title);
        this.author = author ;
    }

    @Override public String toString() {
        return "(Book) Title: " + super.getTitle()+" Author: "+ this.author +" Publisher: "+ super.getPublisher() + " Price: " + super.getPrice() + " Page number: "+ super.getPageNumber()  ;
    }

}
