import java.util.Scanner;
public class DivisionFiveSeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = input.nextInt();
        int count = 1 ;
        int line = 0;
        while(count <= num){
            if(count%5 == 0 ^ count%7 == 0 ){
                System.out.print(count+" ");
                line++;
                if(line%10 == 0){
                    System.out.println("");
                }
            }      
            count++;
        }
    }
}
