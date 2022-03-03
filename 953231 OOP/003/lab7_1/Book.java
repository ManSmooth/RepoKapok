//642115003
class Book {
    private String name ;
    private int pageNumber ;

    Book(String name , int pageNumber ) {
        this.name = name ;
        this.pageNumber = pageNumber ;

    }

    public String getName() {
        return this.name ;
    }
    
    public int getPageNumber(){
        return this.pageNumber ;
    }

    public String toString(){
        return "Book:  " + this.name + "  has " + this.pageNumber + "  pages ";
    }
}





