public class Pyramid {
    public static void main(String[] args) {
        int temp ;
        int rows = 8;
        for(int i = 1; i<= rows;++i){
             for(int space = 1 ; space <= rows-i;++space){
                 System.out.print("\t");
             }
            
            for(int k = 0;k<i;++k){
                temp = (int)(Math.pow(2,k)) ;

                System.out.print("\t");
                System.out.print(temp);
    
                
            }
            for(int l = i-2 ; l >=0;--l){
                temp = (int)(Math.pow(2,l)) ;
                if(i != 1){
                    System.out.print("\t");
                    System.out.print(temp);
                    
                }

            }
              System.out.println("");
            }
        }
    }


