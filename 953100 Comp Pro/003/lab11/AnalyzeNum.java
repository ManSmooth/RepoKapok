public class AnalyzeNum{
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

        printNum(numbers);

        System.out.println("Max value is "+ findMax(numbers));

        

        System.out.println("Min value is "+ findMin(numbers));

     }

     //find max
     public static double findMax(double[] arr){
        double maxNum = 0;
        for(int i = 0 ; i < arr.length ;i++  ){
            if( arr[i] > maxNum) {
                maxNum = arr[i] ;
            }
        }
        return maxNum;
     }
     //find min
     public static double findMin(double[] arr){
        double minNum = 100 ;
        for(int i = 0 ; i < arr.length;i++){
            if( minNum > arr[i]){
                minNum = arr[i];
            }
        }
        return minNum ;
     }

     //print num
     public static void printNum(double[] arr){
         for(int i =0;i< arr.length;i++){
             System.out.print(arr[i]+" ");
         }
         System.out.println();
     }

}