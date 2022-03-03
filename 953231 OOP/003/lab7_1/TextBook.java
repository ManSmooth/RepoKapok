//642115003
class Textbook extends Book{
    private String content;

    Textbook(String name , int pageNumber  , String content) {
        super(name, pageNumber );
        this.content = content ;
    }
    
    public String getContent(){
        return this.content ;
    }

    @Override public String toString(){
        return "Textbook :  " + super.getName() + "  has " + super.getPageNumber() + "  pages " ;
    }

}