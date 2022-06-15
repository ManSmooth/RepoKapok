//642115003 Kan Katpark

import java.util.*;
import java.io.*;

public class Q1 {
    public static void main(String[] args) {
        double total , average ;        
        Scanner in = new Scanner(System.in) ;

        System.out.print("Enter file name: ");
        String name = in.next() ;
        
        File file = new File(name) ;
        
        try{
            int count = 0 ;
            total = 0 ;
            Scanner sc = new Scanner(file);
            while(sc.hasNext()){
                count++ ;
                total += Double.parseDouble( sc.next() ) ;
            }
            average = total / count ;
            sc.close();

            System.out.println(total);
            System.out.println(average);

        }catch(FileNotFoundException err){
            System.out.println(err);
        }


    }
}