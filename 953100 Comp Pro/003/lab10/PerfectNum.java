import java.util.Scanner ;
public class PerfectNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();

        boolean result = isPerfect(num);
        System.out.println("Number "+num + " is perfect? : "+result );
    }

    public static boolean isPerfect(int n){
        int temp = 0;
        if(n <= 0) return false;

        for(int i = 1 ; i<n; i++){
            if(n%i == 0){
                temp += i;
            }
        }

        if(temp == n){
            return true;
        }
        return false;
    }
}
