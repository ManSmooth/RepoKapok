import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;

public class Assignment2 {
    public static void main(String[] args) throws FileNotFoundException {
        //Set system to encode with UTF-8
        System.setProperty("file.encoding", "UTF-8");

        //Declare start time
        long startTime = System.currentTimeMillis() ;

        //Read file location from input args 
        File file = new File(args[0]);
        Scanner sc = new Scanner(file);

        int lineCount = 0;
        int tokenCount = 0;
        int palinCount = 0 ;
        
        int longestLength = 0;
        String longestText = "" ;
        int tokenLengthCount = 0 ;
        
        StringTokenizer token = null ;
        //Check for the input line and count it

        
        while (sc.hasNextLine()) {
            token = new StringTokenizer(sc.nextLine(), " ");
            tokenCount += token.countTokens();

            //Check for the token inside each line
            while(token.hasMoreTokens()){
                String text = token.nextToken() ;

                tokenLengthCount += text.length();

                if(text.length() >= longestLength){
                    longestLength = text.length();
                    longestText = text ;
                }

                if(isPalin(text)){
                    palinCount++;
                }

            }

            lineCount++;
            
        }

        sc.close();

        double avgToken = (tokenLengthCount*1.00/tokenCount)  ;

        //Display zone
        long endTime = System.currentTimeMillis() ;
        System.out.println("Number of character : " + tokenLengthCount);
        System.out.println("Number of palindrome : " + palinCount);
        System.out.println("Number of tokens : " + tokenCount);
        System.out.println("Number of new line : "+ lineCount);
        System.out.println("Length of longest token : " + longestLength+": " + longestText);
        System.out.printf("Average token length : %.2f \n",avgToken );

        //display time
        System.out.println("Total Time to execute program : " + (endTime-startTime) + " MiliSec." );

    }//end main

    //Check palindrome function return boolean
    public static boolean isPalin(String text){
        int middle = text.length()/2;
        for(int i = 0 ; i < middle ;i++){
            char first = text.charAt(i);
            char last = text.charAt(text.length()-i-1);
            
            if(first != last) return false;

        }
        return true;
    }//end function 
}