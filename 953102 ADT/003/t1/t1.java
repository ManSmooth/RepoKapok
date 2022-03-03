// Kan Katpark 642115003
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
class t1 {
    public static void main(String[] args) {
        //Declare storage valiable
        double[][] storage = new double[99][2];
        double[] sumRowList = new double[99] ;

        //Set csv file location 
        String location = "t1.csv";
        File file = new File(location);

        //Pre:
        //      Storage to collect the data 2d double array
        //      CSV file
        //Post:
        //      Copy data in csv to storage valiable    
        assignData(storage, file);

        //Pre :
        //      Storage where the data is collected 
        //      sumArray to keep return value
        //Post:
        //      Return summation of Storage varibale
        sumRowList = sumData(storage);

        //Pre :
        //      Summation list array 
        //Post:
        //      Display top and bottom 5 of list
        displaySum(sumRowList);

        //Pre :
        //      Summation list array 
        //Post:
        //      Return summation of value in array
        double sumAllRow = getSumAllRow(sumRowList);

        //Display summation
        System.out.println("Summation of all row : " + sumAllRow);
        
        
    } //end main

    public static void assignData(double[][] storage, File file){
        double temp1 ;
        double temp2 ;
         
        try{
            int count = 0;

            //Read data     
            Scanner scan = new Scanner(file) ;
            
            while(scan.hasNext()){
                
                //Tokenizer Cut the "," between data
                StringTokenizer token = new StringTokenizer(scan.next(),",");
                temp1 = Double.parseDouble(token.nextToken());
                temp2 = Double.parseDouble(token.nextToken());

                //Assign data into storage valiable
                storage[count][0]= temp1;
                storage[count][1]= temp2;
                
                count++;
            }

            //close csv file
            scan.close();
        }catch(FileNotFoundException err){
            //Show error
            System.out.println(err);
        }
    }

    public static void displayData(double[][] storage){
        for(int i = 0 ; i < 99; i++){
            for(int j =0 ; j<2;j++){
                System.out.print(storage[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static double[] sumData(double[][] storage){
        double[] returnValue = new double[99];
        double temp = 0;
        //Sum all value in each row
        for(int i = 0 ; i < 99; i++){
            for(int j =0 ; j<2;j++){
                temp += storage[i][j];
            }
            returnValue[i] = temp ;
            temp = 0 ;
        }

        return returnValue;
    }

    public static void displaySum(double[] sumRowList){
        System.out.println("Sum of first 5 rows");
        for(int i=0;i<5;i++){
            System.out.println(sumRowList[i]);
        }
        System.out.println("Sum of last 5 rows");
        for(int i=94;i<99;i++){
            System.out.println(sumRowList[i]);
        }
    }

    public static double getSumAllRow(double[] sumRowList){
        double sum = 0;
        for(int i = 0 ; i < sumRowList.length;i++){
            sum += sumRowList[i] ;
        }
        
        return sum;
    }

}