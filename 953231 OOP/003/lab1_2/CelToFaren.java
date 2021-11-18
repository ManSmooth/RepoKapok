public class CelToFaren{
    public static void main(String[] args){
        int c = 40;
        System.out.println("Celsius   Fahrenheit");
        while(c < 81){
            System.out.println(c+" \t   "+cToF(c));
            c +=5;
        }
    }

    public static int cToF(int c){
        return (int)((9.0/5.0)*c + 32);
    }

}