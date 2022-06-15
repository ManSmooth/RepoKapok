//642115003 Kan Katpark
import java.util.*;
import java.nio.charset.*;
public class Palindrome {
    public static void main(String[] args) {
        
        System.setProperty("file.encoding", "UTF-8");
        String text;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter some word: " + Charset.defaultCharset()+" :");

        text = sc.nextLine();


        if(checkParin(text)){
            System.out.println("This is palindrome");
        }
        else{
            System.out.println("This is not palindrome");
        }
        
        
    }

    //This way will print out the inverse word 
    //Using linear search and collect the inverse word into the temp string
    //And compare the given word with temp word
    //So the bigO is O(n)
    public static boolean checkParin(String text){
        String temp = "";
        for(int i = 0 ; i < text.length() ;i++){
            temp += text.charAt(text.length() - i -1);
        }

        System.out.println( text + " : " + temp );

        if(temp.equals(text)){
            return true;
        }
        else{
            return false;
        }

    }

    // Divine length of the given word by half 
    // Then check the first element of the left half with last element of the right half
    // BIG O(n/2)
    // But this way does not keep the reverse word 
    
    // public static boolean checkParin(String text){
    //     int middle = text.length()/2;
    //     for(int i = 0 ; i < middle ;i++){
    //         char first = text.charAt(i);
    //         char last = text.charAt(text.length()-i-1);
            
    //         if(first != last) return false;

    //     }
    //     return true;
    // } 


}