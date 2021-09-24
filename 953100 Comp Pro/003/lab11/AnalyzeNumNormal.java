public class AnalyzeNumNormal{
    public static void main(String[] args){
       java.util.Scanner input = new java.util.Scanner(System.in);
       System.out.print("Enter number of items : ");
       int n = input.nextInt();
       double[] numbers = new double[n];
       double sum = 0;
       
       for(int i = 0 ; i < numbers.length;i++){
           numbers[i] = (int)(Math.random()*100);
       }

       for(int i = 0 ; i < numbers.length;i++){
           System.out.print(numbers[i]+" ");
           sum+=numbers[i];
       }

       double average = sum/n;
       int count = 0;

       for(int i = 0 ; i < numbers.length;i++){
           if(numbers[i] > average){
               count++;
           }
       }

       System.out.println("\nAverage is "+average);
       System.out.println("Number of elements above the average is "+count);

       System.out.println("------------");
       //find max
       double maxNum = 0;
       for(int i = 0 ; i < numbers.length ;i++  ){
           if( numbers[i] > maxNum) {
               maxNum = numbers[i] ;
           }
       }
       System.out.println("Max value is "+ maxNum);

       //find min
       double minNum = 100 ;
       for(int i = 0 ; i < numbers.length;i++){
           if( minNum > numbers[i]){
               minNum = numbers[i];
           }
       }
       System.out.println("Min value is "+ minNum);



    }
}