//642115003
class Novel extends Book{
    private String mainCharacter ;
    private String genre ;

    Novel(String name , int pageNumber , String mainCharacter,  String genre) {
        super(name, pageNumber);
        this.mainCharacter = mainCharacter ;
        this.genre = genre ;
    }

    public String getGenre(){
        return this.genre ;
    }

    public String getMainCharacter(){
        return this.mainCharacter ;
    }

    @Override public String toString(){
        return  "Novel "+this.genre+" :" + super.getName() + "  has " + super.getPageNumber() + "  pages \nMain Character :" + this.mainCharacter ;
    }
}