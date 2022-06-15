//642115003 Kan Katpark

public class KidMagazine extends Publication {
    private String recommendAge ;

    public KidMagazine(String publisher , int pageNumber , double price , String title , String recommendAge) {
        super(publisher, pageNumber, price, title);
        this.recommendAge = recommendAge ;
    }

    @Override public String toString() {
        return "(Kid Magazine) Title: " + super.getTitle()+" Recommend Age: "+ this.recommendAge +" Publisher: "+ super.getPublisher() + " Price: " + super.getPrice() + " Page number: "+ super.getPageNumber()  ;
    }
}
