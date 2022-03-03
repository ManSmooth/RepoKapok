//642115003 Kan Katpark

public class Publication {
    private String publisher ;
    private int pageNumber ;
    private double price ;
    private String title ;

    public Publication(String publisher , int pageNumber , double price , String title ){
        this.publisher = publisher ;
        this.pageNumber = pageNumber ;
        this.price = price ;
        this.title = title ;
    }

    public String getPublisher() {
        return this.publisher ;
    }

    public int getPageNumber() {
        return this.pageNumber ;
    }

    public double getPrice() {
        return this.price ;
    }

    public String getTitle() {
        return this.title ;
    }
    
    public String toString() {
        return "(Publication) Title: " + this.title+" Publisher: "+ this.publisher + " Price: " + this.price + " Page number: "+ this.pageNumber ;
    }

}