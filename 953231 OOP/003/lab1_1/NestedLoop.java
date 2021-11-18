//642115003 Kan Katpark
public class NestedLoop {
    public static void main(String[] args) {

        //col header
        System.out.print("\t");
        for(int k =0; k < 10 ; k++){
            System.out.print(k + "\t");
            if(k==9) System.out.println();
        }

        String row = "" ;
        for(int i = 0 ; i < 10 ; i++){
            row += i + "\t";
            for(int j = 0;j < 10; j++){
                row += j*i + "\t";
                if(j==9) row += "\n" ;
            }

        }

        System.out.println(row);


        
    }
}
