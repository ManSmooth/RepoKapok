//642115003 Kan Katpark

public class MyPublication {
    public static void main(String[] args) {
        Publication[] myPublic = new Publication[10] ;

        myPublic[0] = new Book("(Be)ing", 444, 550, "Humankid", "Rutger Bregman") ;
        myPublic[1] = new Publication("Arrow", 300, 285, "Japanese Fairy tale") ;
        myPublic[2] = new Magazine("DC", 35, 150, "Batman", "monthly") ;
        myPublic[3] = new KidMagazine("B4K", 56, 120, "Mc'Donal Farm", "6-11") ;
        
        for(int i = 0 ; i < 10 ; i++){
            System.out.println(myPublic[i]);
        }
            
    }

}
