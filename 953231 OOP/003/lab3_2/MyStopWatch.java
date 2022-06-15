// 642115003 Kan Katpark

public class MyStopWatch {
    public static void main(String[] args) {
        
        StopWatch myWatch = new StopWatch();
        myWatch.start();

        for(int i = 0 ; i < 100000;i++){
            System.out.println(i);
        }
        myWatch.stop();

        System.out.println("Runtime : " + myWatch.getElapsedTime() + " milisecs");
    }
}
