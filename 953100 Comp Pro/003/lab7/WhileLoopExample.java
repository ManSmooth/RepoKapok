public class WhileLoopExample {
    public static void main(String[] args) {
        int count = 1 ;
        while(count <= 100){
            System.out.print(count+" ");
            if(count % 10 == 0 ){
                System.out.print("\n");
            }
            
            count++ ;
        }
    }
}