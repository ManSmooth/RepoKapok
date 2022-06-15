import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.StringTokenizer; 
import java.util.Scanner; 
public class Tuto01 { 
    public static void main(String args[]) throws FileNotFoundException {  
        double mylist[][] = new double[100][2]; 
        StringTokenizer token;

    File f = new File("t1.csv"); 
    // read the input file 
    Scanner myScan = new Scanner(f);
    // read line by line 
    int i = 0;
    while(myScan.hasNext()) { 
        // keep reading until the end of file 
        // store each value in each column to the data structure 
        String dataLine = myScan.nextLine(); 
        // you are going to tokenize the data such that it will seperate into 2 String values 
        // parse the string to double 
        token = new StringTokenizer(dataLine, ","); 
        double a = Double.parseDouble(token.nextToken()); 
        double b = Double.parseDouble(token.nextToken()); 
            mylist[i][0] = a;
            mylist[i][1] = b;
            i++;
        }// end outer loop 
        sumFiveFirst(mylist);
        sumFiveLast(mylist);
        sumAll(mylist);
        System.out.println("End of program");
        myScan.close();
        }
        public static void sumFiveFirst(double[][] array) {
            System.out.println("Sum of 5 first lines : ");
            double sum;
            for (int i = 0;i<5;i++){
                sum = 0;
                for (int k = 0;k<2;k++){
                    sum += array[i][k];
                }
                System.out.println(sum);
            }
        }
        public static void sumFiveLast(double[][] array) {
            System.out.println("Sum of 5 last lines : ");
            double sum;
            for (int i = 94;i<99;i++){
                sum = 0;
                for (int k = 0;k<2;k++){    
                    sum += array[i][k];
                }
                System.out.println(sum);
            }
        }
        public static void sumAll(double[][] array) {
            System.out.print("Sum of every line : ");
            double sum = 0;
            for (int i = 0;i<99;i++){
                for (int k = 0;k<2;k++){
                    sum += array[i][k];
                }
            }
            System.out.println(sum);    
        }
    }// end class main