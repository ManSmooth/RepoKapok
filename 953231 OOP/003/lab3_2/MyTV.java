// 642115003 Kan Katpark
public class MyTV {
    public static void main(String[] args) {
        TV myTV = new TV();
        System.out.println("TV status is "+ myTV.getFlag() +" CH.: "+ myTV.getChannel() + " VOL.: " + myTV.getVolume());
        
        // System.out.println("TV status is "+ myTV.getFlag() +" CH.: "+ myTV.getChannel() + " VOL.: " + myTV.getVolume());
        myTV.turnOn();
        myTV.setChannel(89);
        myTV.setVolume(20);

        
        //test error
        myTV.setChannel(800);
        myTV.raiseVolume();
        myTV.setVolume(0);
        myTV.lowVolume();

        System.out.println("TV status is "+ myTV.getFlag() +" CH.: "+ myTV.getChannel() + " VOL.: " + myTV.getVolume());
        myTV.turnOff();
    }
}
