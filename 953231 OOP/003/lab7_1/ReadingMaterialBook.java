//642115003
class ReadingMaterialBook  extends Book{
    ReadingMaterialBook(String name , int pageNumber ) {
        super(name, pageNumber);
    }

    @Override public String toString(){
        return "Reading Material Book :  " + super.getName() + "  has " + super.getPageNumber() + "  pages " ;
    }
}