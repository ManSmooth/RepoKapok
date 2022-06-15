//642115003
class Magazines extends Book{
    private String type ;

    Magazines(String name , int pageNumber , String type) {
        super(name, pageNumber);
        this.type = type ;
    }

    public String getType(){
        return this.type ;
    }

    @Override public String toString(){
        return "Magazine :  " + super.getName() + "  has " + super.getPageNumber()  ;
    }
}