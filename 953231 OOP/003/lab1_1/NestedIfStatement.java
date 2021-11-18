// 642115003 Kan Katpark
import java.util.Scanner;
public class NestedIfStatement {
    public static void main(String[] arg){
        System.out.println("#############################");
        System.out.println("       Welcome to OOP Lab    ");
        System.out.println("           1. menu 1         ");
        System.out.println("           2. menu 2         ");
        System.out.println("           3. menu 3         ");
        System.out.println("           4. menu 4         ");
        System.out.println("           5. BYE BYE        ");
        System.out.println("#############################");
        System.out.print("Enter the number: ");
        
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        checkByIf(x);

    }

    public static void checkByIf(int x){
        if(x == 1){System.out.println("Welcome to menu 1");}
            else if(x == 2){System.out.println("Welcome to menu 2");}
            else if(x == 3){System.out.println("Welcome to menu 3");}
            else if(x == 4){System.out.println("Welcome to menu 4");}
            else{System.out.println("Bye bye, see you tomorrow.");}
    }

    public static void checkBySwitch(int x){
        switch (x) {
            case 1: 
                System.out.println("Welcome to menu 1");
                break;
        
            case 2:
                System.out.println("Welcome to menu 2");
                break;
            
            case 3:
                System.out.println("Welcome to menu 3");
                break;
            
            case 4:
                System.out.println("Welcome to menu 4");
                break;
            case 5:
                System.out.println("Bye bye, see you tomorrow.");
            default:
                break;
        }
    }

}
