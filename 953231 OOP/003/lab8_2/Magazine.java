//642115003 Kan Katpark

public class Magazine extends Publication {

    private String publicationUnit ;

    public Magazine(String publisher , int pageNumber , double price , String title , String publicationUnit) {
        super(publisher, pageNumber, price, title);
        this.publicationUnit = publicationUnit ;
    }

    @Override public String toString() {
        return "(Magazine) Title: " + super.getTitle()+" Publication Unit: "+ this.publicationUnit +" Publisher: "+ super.getPublisher() + " Price: " + super.getPrice() + " Page number: "+ super.getPageNumber()  ;
    }

}
