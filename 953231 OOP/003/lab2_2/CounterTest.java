//642115003 Kan Katpark
public class CounterTest {
    public static void main(String[] args) {
        Counter door1 = new Counter();
        Counter door2 = new Counter();

        for(int i =1;i<9;i++){
            door1.click();
            if( i%2 == 0) door2.click();
        }
        
        System.out.println("GET COUNT OF Door 1 : " + door1.getCount() );
        System.out.println("GET COUNT OF Door 2 : " + door2.getCount() );
        door1.resetCount();
        System.out.println("GET COUNT OF Door 1 AFTER RESET : " + door1.getCount() );
    }
}
