import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        int number = (int)(Math.random()*101);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100 and Input -1 if you want to stop playing. \n(Hint the number is " + number+")");
        System.out.print("Enter number in your mind: ");
        int guess = input.nextInt();

        //check and loop the number
        while(guess != number){
            if(guess == -1){
                break;
            }
            else if (guess > number){
                System.out.println("Your guess is too high");
            }
            else{
                System.out.println("Your guess is too low");
            }
            System.out.print("Enter number in your mind again: ");
            guess = input.nextInt();
        }
        
        System.out.println("Game has ended: the magic number is " + number +"  Thank you for playing");  
    } 
}
