import java.util.*;
import java.io.*;
class Ex1 {
    public static void main(String[] args)  throws IOException{
        Vector<String> collection = new Vector<String>() ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input anything or quit");

        String input = sc.nextLine();

        while(!(input.equals("quit") || input.equals("Quit")) ){
            collection.addElement(input);
            System.out.println("Input anything or quit");
            input = sc.nextLine() ;
        }

        //Display size of the collection
        displayCollectionSize(collection);

        //Display data inside the collection
        displayData(collection);

        //Display first line of the collection
        System.out.println("First line : "+ collection.get(0));

        //Display reverse data inside of the collection
        displayReverseData(collection);

    } //end main

    public static void displayCollectionSize(Vector<String> collection){
        System.out.println("Data size is "+ collection.size());
    }//end function


    public static void displayData(Vector<String> collection){
        for(int i = 0 ; i < collection.size() ; i++){
            System.out.println(collection.get(i));
        }
    }//end function


    public static void displayReverseData(Vector<String> collection){
        System.out.println("Revert data");

        for(int i = collection.size() ; i > 0 ; i--){
            System.out.println(collection.get(i));
        }
    }//end function

}