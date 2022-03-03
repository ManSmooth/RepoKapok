//642115003 Kan Katpark
import java.util.* ;

class MyLinearSearch{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;

        ArrayList<Integer> list = new ArrayList<>() ;
        assignData(list, 100);
        System.out.println(list);

        System.out.print("Enter key number: ");

        int key = in.nextInt() ;
        in.close();

        int result = linearSearch(list,key);

        if(result == -1){
            System.out.println("Number not found");
        }else{
            System.out.println("Number found on index "+ result );
        }
        
    }

    public static void assignData(ArrayList list , int i ){
        for(int j = 0 ;  j < i ; j++){
           int temp = (int)(Math.random() * 100 );
           list.add(temp) ; 
        }
    }

    public static <E extends Comparable<E>> int linearSearch(ArrayList<E> list, E key) {
        for(int i = 0 ; i <  list.size() ; i++){
            if( list.get(i).equals(key) ) {
                return i ;
            }
        }
        return -1 ;
    }
    

}
